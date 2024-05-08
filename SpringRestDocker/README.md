# Spring Boot simple rest application using Docker

This project demonstrates how to build an image for a Spring boot rest application using `Dockerfile` and run it through
docker container.

## Rest Endpoints

* **GET /hello** - Returns a simple greeting message

## Usage

1. Build the application using `mvn clean install` and make sure the jar file is present in the [Target](./target)
   directory.
2. Go to the location where `Dockerfile` is present. (Current directory in this project).
3. Build the image for the jar file.:
   ```sh
   docker build -t spring-rest .
   ```
4. Running through container :
   ```sh
   docker run --name my-container -p 8081:8080 spring-rest
   ```
5. Access the resource using [http://localhost:8081/hello](http://localhost:8081/hello).

## Author

- Mayank Sahu (https://github.com/mayank19o7).