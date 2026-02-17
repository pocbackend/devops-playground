pipeline {
    agent any   // run on any available Jenkins agent

    stages {
        stage('Checkout') {
            steps {
                // Pull the latest code from GitHub
                checkout scm
            }
        }

        stage('Compile') {
            steps {
                // Compile your Java file
                sh 'javac src/main/java/com/company/Main.java'
            }
        }

        stage('Run') {
            steps {
                // Run the program
                sh 'java -cp src/main/java com.company.Main'
            }
        }

        stage('Archive') {
            steps {
                // Save compiled class files as artifacts
                archiveArtifacts artifacts: 'src/main/java/com/company/*.class', fingerprint: true
            }
        }
    }
}
