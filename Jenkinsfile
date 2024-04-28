pipeline {
    agent any
    
    stages {
        stage ('checkout') {
            steps {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/rajeshs-raju/DevOpsAssignment.git']])
            }
        }
        stage('Check Environment Variables') {
            steps {
                bat 'set'
            }
        }
         stage ('Build & Compile') {
            steps {
                bat 'java --version'
                bat 'javac src/CalculatorFeature.java'
                bat 'javac -cp src src/CalculatorFeatureTest.java'
            }
        }
        stage ('Test') {
            steps {
                bat 'java -cp src CalculatorFeatureTest'
            }
        }
        
         stage ('Post Build') {
            steps {
                cleanWs()
            }
        }
        
         
    }
}
