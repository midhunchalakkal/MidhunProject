node {
   properties(
   
    [parameters([
    
    
        choice(choices: ["ecp-prelive", "capdev628", "capdev472"].join("\n"),description: 'Some choice parameter', name: 'test.environment')
        string(name: 'branch', defaultValue: 'master', description: 'The target environment', ),
        string(name: 'outbound', defaultValue: '40', description: 'The targetSSS environment', ),
        choice(choices: ["dektop", "tab", "mob"].join("\n"),description: 'Some choice parameter', name: 'test.device')
        
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
   
   