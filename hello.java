pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
    }
}
            }
        }
    }
}



