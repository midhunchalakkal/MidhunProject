pipeline {
    agent any
    stages {
        
        
        stage ('Test data preparation') 
        {

            steps {
                withMaven(maven : 'Maven setup') {
                
                    sh 'mvn clean install  -Dcucumber.options="--tags @TestData"'
                    
                       }
                }
            
         }
         
          stage ("Change flght status") 
        {
            steps {
             script {
               env.EXECUTE = input message: 'User input required',
                              parameters: [choice(name: 'EXECUTE', choices: 'Approved', description: 'Is Flight is cancelled ?')]
     
                  }
       
               }
         }
         
          stage ('Test Execution') 
        {

            steps {
                withMaven(maven : 'Maven setup') {
                
                    sh 'mvn clean install -Dcucumber.options="--tags @sanity"'
                    
                       }
                }
            
         }
     
   }
}