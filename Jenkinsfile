pipeline {

    agent any
    tools {
        maven 'Apachemaven3.8' 
    }
    stages {
        stage('Compile stage') {
            steps {
                bat "mvn clean compile" 
        }
    }

         stage('testing stage') {
             steps {
                bat "mvn test"
        }
    }

  }

}
