node {
    stage("checkout repo") {
        git branch: 'master',
        credentialsId: 'CREDENTIALS_ID',
        url: 'https://github.com/SvitlanaSomina/api-training-code.git'
    }

    stage("build") {
       sh "./gradlew clean api-test:assemble"
    }

    stage("run api tests") {
       sh "./gradlew api-test:test -Dlogging=${LOGGING}"
    }

    allure([
        includeProperties: false,
        jdk: '',
        properties: [],
        reportBuildPolicy: 'ALWAYS',
        results: [[path: 'api-test/build/allure-results']]
    ])
}
