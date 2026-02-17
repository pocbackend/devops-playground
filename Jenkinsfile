pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Compile') {
            steps {
                sh 'javac src/main/java/com/company/Main.java'
            }
        }
        stage('Run') {
            steps {
                sh 'java -cp src/main/java com.company.Main'
            }
        }
        stage('Test') {
            steps {
                // Compile the test file with JUnit in the classpath
                sh 'javac -cp .:junit-4.13.2.jar src/test/java/com/company/MainTest.java'
                // Run the test
                sh 'java -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar:src/test/java org.junit.runner.JUnitCore com.company.MainTest'
            }
        }
        stage('Archive') {
            steps {
                archiveArtifacts artifacts: 'src/main/java/com/company/*.class', fingerprint: true
            }
        }
    }
}
