def buildApp() {
  echo 'Building the application using groovy...'
}

def testApp() {
  echo 'Testing the application using groovy...'
}

def deployApp() {
  echo 'Deploying the application using groovy...'
  echo 'Deploying versiob ${params.VERSION}'
}

return this
