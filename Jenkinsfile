pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                script {
                    echo 'Building the code with Maven'
                }
            }
        }
        stage('Unit and Integration Tests') {
            steps {
                script {
                    echo 'Unit tests with JUnit5'
                    echo 'Integration tests with Selenium'
                }
            }
            post {
                success {
                    emailext(
                        subject: 'Unit and Integration Tests Successful',
                        body: 'Unit and integration tests have been successful.',
                        to: 'oshakhli@deakin.edu.au',
                        attachLog: true
                    )
                }
                failure {
                    emailext(
                        subject: 'Unit and Integration Tests Failure',
                        body: 'Unit and integration tests have failed.',
                        to: 'oshakhli@deakin.edu.au',
                        attachLog: true
                    )
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

