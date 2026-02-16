node {

    def HELM_RELEASE = "backend"
    def HELM_CHART_PATH = "charts/backend"
    def KUBECONFIG_PATH = "${HOME}/.kube/config"

    stage('Checkout') {
        deleteDir()
        checkout scm
    }

    stage('Verify Kubernetes connection') {
        withEnv(["KUBECONFIG=${KUBECONFIG_PATH}"]) {
            sh 'kubectl get nodes'
        }
    }

    stage('Deploy with Helm') {
        withEnv(["KUBECONFIG=${KUBECONFIG_PATH}"]) {
            sh """
                helm upgrade --install ${HELM_RELEASE} ${HELM_CHART_PATH} \
                --namespace default \
                --create-namespace
            """
        }
    }

    stage('Verify Deployment') {
        withEnv(["KUBECONFIG=${KUBECONFIG_PATH}"]) {
            sh 'kubectl get pods -o wide'
            sh 'kubectl get svc'
        }
    }

    echo 'Deployment completed successfully!'
}
