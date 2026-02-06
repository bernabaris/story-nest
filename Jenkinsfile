node {

    stage('Checkout') {
        checkout scm
    }

    stage('Build') {
        withEnv([
            "JAVA_HOME=${tool 'jdk17'}",
            "PATH+MAVEN=${tool 'maven3'}/bin"
        ]) {
            dir('backend') {
                sh 'mvn clean package -DskipTests'
            }
        }
    }

    stage('Docker Build') {
        dir('backend') {
            sh 'docker build -t backend:latest .'
        }
    }

    stage('Archive Artifact') {
        archiveArtifacts artifacts: 'backend/target/*.jar', fingerprint: true
    }

    echo '✅ Build + Docker image completed'
}
