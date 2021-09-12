node {
   properties(
   
    [parameters([
    
    
        choice(choices: ["ecp-prelive", "capdev628", "capdev472"].join("\n"),description: 'Some choice parameter', name: 'test.environment'),
        string(name: 'branch', defaultValue: 'master', description: 'The target environment', ),
        string(name: 'outbound', defaultValue: '40', description: 'The targetSSS environment', ),
        string(name: 'cucumber.options', defaultValue: '--tags @Sanity', description: 'The targetSSS environment', ),
        choice(choices: ["dektop", "tab", "mob"].join("\n"),description: 'Some choice parameter', name: 'test.device')
        
        ])
     ]
    

		)
    
    echo "##############################################"
     params.each {param ->
     println "${param.key} -> ${param.value} "}
    echo "##############################################"
    
    // echo "mvn clean install -Dcucumber.options="--tags @Sanity"'
    
  
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
   
   