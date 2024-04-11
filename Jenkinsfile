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
                        bat "mvn -D clean test"
                    }

                    post {
                        success {
                           publishHTML([
                               allowMissing: false,
                               alwaysLinkToLastBuild: false,
                               keepAll: false,
                               reportDir: 'target/surefire-reports/',
                               reportFiles: 'emailable-report.html',
                               reportName: 'HTML Report',
                               reportTitles: '',
                               useWrapperFileDirectly: true])
                        }
                    }
        stage('Deployment') {
            steps {
                echo 'Deployment is done'
            }
        }
        stage('Clean up') {
            steps {
                echo 'Clean up is done'
            }
        }
    }
}
