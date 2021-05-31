pipeline {
  agent any 
  parameters {
    choice(name: 'VERSION', choices: ['1.1.0','1.2.0','1.3.0'], description: '')
    booleanParam(name: 'executeTests', defaultValue: true, description: '')
  } 
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
    stage(test’) {
      when {
        expression {
          params.executeTests
        }
      }
      steps {
        echo 'Testing the application…'
      }
    }
    stage(‘deploy’) {
      steps {
        echo 'Deploying application…'
        echo 'Deploying versiob ${VERSION}'
      }
    }
  }
}
