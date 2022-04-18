pipeline {
    agent {
        kubernetes(helloWorld.dayOfWeek(["Jerry", "Long", "Dustin", "Dustin"]))
      }
    stages {
        stage('Hello') {
            steps {
                sh 'Groovy --version'
            }
        }
    }
}
