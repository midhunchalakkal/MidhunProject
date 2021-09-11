pipeline {
    agent any
    stages {
        stage ('Test data preparation') {

            steps {
                withMaven(maven : 'Maven setup') {
                
                    sh 'mvn test -Dcucumber.options="--tags '@TestData'"'
                    
                }
            }
        }
        
    }
}