pipeline {
  agent any

    stages {
       stage ('Build') {
         steps {
           echo 'Building'
				sh '''
		    chmod +x webapplication/gradlew
		    ./webapplication/gradlew clean assemble -p webapplication/
        ./webapplication/gradlew uploadArchives -p webapplication
		    '''
        archiveArtifacts artifacts: '**/repos/*.war'
         }
       }
       stage ('Testing') {
         steps {
           echo 'Testing'
           sh './webapplication/gradlew test -p webapplication'
           junit 'build/test-results/test/*.xml'
        publishHTML([allowMissing: true,
           alwaysLinkToLastBuild: false,
           keepAll: true,
           reportDir: 'build/reports/tests/test',
           reportFiles: 'index.html',
           reportTitles: "webApp Report",
           reportName: 'WebAppJunitReport'])
         }
       }
       stage ('Security') {
         steps {
           echo 'security..'
           sh './webapplication/gradlew sonarqube -p webapplication'
           sh './webapplication/gradlew dependencyCheckAnalyze -p webapplication'
           archiveArtifacts artifacts: '**/repos/*.html'
         }
       }
       stage ('Deploy') {
         steps {
           echo 'Deploying'
           sh './webapplication/gradlew -b deploy.gradle copyWar -p webapplication'
         }
       }
    }
}
