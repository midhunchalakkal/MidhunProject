pipeline {
    agent any
    stages {
        
        
        stage("Interactive_Input") {
            steps {
                script {
                def userInput = input(
                 id: 'userInput', message: 'Enter path of test reports:?', 
                 parameters: [
                 [$class: 'TextParameterDefinition', defaultValue: 'None', description: 'Path of config file', name: 'Config'],
                 [$class: 'TextParameterDefinition', defaultValue: 'None', description: 'Test Info file', name: 'Test']
                ])
                echo ("IQA Sheet Path: "+userInput['Config'])
                echo ("Test Info file path: "+userInput['Test'])

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