@Library('jenkins-shared-library') _  // Load the shared library

pipeline {
    agent any

    stages {
        stage('Greeting') {
            steps {
                hello('Developer')  // Call the hello.groovy function
            }
        }

        stage('Build & Test') {
            steps {
                buildProject()  // Call the build function
            }
        }

        stage('Deploy') {
            steps {
                deployApp('production')  // Deploy to production
            }
        }
    }
}
