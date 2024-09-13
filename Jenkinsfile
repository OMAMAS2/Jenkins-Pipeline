pipeline {
    agent any
    stages {
        stage('Test Email') {
            steps {
                script {
                    emailext(
                        subject: 'Test Email',
                        body: 'This is a test email to verify email settings.',
                        to: 'omamashakhli2@gmail.com',
                        attachLog: true
                    )
                }
            }
        }
    }
}



