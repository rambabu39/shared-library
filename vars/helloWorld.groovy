@Grab('org.yaml:snakeyaml:1.17')
import org.yaml.snakeyaml.Yaml

import MyYaml

def call(Map config = [:]) {
    sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
}
def Greet(name) {
    echo "Hello ${name}"
}
def DisplayName() {
    sh "echo Rambabu Nalluri running this script"
}
def dayOfWeek(def arr) {
    //sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
    
    Yaml parser = new Yaml()
    def containeTemplate = libraryResource('/podTemplates/container.yaml')
    containerconfig = parser.load(containeTemplate)
    println containerconfig.containers[0]
    def templete1 = libraryResource('/podTemplates/KubernetesPod.yaml')
    config = parser.load(templete1)
    println config
    def tempContaners = []
    for(def tempname in arr){
        def temp = containerconfig.containers[0].clone()
            temp.name = tempname
            tempContaners.add(temp)
    }
    config.spec.containers = tempContaners
    println parser.dumpAsMap(config)
    return parser.dumpAsMap(config)
}
