pipeline {
  agent any

    stages {
       stage ('Build') {
         steps {
           echo 'Building'
				sh '''
		chmod +x quickstart/gradlew
		./quickstart/gradlew clean assemble -p quickstart/
		'''
         }
       }
       stage ('Testing') {
         steps {
           echo 'Testing'
           sh './quickstart/gradlew test -p quickstart'
           junit '**/build/test-results/test/*.xml'
         }
       }
       stage ('Publish') {
         steps {
           echo 'Publishing'
           sh './quickstart/gradlew uploadArchives -p quickstart'
           archiveArtifacts artifacts: '**/repos/*.jar'
         }
       }
    }
}