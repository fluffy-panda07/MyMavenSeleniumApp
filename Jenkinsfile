pipeline{
	agent any
	tools{
		maven 'Maven'}
	stages{
		stage('Checkout'){
			steps{ git branch:'master',url:'https://github.com/fluffy-panda07/MyMavenSeleniumApp.git'}
			}
		stage('Build'){
			steps{ sh 'mvn clean package'}
			}
		stage('Test'){
			steps{ sh 'mvn test'}
			}
		stage('Generate Test Report'){
			steps{ junit 'target/surefire-report/*.xml'
			}}
		}
	post{
		success{ echo 'Build and deployment successfully'}
		failure{ echo 'Build failed!'}
		always{
			archiveArtifacts artifacts: 'target/**/*.html',allowEmptyArchive:true}
			}
			}
			
