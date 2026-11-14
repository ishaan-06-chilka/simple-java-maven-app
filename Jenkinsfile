node {
  stage('SCM') {
    checkout scm
  }
  stage('SonarQube Analysis') {
    def mvn = tool 'Default Maven';
    withSonarQubeEnv('SonarQube-Local') {
     sh "${mvn}/bin/mvn clean verify org.sonarsource.scanner.maven:sonar-maven-plugin:5.0.0.4638:sonar -Dsonar.projectKey=simple-java-maven-app"
    }
  }
}
