pipeline {
    agent any
    stages {
        
        
        stage ('Test data preparation')
        {

            steps {
                withMaven(maven : 'Maven setup') {
                
                    sh 'mvn test  -Dcucumber.options="--tags @TestData"'
                    
                       }
                }
            
         }
         
          stage ('Test Execution')
        {

            steps {
                withMaven(maven : 'Maven setup') {
                
                    sh 'mvn test -Dcucumber.options="--tags @sanity"'
                    
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
