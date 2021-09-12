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

   echo "PARAMETERS"
   echo "=========="
   echo getBinding().getVariables().getClass().getName()
   def myvariables = getBinding().getVariables()
   for (v in myvariables) {
       echo "${v} " + myvariables.get(v)
   }
   echo STRING_PARAM1.getClass().getName()
   
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
   
   