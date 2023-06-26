node {
    stage("checkout repo") {
        git branch: 'master',
        credentialsId: 'jenkins_token',
        url: 'https://github.com/SvitlanaSomina/api-training-code.git'
    }

    stage("build") {
       sh "./gradlew clean api-test:assemble"
    }

    stage("run api tests") {
       sh "./gradlew api-test:test"
    }
}