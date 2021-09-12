node {
   properties(
   
    [parameters([
    
    
        choice(choices: ["ecp-prelive", "capdev628", "capdev472"].join("\n"),description: 'Some choice parameter', name: 'test.environment'),
        string(name: 'branch', defaultValue: 'master', description: 'The target environment', ),
        string(name: 'outbound', defaultValue: '40', description: 'The targetSSS environment', ),
        string(name: 'cucumber.options', defaultValue: '"--tags @Sanity"', description: 'The targetSSS environment', ),
        choice(choices: ["dektop", "tab", "mob"].join("\n"),description: 'Some choice parameter', name: 'test.device')
        
        ])
     ]
    

		)
    
    echo "##############################################"
     def test=""
     params.each {
     param ->
     println "${param.key} -> ${param.value} "
     def test12="-D${param.key}=${param.value} "
     test=test+test12
     }
    echo "##############################################"
    echo test
   
  
   }
   
   
   
pipeline {
    agent any
    stages {
        
        
    
         
           stage ('Test Execution') 
        {

            steps {
                withMaven(maven : 'Maven setup') {
                
                    sh 'mvn clean install -Dcucumber.options="--tags @TestData"'
                    
                       }
                }
            
         }
            
         }

         
    
         
       
   }
}
   
   