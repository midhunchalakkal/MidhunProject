node {
   properties(
   
   [parameters([string(name: 'DEPLOY_ENV', defaultValue: 'TESTING', description: 'The target environment', )])]
   
   [parameters([choice(choices: ["A", "B", "C"].join("\n"),description: 'Some choice parameter',name: 'SOME_CHOICE')])]

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
   
   