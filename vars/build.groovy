def call(String mavenGoal){
  
  if ("${mavenGoal}" == "Clean")
     {
       sh "mvn clean"
     }
  else if ("${mavenGoal}" == "Compile")
     {
       sh "mvn clean compile"
     }
  else if ("${mavenGoal}" == "Test")
     {
       sh "mvn clean test"
     }
   else if ("${mavenGoal}" == "Build")
      {
        sh "mvn clean package"
     }
  else if("$mavenGoal}" == "ExecuteSonar")
  {
        sh "mvn clean sonar:sonar"
  }
  else if("$mavenGoal}" == "DeployArtifactsToNexus")
  {
        sh "mvn clean deploy"
  }
}
