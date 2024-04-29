# 7. Hystrix Server - to provide a fault tolerance mechanism for services.

This is a sample Spring Boot application demonstrating the use of RestTemplate and Hystrix for handling HTTP requests
and implementing fallback methods.

## Configuration

| Key         | Type   | Description                  | Default Value |
|-------------|--------|------------------------------|---------------|
| server.port | String | Embedded tomcat server port. | `8999`        |

## Endpoints

- **GET /hello** : Returns a simple HTML greeting message.
- **GET /first** : Concatenates responses from two different services and returns the result.
- **GET /second** : Uses `HystrixCommand` annotation with a fallback method to handle failures and returns a
  concatenated string of responses from two different services.
- **GET /third** : Uses `HystrixCommand` annotation with a fallback method and a timeout setting to handle timeouts and
  returns a concatenated string of responses from two different services.

## How to Run

To run this project locally, you need to have **Java** and **Maven** installed on your machine.

1. Clone the repository
2. Navigate to the project directory
3. Update the port configuration in `application.properties` file.
4. Make sure the [Eureka Server](../EurekaServer/README.md), [Service One](../EurekaServiceOne/README.md)
   and [Service Two](../EurekaServiceTwo/README.md) are up and running.
5. Run `mvn spring-boot:run` to start the application
6. See if the Service is discoverable at the Eureka Server by accessing [http://localhost:9000](http://localhost:9000).
7. Access the resources at [http://localhost:8999](http://localhost:8999)
   like: [http://localhost:8999/hello](http://localhost:8999/hello)

## Dependencies

- Spring Boot : Version:`2.3.10.RELEASE`
- Spring Boot Web
- Spring Cloud : Version:`Hoxton.SR11`
- Spring Cloud Starter Netflix Hystrix

## Author

- Mayank Sahu (https://github.com/mayank19o7).