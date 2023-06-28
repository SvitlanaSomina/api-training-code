node {
    stage("checkout repo") {
        git branch: 'master',
        credentialsId: 'fd646978-f8e2-4c55-a232-71633f182ce5',
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