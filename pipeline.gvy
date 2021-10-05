pipeline {
  agent any
 
		stage('Build')
		{
			echo "Building the Project……."
		}
		stage('Test')
		{
			echo "Testing the Project……."
		}
		stage('Deploy')
		{
			echo "Deploying the Project……."
		}
		stage('Release')
		{
			echo "Releasing the Project…….!"
		}
}
    
   
