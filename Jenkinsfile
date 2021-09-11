pipeline {
    agent any
    stages {
        stage ('Test data preparation') 
        {

            steps {
                withMaven(maven : 'Maven setup') {
                
                    sh 'mvn test -Dcucumber.options="--tags @TestData"'
                    
                       }
                }
            
         }
         
          stage ("Prompt for input") 
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
                
                    sh 'mvn test -Dcucumber.options="--tags @sanity"'
                    
                       }
                }
            
         }
         
        
       
    }
}