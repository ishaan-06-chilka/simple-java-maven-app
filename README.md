Java Application CI/CD Pipeline using Jenkins, Maven, SonarQube & Docker

Project Overview

This project demonstrates the implementation of an automated Continuous Integration and Continuous Delivery (CI/CD) pipeline for a Java application using Jenkins, Maven, SonarQube, and Docker.

The pipeline automates the process of retrieving source code from GitHub, building and testing the application, performing static code analysis, validating code quality, building a Docker image, and running the application inside a Docker container.

The objective is to demonstrate how multiple DevOps tools can be integrated into a single automated workflow.

Technologies Used

Technology| Purpose
Java 21| Application development
Maven 3.9+| Build and dependency management
Git & GitHub| Version control and source code management
Jenkins| CI/CD pipeline automation
SonarQube| Static code analysis and quality monitoring
Docker| Application containerization
Groovy| Jenkins pipeline scripting

CI/CD Pipeline Architecture

The project follows this workflow:

GitHub → Jenkins → Maven → SonarQube → Quality Gate → Docker Build → Docker Run

Pipeline Stages

The Jenkins pipeline consists of five stages:

1. Source Code Management (SCM)

- Jenkins retrieves the latest source code from the GitHub repository.
- Checks out the configured Git branch.

2. SonarQube Analysis

- Maven compiles the Java application and executes unit tests.
- SonarQube performs static code analysis to identify code quality issues.
- Analysis results are published to the SonarQube dashboard.

3. Quality Gate

- Jenkins waits for the SonarQube Quality Gate result.
- The pipeline proceeds only if the Quality Gate status is successful.
- The pipeline is stopped if the quality requirements are not met.

4. Docker Build

- Docker builds an image using the project's Dockerfile.
- The application is packaged into a Docker image named "simple-java-maven-app:latest".

5. Docker Run

- Jenkins executes the newly built Docker image.
- The Java application runs inside a Docker container.
- The container is automatically removed after execution using the "--rm" option.

Project Structure

simple-java-maven-app/
│
├── .github/
│
├── jenkins/
│   └── Jenkinsfile
│
├── src/
│   ├── main/
│   │   └── java/
│   └── test/
│       └── java/
│
├── Dockerfile
├── Jenkinsfile
├── pom.xml
├── README.md
└── LICENSE.txt

Key Files

- pom.xml – Contains Maven project configuration, dependencies, and build settings.
- Dockerfile – Defines the instructions for building the Docker image.
- jenkins/Jenkinsfile – Contains the CI/CD pipeline stages.
- src/main/java – Contains the Java application source code.
- src/test/java – Contains the application unit tests.

Prerequisites

To run the application locally, ensure the following tools are installed:

- Java Development Kit (JDK) 21
- Apache Maven 3.9+
- Git
- Docker Desktop

To execute the complete automated CI/CD pipeline, you will additionally need:

- Jenkins with the required Pipeline, Git, SSH Build Agents, and SonarQube Scanner plugins.
- A configured Jenkins agent with Docker CLI and access to the Docker daemon.
- A running SonarQube server.
- Jenkins credentials and SonarQube server configuration.

How to Run the Project Locally

Step 1: Clone the Repository

git clone https://github.com/ishaan-06-chilka/simple-java-maven-app.git

Navigate into the project directory:

cd simple-java-maven-app

Step 2: Build and Test the Application

mvn clean test

This command cleans the previous build, compiles the application, and executes the unit tests.

Step 3: Build the Docker Image

docker build -t simple-java-maven-app:latest .

Step 4: Run the Docker Container

docker run --rm simple-java-maven-app:latest

The Java application executes inside the container and prints its output in the terminal.

How to Execute the Jenkins Pipeline

1. Start Jenkins, SonarQube, and the configured Docker-enabled agent.
2. Open the Jenkins dashboard.
3. Navigate to the "simple-java-maven-app" pipeline job.
4. Select Build Now.
5. Monitor the execution through Jenkins Stage View.
6. Verify the analysis results in the SonarQube dashboard.

The pipeline automatically performs all five stages without requiring manual execution of each individual step.

Project Results

The complete CI/CD pipeline was successfully executed.

- Source code was successfully retrieved from GitHub.
- Maven build and unit tests completed successfully.
- SonarQube analysis completed successfully.
- Quality Gate status: PASSED.
- Docker image was successfully built.
- Docker container executed the Java application successfully.

Application Output:

INFO: Hello DevOps!

Final Pipeline Status: SUCCESS

Repository

GitHub: https://github.com/ishaan-06-chilka/simple-java-maven-app

Conclusion

This project provided hands-on experience in implementing a CI/CD workflow by integrating Jenkins, Maven, SonarQube, and Docker.

It demonstrates automated source code management, application building, unit testing, static code analysis, quality validation, containerization, and application execution within a single Jenkins pipeline.
