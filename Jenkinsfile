pipeline {
    agent any
    stages {
        stage ('Test data preparation') 
        {

            steps {
                withMaven(maven : 'Maven setup') {
                
                    sh 'mvn cleam install -Dcucumber.options="--tags @TestData"'
                    
                       }
                }
            
         }
         
          stage ("Change flght status") 
        {
            steps {
             script {
               env.EXECUTE = input message: 'Is Flight is cancelled ?',
                             parameters: [string(defaultValue: '',
                                          description: '',
                                          name: 'Yes')]
     
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
}