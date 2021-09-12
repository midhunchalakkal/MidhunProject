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
     def test44=""
     params.each {
     param ->
     println "${param.key} -> ${param.value} "
     def test12="-D${param.key}=${param.value} "
     test44=test44+test12
     }
    
   
 
   }






pipeline {
    agent any
    stages {
        
        
        stage ('Test data preparation') 
        {

            steps {
                withMaven(maven : 'Maven setup') {
                
                echo "##############################################"
   				 echo test44
                
                    sh 'mvn test -Dcucumber.options="--tags @TestData"'
                    
                       }
                }
            
         }
         
   }
}