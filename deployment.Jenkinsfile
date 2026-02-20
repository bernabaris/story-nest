node {

    def HELM_CHART_PATH = "charts/story-nest"

    stage('Checkout') {
        deleteDir()
        checkout scm
    }

    stage('Verify Kubernetes connection') {
        sh 'kubectl get nodes'
    }

    stage('Deploy with Helm') {
        dir(HELM_CHART_PATH) {
            sh 'helmfile apply'
        }
    }

    stage('Verify Deployment') {
        sh 'kubectl get pods -o wide'
        sh 'kubectl get svc'
    }

    echo 'Deployment completed successfully!'
}
