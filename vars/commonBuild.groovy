def call() {
    node {
        stage('Checkout') {
            checkout scm
        }

        stage('Unit Tests') {
            echo 'Running unit tests...'
            sh './gradlew test'
        }

        stage('Deploy') {
            echo 'Deploying to environment...'
            // Add actual deployment logic here
        }
    }
}

