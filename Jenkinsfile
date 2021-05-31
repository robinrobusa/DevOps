pipeline {
  agent any  
  stages {
    stage('build') {
      when {
        expression {
          BRANCH_NAME == 'main'
        }
      }
      steps {
        echo 'Building application...'
      }
    }
    stage(‘deploy’) {
      steps {
        echo 'Deploying application…'
      }
    }
  }
}
