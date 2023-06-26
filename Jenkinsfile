node {
    stage("checkout repo") {
        git branch: 'master',
        credentialsId: '63050c6c-0e29-45e2-81fa-68a3aa8c8261',
        url: 'https://github.com/SvitlanaSomina/api-training-code.git'
    }

    stage("build") {
       sh "./gradlew clean api-test:assemble"
    }

    stage("run api tests") {
       sh "./gradlew api-test:test"
    }
}