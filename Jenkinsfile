pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'building'
        sh 'maven package'
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