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
                
                    sh 'mvn test -Dcucumber.options="--tags @sanity"'
                    
                       }
                }
            
         }
            
            
       {
			stage('Publish Reports') 
		   {
			echo "***** Publish Reports ***"
			step([
			$class: ‘CucumberReportPublisher’,
			failedFeaturesNumber: 0,
			failedScenariosNumber: 0,
			failedStepsNumber: 0,
			fileExcludePattern: ‘’,
			fileIncludePattern: '/*.json’,
			jsonReportDirectory: ‘testrun/reports’,
			parallelTesting: true,
			pendingStepsNumber: 0,
			skippedStepsNumber: 0,
			trendsLimit: 0,
			undefinedStepsNumber: 0,
			classifications: runClassifications
				])
			}
		} 
            
            
            
            
     }
         
     
   }
}