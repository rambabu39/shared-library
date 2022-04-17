pipeline {
    agent {
        kubernetes(helloWorld.dayOfWeek(["Jerry", "Long", "Dustin", "Dustin"]))
      }
    stages {
        stage('Hello') {
            steps {
                script{
                    helloWorld.dayOfWeek(["Jerry", "Long", "Dustin", "Dustin"])
                }
                
            }
        }
    }
}
