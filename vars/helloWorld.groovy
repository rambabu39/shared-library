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
    List<String> args = [ 'a.yaml', 'b.yaml'];
    def finalYaml = MyYaml.merge(args)
    println finalYaml
}
