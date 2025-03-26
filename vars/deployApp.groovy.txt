def call(String environment = 'staging') {
    stage('Deploy') {
        echo "Deploying application to ${environment}..."
        sh "echo Deploying to ${environment} server"
    }
}
