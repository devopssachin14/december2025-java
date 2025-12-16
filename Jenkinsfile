pipeline {
    agent any
    // environment {
    //     PATH = "/opt/maven/bin/:$PATH"
    // }
    tools {
        maven '3.9.10'
    }
    stages {
        stage('gitcheckout') { 
            steps {
                git branch: 'main', url: 'https://github.com/devopssachin14/december2025-java.git'
            }
        }
        stage('maven-check') { 
            steps {
                sh 'mvn --version'
            }
        }
        stage('maven-build') { 
            steps {
                sh 'mvn -B -DskipTests clean package'
                sh 'mvn validate'
                sh 'mvn install'
            }
        }
        stage('validation') { 
            steps {
                sh 'mvn validate'
            }
        }
    }
}
