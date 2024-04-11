pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/vrun545/Jenkins_Demo.git'
            }
        }
        stage('Build') {
            steps {
                
                bat 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                // Run demo test cases for the application
                // You need to replace 'YourTestCommandHere' with the actual test command
                bat 'YourTestCommandHere'
            }
        }
        stage('Deployment') {
            steps {
                // Deploy the application to the chosen target
                // You need to replace 'YourDeploymentCommandHere' with the actual deployment command
                bat 'YourDeploymentCommandHere'
            }
        }
        stage('Clean up') {
            steps {
                // Clean up any temporary files or resources used during the pipeline execution
                // You need to replace 'YourCleanupCommandHere' with the actual cleanup command
                bat 'YourCleanupCommandHere'
            }
        }
    }
}
