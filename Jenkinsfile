pipeline {
    agent any
    stages {
        stage ('Test data preparation') {

            steps {
                withMaven(maven : 'Maven setup') {
                
                    bat 'mvn test'
                    
                }
            }
        }
        
    }
}