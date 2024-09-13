pipeline {
    agent any
        stages {
            stage('Build') {
                steps {
                    echo "Building the code with Maven"
                }
            }
    
            stage('Unit and Integration Tests') {
                steps {
                    echo "Unit tests with JUnit5"
                    echo "Integration tests with Selenium"
                }
                post{
                    success{
                        mail to: "omamashakhli2@gmail.com",
                        subject: "Unit and Integration Tests Email",
                        body: "Unit and Integration Tests were Successful!"
                    }
                }
            }
        stage('Code Analysis') {
            steps {
                script {
                    echo 'Analysing code with SonarQube'
                }
            }
        }
        stage('Security Scan') {
            steps {
                script {
                    echo 'Security Scan using OWASP ZAP'
                }
            }
            post {
                success {
                    emailext(
                        subject: 'Security Scan Successful',
                        body: 'Security scan has been successful.',
                        to: 'omamashakhli2@gmail.com',
                        attachLog: true
                    )
                }
                failure {
                    emailext(
                        subject: 'Security Scan Failure',
                        body: 'Security scan has failed.',
                        to: 'omamashakhli2@gmail.com',
                        attachLog: true
                    )
                }
            }
        }
        stage('Deploy to Staging') {
            steps {
                script {
                    echo 'Deploying to Staging Environment AWS EC2 instance'
                }
            }
        }
        stage('Integration Tests on Staging') {
            steps {
                script {
                    echo 'Running Integration tests on staging environment'
                }
            }
        }
        stage('Deploy to Production') {
            steps {
                script {
                    echo 'Deploying to Staging Environment AWS EC2 instance'
                }
            }
        }
    }
    post {
        success {
            emailext(
                subject: 'Pipeline Success',
                body: 'Pipeline has been successful.',
                to: 'omamashakhli2@gmail.com',
                attachLog: true
            )
        }
        failure {
            emailext(
                subject: 'Pipeline Failure',
                body: 'Pipeline has failed.',
                to: 'omamashakhli2@gmail.com',
                attachLog: true
            )
        }
    }
}

