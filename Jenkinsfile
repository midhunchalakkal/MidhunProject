node {
   properties(
   
    [parameters([
    
    
        choice(choices: ["ecp-prelive", "capdev628", "capdev472"].join("\n"),description: 'Some choice parameter', name: 'test.environment'),
        string(name: 'branch', defaultValue: 'master', description: 'The target environment', ),
        string(name: 'outbound', defaultValue: '40', description: 'The targetSSS environment', ),
        choice(choices: ["dektop", "tab", "mob"].join("\n"),description: 'Some choice parameter', name: 'test.device')
        
        ])
     ]
    

		)
    
      // echo "Will deploy to ${params.test.environment}"
     // echo "Will deploy to ${params.test.device}"
      // echo "Will deploy to ${params.branch}"
     //  echo "Will deploy to ${params.outbound}"
   }
   
   
   
pipeline {
    agent any
    stages {
        
        
    
         
          stage ("PARAMS") 
        {
            steps {
             script {
             
                   // echo "############### ${params.test.environment}"
       				//echo "############### ${params.(test.device)}"
       				echo "############### ${params.branch}"
       				echo "############### ${params.outbound}"
     
                  }
       
               }
         }
         
         
    
         
       
   }
}
   
   