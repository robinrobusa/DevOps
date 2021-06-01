def buildApp() {
  echo 'Building the application using groovy...'
  bat "mvn clean"
}

def testApp() {
  echo 'Testing the application using groovy...'
  bat "mvn test"
}

def deployApp() {
  echo 'Deploying the application using groovy...'
  echo 'Deploying versiob ${params.VERSION}'
  
}

