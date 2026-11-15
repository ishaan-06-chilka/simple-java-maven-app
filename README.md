Java Application CI/CD Pipeline using Jenkins, Maven, SonarQube & Docker

Project Overview

This project demonstrates the implementation of an automated Continuous Integration and Continuous Delivery (CI/CD) pipeline for a Java application using Jenkins, Maven, SonarQube, and Docker.

The pipeline automates the process of fetching source code from GitHub, building and testing the application, performing static code analysis, validating code quality, building a Docker image, and running the application inside a Docker container.

The objective is to demonstrate how multiple DevOps tools can be integrated into a single automated workflow.

Technologies Used

Technology| Purpose
Java 21| Application development
Maven| Build management and dependency management
Git & GitHub| Version control and source code management
Jenkins| CI/CD pipeline automation
SonarQube| Static code analysis and code quality monitoring
Docker| Containerization and application execution
Groovy| Jenkins pipeline scripting

CI/CD Pipeline Architecture

The project follows this workflow:

GitHub → Jenkins → Maven → SonarQube → Quality Gate → Docker Build → Docker Run

Pipeline Stages

1. Source Code Management (SCM)

- Jenkins retrieves the latest source code from the GitHub repository.
- The pipeline checks out the configured Git branch.

2. Build and SonarQube Analysis

- Maven compiles the Java application and executes unit tests.
- SonarQube performs static code analysis to identify code quality issues.
- Analysis results are submitted to the SonarQube server.

3. Quality Gate

- Jenkins waits for the SonarQube Quality Gate result.
- The pipeline proceeds only if the Quality Gate status is successful.
- The pipeline stops if the quality requirements are not met.

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

Key Files:

- "pom.xml" – Contains Maven project configuration and dependencies.
- "Dockerfile" – Defines the steps to build the Docker image.
- "jenkins/Jenkinsfile" – Contains the CI/CD pipeline stages.
- "src/main/java" – Contains the Java application source code.
- "src/test/java" – Contains the unit tests.

Prerequisites

To run this project locally, ensure the following tools are installed:

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

1. Clone the Repository

git clone https://github.com/ishaan-06-chilka/simple-java-maven-app.git

2. Navigate to the Project Directory

cd simple-java-maven-app

3. Build and Test Using Maven

mvn clean verify

This command cleans the previous build, compiles the application, and executes the unit tests.

4. Build the Docker Image

docker build -t simple-java-maven-app:latest .

5. Run the Docker Container

docker run --rm simple-java-maven-app:latest

The application executes inside the Docker container and prints its output to the terminal.

Jenkins Configuration

The Jenkins pipeline uses the "jenkins/Jenkinsfile" script.

The following configurations are required for the complete pipeline:

- Source Code Management: GitHub repository configured in Jenkins.
- Maven: Maven installation configured as "Default Maven".
- SonarQube: Server configured as "SonarQube-Local".
- Credentials: SonarQube authentication token stored securely in Jenkins.
- Build Agent: SSH-based Jenkins agent configured with Docker CLI and Docker socket access.

The pipeline can be triggered through Jenkins using the Build Now option.

Project Outcome

The CI/CD pipeline was successfully implemented and executed.

The final pipeline achieved the following:

- Automated source code retrieval from GitHub.
- Successful Maven build and unit testing.
- Successful SonarQube static code analysis.
- Successful Quality Gate validation.
- Successful Docker image creation.
- Successful Docker container execution.

Final Build Status: SUCCESS

Learning Outcomes

Through this project, I gained practical experience in:

- Understanding CI/CD concepts and pipeline automation.
- Integrating Jenkins with GitHub.
- Building and testing Java applications using Maven.
- Performing static code analysis using SonarQube.
- Implementing Quality Gate validation.
- Creating and executing Docker containers.
- Configuring Jenkins agents and troubleshooting Docker integration.
- Automating the software build and execution lifecycle.

Repository

GitHub: https://github.com/ishaan-06-chilka/simple-java-maven-app

---

Project: Java Application CI/CD Pipeline
Tools: Jenkins | Maven | SonarQube | Docker | GitHub
Pipeline Status: Successfully Executed
