pipeline {
    agent any
    stages {
        stage('Clone') {
            steps {
                git 'https://github.com/gameplaybiel/alunos_restAPI.git'
            }
        }
        stage('Set Permissions') {
            steps {
                bat 'chmod +x ./gradlew'
            }
        }
        stage('Build') {
            steps {
                bat './gradlew build'
            }
        }
        stage('Run Tests') {
            steps {
                bat './gradlew test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
            }
        }
    }
    post {
        success {
            echo 'Build succeeded!'
        }
        failure {
            echo 'Build failed!'
        }
    }
}