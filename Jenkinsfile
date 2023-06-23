node {
    stage("checkout repo") {
        git branch: 'master',
        credentialsId: 'b481a596-0396-474d-bbe6-115f020d85c1',
        url: 'https://github.com/SvitlanaSomina/api-training-code.git'
    }

    stage("build") {
       sh "./gradlew clean api-test:assemble"
    }

    stage("run api tests") {
       sh "./gradlew api-test:test"
    }
}