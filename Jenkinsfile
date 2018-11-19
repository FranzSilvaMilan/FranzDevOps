pipeline{
	agent any

	stages{
		stage('Build'){
			steps{
				echo 'Building'
				sh '''
		chmod +x quickstart/gradlew
		./quickstart/gradlew clean assemble -p quickstart/
		'''
			}
		}
		stage('Test'){
			steps{
				echo 'Testing'
				sh './quickstart/gradlew clean test jacocoTestReport -p quickstart/'
				junit '**/test-results/test/*.xml'
			}
		}
		stage('Publish'){
			steps{
				echo 'Publishing'
				sh './gradlew uploadArchives'
				archiveArtifacts artifacts: '**/repos/*.jar'
			}
		}
	}
}