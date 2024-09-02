pipeline {
    agent any
    
    environment {
        DIRECTORY_PATH = 'C:\\Users\\omama\\Jenkins'
        TESTING_ENVIRONMENT = 'PipilineTest1'
        PRODUCTION_ENVIRONMENT = 'OmamaS'
    }

    stages {
        stage('Build') {
            steps {
                echo "Fetch the source code from the directory path specified by the environment variable: ${env.DIRECTORY_PATH}"
                echo "Compile the code and generate any necessary artifacts"
            }
            post{
                success{
                    mail to: "omamashakhli2@gmail.com",
                    subject: "Build Status Email",
                    body: "Build was Successful!"
            }
        }
        
        stage('Test') {
            steps {
                echo "Unit tests"
                echo "Integration tests"
            }
        }
        
        stage('Code Quality Check') {
            steps {
                echo "Check the quality of the code"
            }
        }
        
        stage('Deploy') {
            steps {
                echo "Deploy the application to a testing environment specified by the environment variable: ${env.TESTING_ENVIRONMENT}"
            }
        }
        
        stage('Approval') {
            steps {
                sleep(time: 10, unit: 'SECONDS')
            }
        }
        
        stage('Deploy to Production') {
            steps {
                echo "Deploy the code to the production environment specified by the environment variable: ${env.PRODUCTION_ENVIRONMENT}"
            }
        }
    }
}
