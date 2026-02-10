node {

    stage('Checkout') {
        deleteDir()
        checkout scm
    }

    stage('Build') {
        dir('backend') {
            sh 'docker build -t backend:latest .'
        }
    }

    echo 'Build + Docker image completed'
}
