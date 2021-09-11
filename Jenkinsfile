pipeline {
    agent any
    stages {
        stage ('Test data preparation') {

            steps {
                withMaven(maven : 'Maven setup') {
                
                    sh 'mvn  cucumber.options=--tags '@sanity' test'
                    
                }
            }
        }
        
    }
}