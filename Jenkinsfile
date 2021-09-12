node {
   properties(
   
    [parameters([
    
    
        string(name: 'DEPLOY_ENV', defaultValue: 'TESTING', description: 'The target environment', ),
        string(name: 'DEPLOY_ENSSSV', defaultValue: 'TSSESTING', description: 'The targetSSS environment', ),
        choice(choices: ["A", "B", "C"].join("\n"),description: 'Some choice parameter', name: 'SOME_CHOICE'),
        booleanParam(defaultValue: false,description: 'isFoo should be false',name: 'isFoo')
        
        ])
     ]
    

		)
    
     echo "Will deploy to ${params.DEPLOY_ENV}"
   }
   
   
   
pipeline {
    agent any
    stages {
        
        
    
         
          stage ("PARAMS") 
        {
            steps {
             script {
             
                   echo "Now we are getting the value  ${params.DEPLOY_ENV}"
     
                  }
       
               }
         }
         
       
   }
}
   
   