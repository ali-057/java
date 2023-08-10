pipeline{
  agent{
    docker {image 'jopenjdk:11' }
    }
    stages{
        steps{
            
        }
      stage('Checkout'){
          steps{
              git 'https://github.com/ali-057/java'
          } 
      }
      stage('Compile and  run java program')  {
        steps  {
          sh 'javac hello.java'
          sh 'java hello'
        }
      }
    }
}

