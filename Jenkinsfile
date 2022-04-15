pipeline {
    agent any
 
    stages {
        stage('Hello') {
            steps {
                script{
                    //helloWorld.dayOfWeek([name: 'Rambabu', dayOfWeek: 'Friday'])
                    k8sagent(name: 'base', selector: 'kubernetes.io/hostname: worker1')

                }
                
            }
        }
    }
}
