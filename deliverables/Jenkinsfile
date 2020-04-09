  pipeline {
   agent any

   tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "M3"
      }



      stages {

        stage('Checkout'){         
          steps{
              // Building only branch 'week-1' from the repo
              git branch: 'week-1', credentialsId: 'Github', url: 'https://github.com/ashu10832/PJP-Assignments.git'            }
            }
            stage('Build') {
             steps {

              // Run Maven on a Unix agent.
              sh "mvn -Dmaven.test.failure.ignore=true clean package"

              // To run Maven on a Windows agent, use
              // bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }

            post {
              // If Maven was able to run the tests, even if some of the test
              // failed, record the test results and archive the jar file.
              success {
               junit '**/target/surefire-reports/TEST-*.xml'
               archiveArtifacts 'target/*.jar'
             }
           }
         }
         stage('Executing JAR'){
          steps{
            script {

              sh "java -jar target/sample-project-1.0-SNAPSHOT.jar > output.out"
              def out = readFile 'output.out'
              println(out)

            }

          }
        }
      }
    }
