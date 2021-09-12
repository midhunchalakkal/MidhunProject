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
    
    echo "I am a "+getClass().getName()
     echo getBinding().getVariables().getClass().getName()
    
    def myvariables = getBinding().getVariables()
    echo "outsode for loop "
   for (v in myvariables) {
     echo "inside for loop "
       echo "${v} " + myvariables.get(v)
   }
    echo "outsode2 for loop "
   }
   
   
   
pipeline {
    agent any
    stages {
        
        
    
         
          stage ("PARAMS") 
        {
            steps {
             script {
             
                   // echo "############### ${params.test.environment}"
       				//echo "############### ${params.[test.device]}"
       				echo "############### ${params.branch}"
       				echo "############### ${params.outbound}"
     
                  }
       
               }
         }
         
         
    
         
       
   }
}
   
   