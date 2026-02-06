node {

    stage('Checkout') {
        checkout scm
    }

    stage('Build') {
        withEnv([
            "JAVA_HOME=${tool 'jdk17'}",
            "PATH+MAVEN=${tool 'maven3'}/bin"
        ]) {
            sh 'mvn clean package -DskipTests'
        }
    }

    stage('Docker Build') {
        sh '''
          docker build -t backend:latest .
        '''
    }

    stage('Archive Artifact') {
        archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
    }

    echo '✅ Build + Docker image completed'
}
