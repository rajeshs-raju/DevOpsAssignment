pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from the repository
                git 'https://github.com/rajeshs-raju/DevOpsAssignment.git'
            }
        }

        stage('Build') {
            steps {
                // Install dependencies (if needed)
                sh 'pytest'
            }
        }

        stage('Test') {
            steps {
                // Run tests
                sh 'pytest'
            }
        }
    }

    post {
        success {
            echo 'Build and test successful!'
        }
        failure {
            echo 'Build or test failed!'
        }
    }
}

