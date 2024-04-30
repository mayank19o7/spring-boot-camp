# 10. Zipkin Server for Distributed Tracing.

This application provides a Zipkin Server implementation to enable distributed tracing in a microservices' architecture.
Zipkin collects timing data needed to troubleshoot latency problems in microservice architectures.

## Features

* Distributed Tracing: Trace requests as they flow across different services.
* Centralized Storage: Store trace data in a central repository for analysis.
* Visualization: Visualize trace data to understand the flow of requests.

## Endpoints for Testing

* **GET /hello** - Returns a simple greeting message

## How to Run

To run this project locally, you need to have **Java** and **Maven** installed on your machine.

1. Clone the repository
2. Navigate to the project directory
3. To start zipkin server, Run `java -jar ./src/main/resources/zipkin-server-3.3.0-exec.jar`.
4. Access the Zipkin Server dashboard at [http://localhost:9411/zipkin](http://localhost:9411/zipkin) to view trace data.
5. Run `mvn spring-boot:run` to start the application.
6. Access the resource at [http://localhost:8080/hello](http://localhost:8080/hello).
7. See if the Resource is captured by Zipkin Server.

## Dependencies

- Spring Boot : Version: `2.7.16`
- Spring Boot Web
- Spring Cloud : Version: `2021.0.8`
- io.zipkin.java : Version: `0.4.3`
- Spring Cloud Sleuth Zipkin
- Spring Cloud Starter Sleuth

## Author

- Mayank Sahu (https://github.com/mayank19o7).