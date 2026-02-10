node {

    stage('Checkout') {
        checkout scm
    }

    stage('Build') {
        dir('backend') {
            sh 'docker build -t backend:latest .'
        }
    }

    stage('Archive Artifact') {
        archiveArtifacts artifacts: 'backend/target/*.jar', fingerprint: true
    }

    echo '✅ Build + Docker image completed'
}
