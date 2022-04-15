pipeline {
  agent {
    kubernetes(helloWorld([name: 'Newman', dayOfWeek: 'Friday']))
  }
  stages {
    stage('demo') {
      steps {
        echo "this is a demo"
        script {
          container('pg') {
            sh 'su - postgres -c \'psql --version\''
          }
        }
      }
    }
  }
}
