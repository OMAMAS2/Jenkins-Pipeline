pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo "Fetch the source code from the directory path"
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
        
        stage('Deploy') {
            steps {
                echo "Deploy the application to a testing environment"
                }
            }
        }
    }
}
