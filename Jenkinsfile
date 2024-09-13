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
                    emailext(
                        mail to: "omamashakhli2@gmail.com",
                        subject: "Unit and Integration Tests Successful",
                        body: "Unit and Integration Tests were Successful!"
                        attachLog: true
                        )
                }
               faliure{
                   emailext(
                        mail to: "omamashakhli2@gmail.com",
                        subject: "Unit and Integration Tests Failed",
                        body: "Unit and Integration Tests have Failed!"
                        attachLog: true
                       )
                }
            }
        }

        stage('Code Analysis') {
            steps {
                echo "Analysing code with SonarQube"
            }
        }
        
        stage('Security Scan') {
            steps {
                echo "Performing Security Scan using OWASP ZAP"
            }
            post{
                success{
                    emailext(
                        mail to: "omamashakhli2@gmail.com",
                        subject: "Security Scan Successful",
                        body: "Security Scan was Successful!"
                        attachLog: true
                        )
                }
               faliure{
                   emailext(
                        mail to: "omamashakhli2@gmail.com",
                        subject: "Secuirty Scan Failed",
                        body: "Secuirty Scan has Failed!"
                        attachLog: true
                       )
                }
            }
        }
        
        stage('Deploy to Staging') {
            steps {
                echo "Deploying to Staging Environment AWS EC2 instance"
            }
        }
        
        stage('Integration Tests on Staging') {
            steps {
                echo "Running Integration tests on staging environment"
            }
        }

        stage('Deploy to Production') {
            steps {
                echo "Deploying to Staging Environment AWS EC2 instance"
            }
        }
}

