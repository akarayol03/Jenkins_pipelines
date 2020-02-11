pipeline {
  agent any
  stages {
    stage('stage1') {
      steps {
        echo 'Hello'
        echo 'step2'
        echo 'stage3'
        sh 'eco "Hello"'
      }
    }

    stage('stage2') {
      steps {
        echo 'hello'
      }
    }

  }
}