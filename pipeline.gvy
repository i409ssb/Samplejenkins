pipeline {
  agent any
	stages {
		stage('Build') {
			echo "Building the Project……."
			cal
		}
		stage('Test') {
			echo "Testing the Project……."
			cal
		}
		stage('Deploy') {
			echo "Deploying the Project……."
		}
		stage('Release') {
			echo "Releasing the Project…….!"
		}
	}
}
   

