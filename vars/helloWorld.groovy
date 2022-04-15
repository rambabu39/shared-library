def call(Map config = [:]) {
    sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
}


def DisplayName(String name) {
    sh "echo Hello from groovy file ${name}"
}
