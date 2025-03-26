def call() {
    stage('Build') {
        echo "Building the project..."
        sh 'mvn clean package'
    }

    stage('Test') {
        echo "Running tests..."
        sh 'mvn test'
    }
}
