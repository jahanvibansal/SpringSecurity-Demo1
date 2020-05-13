pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'building'
        tool 'maven'
        sh 'mvn package'
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