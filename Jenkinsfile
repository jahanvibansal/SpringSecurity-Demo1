pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'building'
        sh 'mvn package'
        tool 'maven'
      }
    }

    stage('Test') {
      steps {
        echo 'testing'
      }
    }

    stage('Deploy') {
      steps {
        echo 'Deploying'
      }
    }

  }
}