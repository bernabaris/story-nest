node {

    def DOCKER_REGISTRY = "192.168.1.51:9443"
    def IMAGE_NAME = "backend"
    def IMAGE_TAG = "latest"
    def FULL_IMAGE_NAME = "${DOCKER_REGISTRY}/${IMAGE_NAME}:${IMAGE_TAG}"

    stage('Checkout') {
        deleteDir()
        checkout scm
    }

    stage('Build Docker Image') {
        dir('backend') {
            sh """
                docker build -t ${IMAGE_NAME}:${IMAGE_TAG} .
            """
        }
    }

    stage('Tag Image') {
        sh """
            docker tag ${IMAGE_NAME}:${IMAGE_TAG} ${FULL_IMAGE_NAME}
        """
    }

    stage('Docker Login') {
        withCredentials([usernamePassword(
            credentialsId: 'nexus-docker-creds',
            usernameVariable: 'USERNAME',
            passwordVariable: 'PASSWORD'
        )]) {
            sh """
                echo \$PASSWORD | docker login ${DOCKER_REGISTRY} -u \$USERNAME --password-stdin
            """
        }
    }

    stage('Push Image') {
        sh """
            docker push ${FULL_IMAGE_NAME}
        """
    }

    stage('Cleanup') {
        sh """
            docker rmi ${FULL_IMAGE_NAME} || true
        """
    }

    echo 'Build and push to Nexus completed successfully'
}
