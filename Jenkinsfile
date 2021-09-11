node() {
   // adds job parameters within jenkinsfile
   properties([
     parameters([
       stringParam(
         defaultValue: dasda,
         description: 'environment rfgsgs',
         name: 'environment'
       ),
       stringParam(
         defaultValue: '10',
         description: 'threadCount srfgsd',
         name: 'threadCount'
       ),
     ])
   ])

   // test the false value
   print 'DEBUG: parameter isFoo = ' + params.environment
   print "DEBUG: parameter isFoo = ${params.environment}"
   sh "echo sh environment is ${params.environment}"
   if (params.environment) { print "THIS SHOULD NOT DISPLAY" }

   // test the true value
   print 'DEBUG: parameter threadCount = ' + params.threadCount
   print "DEBUG: parameter threadCount = ${params.threadCount}"
   sh "echo sh threadCount is ${params.threadCount}"
   if (params.threadCount) { print "this should display" }
}
