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
                echo "Analysing code with Jenkins"
            }
        }
        
        stage('Security Scan') {
            steps {
                echo "Performing Security Scan using Burp Suite"
            }
            post{
                success{
                    mail to: "omamashakhli2@gmail.com",
                    subject: "Security Scan Email",
                    body: "Security Scan was Successful!"
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
                echo "Running Integration tests on staging Jenkins"
            }
        }

        stage('Deploy to Production') {
            steps {
                echo "Deploying to Staging Environment AWS EC2 instance"
            }
        }
    }
}

