pipeline {
    agent any
    
    environment {
        DOCKER_REGISTRY = 'your-registry'
    }
    
    stages {
        stage('Build') {
            steps {
                sh 'docker-compose build'
            }
        }
        
        stage('Test') {
            steps {
                sh 'docker-compose run --rm api-gateway mvn test'
                // Add test commands for other services
            }
        }
        
        stage('Push Images') {
            steps {
                script {
                    docker.withRegistry("https://${DOCKER_REGISTRY}") {
                        docker.image('api-gateway').push()
                        docker.image('identity-service').push()
                        docker.image('hotel-service').push()
                        docker.image('booking-service').push()
                        docker.image('payment-service').push()
                    }
                }
            }
        }
        
        stage('Deploy') {
            steps {
                sh 'docker-compose -f docker-compose.prod.yml up -d'
            }
        }
    }
    
    post {
        always {
            cleanWs()
        }
        success {
            echo 'Pipeline completed successfully!'
        }
        failure {
            echo 'Pipeline failed!'
        }
    }
} 