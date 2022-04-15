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
    def templates = []
    sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
    delf templete1 = libraryResource('a.yaml')
    delf templete2 = libraryResource('b.yaml')
    println templete1+templete2
}
