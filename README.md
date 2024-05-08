# My Spring Boot Project

Welcome to My Spring Boot Project! This project covers various topics related to building microservices using Spring
Boot with Java. The project is divided into multiple applications using modules, each focusing on a specific topic.

## Applications

1. [Simple App](./SimpleApp/README.md) - This module contains a simple Spring Boot application demonstrating basic CRUD
   operations for a Book entity.
2. [Transactional](./Transactional/README.md) - This module contains a simple application demonstrating the behaviour of
   @Transactional annotation.
3. [Eureka Service Discovery](./EurekaServer/README.md) - This application demonstrates the use of Eureka
   Server, Uses [Service One](./EurekaServiceOne/README.md) and [Service Two](./EurekaServiceTwo/README.md) to see if
   they are discoverable or not.
4. [API Gateway](./ApiGateway/README.md) - This application acts as a gateway for multiple services, and also
   discoverable by Eureka server. Uses the **Server** and **Services** from above Eureka application.
5. [Config Server](./ConfigServer/README.md) - Using Config Server to fetch DB Configurations from GitHub Repository in
   the application [Book Service](./BookClientService/README.md) which is consumed
   by [Book Rest Client](./BookRestClient/README.md).
6. [Department Service](./DepartmentService/README.md) consumes [Employee Service](./EmployeeService/README.md) using
   **RestTemplate**, fetches the Department by ID with all the employees belonging to that department.
7. [Hystrix Server](./HystrixServer/README.md) - This application demonstrates hystrix which provides a fault tolerance
   mechanism for services, handles HTTP requests and implements fallback methods.
8. [Resilience4j](./UserResilienceService/README.md) - This application demonstrates how to use Resilience4j for
   resilience and fault tolerance in microservices architecture.
   Uses [Order Service Application](./OrderService/README.md).
9. [Security](./Security/README.md) - This is a simple Spring Boot application demonstrating security using Spring
   Security.
10. [Zipkin Server](./ZipkinServer/README.md) - This application demonstrates a Zipkin Server implementation to enable
    distributed tracing.
11. [Zuul Proxy Gateway](./ZuulProxyGateway/README.md) - This application demonstrates dynamic routing and filtering
    through Zuul proxy server.

## Docker

You can find all the basic docker commands [here](./Docker%20Commands/README.md).

1. [Simple Java](./SimpleJavaDocker/README.md) - This project demonstrates how to use Dockerfile to build and run
   a Simple Java application in docker container.
2. [Spring Rest](./SpringRestDocker/README.md) - This project demonstrates how to use Dockerfile to build and run
   a Spring boot rest application in docker container at desired port.