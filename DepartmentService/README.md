# 6. RestTemplate using Eureka Server and 2 microservices : Department-Service and Employee-Service.

Employee Service is consumed by Department Service.
Department Service retrieves the department and all of its Employees.

## Department Service

This application is a Eureka Client / Spring Boot microservice that serves as part of a larger application.
It is designed to be discoverable and configurable using Spring Cloud.

## Configuration

Eureka Client configuration

| Key                                  | Type   | Description                                                                                                                                                                            | Default Value |
|--------------------------------------|--------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------|
| server.port                          | String | Embedded tomcat server port.                                                                                                                                                           | `9002`        |
| spring.application.name              | String | The name of the application. In this case : `department-service`                                                                                                                       |               | 
| eureka.client.serviceUrl.defaultZone | String | To specify the default zone for the Eureka server. <br/>This property is used by Eureka clients to locate the Eureka server where they register themselves and discover other services |               |

## Endpoints

- **GET /departments/{id}** : Retrieves a department by ID, also fetches the employees of that department.

## How to Run

To run this project locally, you need to have **Java** and **Maven** installed on your machine.

1. Clone the repository
2. Navigate to the project directory
3. Update the client configuration like `server.port` and `eureka.client.serviceUrl.defaultZone`
   in `application.properties` file.
4. Make sure the [Eureka Server](../EurekaServer/README.md) and [Employee Service](../EmployeeService/README.md) is up
   and running.
5. Run `mvn spring-boot:run` to start the application
6. See if the Service is discoverable at the Eureka Server by accessing [http://localhost:9000](http://localhost:9000).
7. Access the resource of this service
   at [http://localhost:9002/departments/102](http://localhost:9002/departments/102) ( `9002` port as mentioned
   in `application.properties` ).

## Dependencies

- Spring Boot
- Spring Boot Web
- Spring Cloud Netflix Eureka Client

## Author

- Mayank Sahu (https://github.com/mayank19o7).