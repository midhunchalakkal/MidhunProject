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
                 [$class: 'TextParameterDefinition', defaultValue: '--tags @TestData', description: 'Tag', name: 'Tag']
                ])
                echo ("environment : "+userInput['environment'])
                echo ("Tag : "+userInput['Tag'])

                }
                
                 echo ("'mvn test -Dcucumber.options="+userInput['Tag']+"'")
                 
                 
                withMaven(maven : 'Maven setup') {
                
                    sh "'mvn test -Dcucumber.options="+userInput['Tag']+"'"
                    
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