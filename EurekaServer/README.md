# Eureka Server

This project is a Eureka Server implementation using Spring Boot.
Eureka Server is a service registry used in microservices architecture for service discovery and registration.

## Configuration

Eureka Server configuration

| Key                              | Type    | Description                                                                                                                                                                                                                                                                                                                    | Default Value |
|----------------------------------|---------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------|
| eureka.instance.hostname         | String  | sets the hostname for a Eureka instance. For example, to set the hostname to localhost in standalone mode                                                                                                                                                                                                                      |               | 
| eureka.client.registerWithEureka | Boolean | to specify whether the application instance should register itself with the Eureka server. <br/>When this property is set to true, the application registers itself with the Eureka server on startup. <br/>If set to false, the application does not register itself.                                                         | true          |
| eureka.client.fetchRegistry      | Boolean | to specify whether the Eureka client should fetch the registry information from the Eureka server. <br/>When this property is set to true, the Eureka client periodically fetches the registry information from the server to update its local cache. <br/>If set to false, the client does not fetch the registry information | true          |

## How to Run

To run this project locally, you need to have **Java** and **Maven** installed on your machine.

1. Clone the repository
2. Navigate to the project directory
3. Update the registry configuration like `instance.hostname` in `application.properties` file.
4. Run `mvn spring-boot:run` to start the application
5. Access the application at `http://localhost:9000` ( port as mentioned in `application.properties`
   using `server.port` property )

## Dependencies

- Spring Boot
- Spring Boot Web
- Spring Cloud Netflix Eureka Server

## Author

- Mayank Sahu (https://github.com/mayank19o7).