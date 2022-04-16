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
def dayOfWeek(Map config = [:]) {
    sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
    
    Yaml parser = new Yaml()
    def templete1 = libraryResource('/podTemplates/mini.yaml')
    println templete1
    config = parser.load(templete1)
    println config.doesntExists ?: "doesnExists doesn't exists"
    println config.limits?.memory
    println config.requests?.memory
    
//     def templete1 = libraryResource('a.yaml')
//     def templete2 = libraryResource('b.yaml')
//     println templete1
//     println templete1+templete2
//     return templete1+templete2
}
