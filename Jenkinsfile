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
                echo "Unit tests with JUnit"
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

        stage('Code Analysis") {
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
                    mail to: "omamashakhli2@gmail.com",
                    subject: "Security Scan Email",
                    body: "Security Scan was Successful!"
                }
            }
        }
    }
}

