pipeline {
  agent any
  
  stages {
    stage('build') {
      when {
        expression {
          BRANCH_NAME == 'main' && CODE_CHANGES == true
        }
      }
      steps {
		echo 'Building application...'

      }
    }
    stage(‘deploy’) {
      steps {
		echo 'Deploying application…'
    		withCredentials ([
			    usernamePassword(credentials: ‘server_credentials’, usernameVariable: User, passwordVariable: PWD)
    		]) 
      }
    }
  }
}
