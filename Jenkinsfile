pipeline {
  agent any
  tools {
	  maven ‘Maven’
  }
  stages {
    stage('build') {
      when {
        expression {
          BRANCH_NAME == 'main' && CODE_CHANGES == true
        }
      }
      steps {
		echo 'Building application...'
	      	sh "mvn install"
      }
    }
    stage(‘deploy’) {
      steps {
		echo 'Deploying application…'
    		withCredentials ([
			    usernamePassword(credentials: ‘server_credentials’, usernameVariable: User, passwordVariable: PWD)
    		]) {
		    	sh “some script ${USER} ${PWD}”
    		}
      }
    }
  }
