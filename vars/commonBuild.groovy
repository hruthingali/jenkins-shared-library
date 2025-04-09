def call() {
    stage('Checkout') {
        checkout scm
    }
    stage('Unit Tests') {
        echo 'Running unit tests...'
        sh './gradlew test'
    }
    stage('Deploy') {
        echo 'Deploying to environment...'
        // Replace this with actual deploy logic, e.g.:
        // sh './deploy.sh'
    }
}
