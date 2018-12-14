pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'mvn clean verify'
      }
    }
    stage('Testing') {
      parallel {
        stage('Testing') {
          steps {
            sh 'mvn clean test'
          }
        }
        stage('Integration-Testing') {
          steps {
            sh '''echo "Running the Integration Testing"
mvn clean test'''
          }
        }
        stage('System-Testing') {
          steps {
            sh '''echo "Running the system Test"
mvn clean test'''
          }
        }
      }
    }
    stage('Packaging') {
      steps {
        sh '''echo "Packaging the App..."
mvn clean package'''
      }
    }
    stage('Deploy') {
      steps {
        input(message: 'Want to Deploy ?', id: 'deploy', ok: 'deploy', submitter: 'suraj')
      }
    }
  }
}