node {
    stage("checkout repo") {
        git branch: 'master',
        credentialsId: 'd06c0797-4465-4ed4-988a-557e88eccd39',
        url: 'https://github.com/SvitlanaSomina/api-training-code.git'
    }

    stage("build") {
       sh "./gradlew clean api-test:assemble"
    }

    stage("run api tests") {
       sh "./gradlew api-test:test"
    }
}