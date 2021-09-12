node {
   properties([
  parameters([
    string(name: 'DEPLOY_ENV', defaultValue: 'TESTING', description: 'The target environment', )
   ])
])
  
   }
   
   
      stage ("PRINT") 
        {
            steps {
             script {
             			echo "Will deploy to ${params.DEPLOY_ENV}"
     
                  }
       
               }
         }
         
   