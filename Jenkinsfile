node {
    stage("checkout repo") {
        git branch: 'master',
        credentialsId: '39a40f9c-0cf3-47e4-aa5f-fddabbf4e6a0',
        url: 'https://github.com/SvitlanaSomina/api-training-code.git'
    }

    stage("build") {
       sh "./gradlew clean api-test:assemble"
    }

    stage("run api tests") {
       sh "./gradlew api-test:test"
    }
}