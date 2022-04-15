//import MyYaml

def call(Map config = [:]) {
    sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
}
// def Greet(name) {
//     echo "Hello ${name}"
// }
// def DisplayName() {
//     sh "echo Rambabu Nalluri running this script"
// }
// def dayOfWeek(Map config = [:]) {
//     def templates = []
//     sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
//     List<String> args = [ 'a.yaml', 'b.yaml'];
//     delf templete1 = libraryResource('a.yaml')
//     delf templete2 = libraryResource('b.yaml')
    
//     templates.add(templete1)
//     templates.add(templete2)
    
//     def myyaml = new MyYaml()
//     def final_template = myyaml.merge(templates)
    
//     println final_template
// }
