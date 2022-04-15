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
    def templete1 = evaluate(libraryResource('a.yaml'))
    def templete2 = evaluate(libraryResource('b.yaml'))
    println templete1.spec
    println templete1+templete2
    return templete1+templete2
}
