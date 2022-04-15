def call(Map config = [:]) {
    sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
}


def DisplayName() {
    sh "echo Rambabu Nalluri running this script"
}
