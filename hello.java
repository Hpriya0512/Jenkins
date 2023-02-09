pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                System.out.println("Hello, World!");
            }
        }
    }
}



