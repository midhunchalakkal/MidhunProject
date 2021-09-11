pipeline {
    agent any
    stages {
        
        
        stage("Interactive_Input") {
            steps {
                script {
                def userInput = input(
                 id: 'userInput', message: 'Enter path of test reports:?', 
                 parameters: [
                 [$class: 'TextParameterDefinition', defaultValue: 'prelive', description: 'environment', name: 'environment'],
                 [$class: 'TextParameterDefinition', defaultValue: 'testlive123', description: 'environment123', name: 'Test']
                ])
                echo ("IQA Sheet Path: "+userInput['Config'])
                echo ("Test Info file path: "+userInput['Test'])

                }
                
                withMaven(maven : 'Maven setup') {
                
                    sh 'mvn test -Dcucumber.options="--tags @TestData"'
                    
                 }
                       
                       
            }
        }
         
        stage ('Test data preparation') 
        {

            steps {
                withMaven(maven : 'Maven setup') {
                
                    sh 'mvn test -Dcucumber.options="--tags @TestData"'
                    
                       }
                }
            
         }
         
          stage ('Cucumber Reports') {

            steps {
                    cucumber buildStatus: "UNSTABLE",
                    fileIncludePattern: "**/cucumber.json",
                    jsonReportDirectory: 'target'

            }
            }
     
   }
}