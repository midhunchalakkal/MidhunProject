node {
   properties(
   
    [parameters([
    
    
        string(name: 'DEPLOY_ENV', defaultValue: 'TESTING', description: 'The target environment', ),
        string(name: 'DEPLOY_ENSSSV', defaultValue: 'TSSESTING', description: 'The targetSSS environment', )
        
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
   
   