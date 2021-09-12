node {
   properties(
   
    [parameters([
    
    
        string(name: 'USERNAME', defaultValue: 'TESTING', description: 'The target environment', ),
        string(name: 'PASSWORD', defaultValue: 'TSSESTING', description: 'The targetSSS environment', ),
        choice(choices: ["DESKTOP", "TAB", "MOB"].join("\n"),description: 'Some choice parameter', name: 'SOME_CHOICE'),
        booleanParam(defaultValue: false,description: 'isFoo should be false',name: 'isFoo')
        
        ])
     ]
    

		)
    
     echo "Will deploy to ${params.USERNAME}"
   }
   
   
   
pipeline {
    agent any
    stages {
        
        
    
         
          stage ("PARAMS") 
        {
            steps {
             script {
             
                   echo "Now we are getting the value  ${params.USERNAME}"
     
                  }
       
               }
         }
         
         
            stage ('Test data preparation') 
        {

            steps {
                withMaven(maven : 'Maven setup') {
                
                    sh 'mvn clean install  -Dcucumber.options="--tags @TestData" '
                    
                       }
                }
            
         }
         
         
       
   }
}
   
   