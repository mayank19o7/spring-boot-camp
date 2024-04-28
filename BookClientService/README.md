# 5. Using Config Server to fetch DB Configurations from GitHub Repository.

## Book Service - Discovery Client

This application is a Eureka Client / Spring Boot microservice that serves as part of a larger application.
It is designed to be discoverable and configurable using Spring Cloud.

## Configuration

### Eureka Client configuration

| Key                                  | Type    | Description                                                                                                                                                                            | Default Value |
|--------------------------------------|---------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------|
| spring.application.name              | String  | The name of the application. In this case : `book-client`                                                                                                                              |               | 
| eureka.instance.hostname	            | String  | Sets the hostname for a Eureka instance. For example, to set the hostname to `localhost` in standalone mode                                                                            |               |
| eureka.client.serviceUrl.defaultZone | String  | To specify the default zone for the Eureka server. <br/>This property is used by Eureka clients to locate the Eureka server where they register themselves and discover other services |               |
| error.whitelabel.enabled             | Boolean | To control whether the default error page provided by Spring Boot is enabled or not                                                                                                    | true          |

### Cloud Config Configuration

| Key                  | Type   | Description                                                                                               | Example                                     |
|----------------------|--------|-----------------------------------------------------------------------------------------------------------|---------------------------------------------|
| spring.config.import | String | This property can be used to specify the location of the additional configuration file(s) to be imported. | optional:configserver:http://localhost:8999 |

## Features

- Retrieves a book by its ID.
- Retrieves all books.
- Saves a list of books.

## Endpoints

- **GET /books/{id}**: Retrieves a Book by its ID. If no Book is found, a custom RunTime Exception is handled and a
  meaningful error message is returned.
- **GET /books**: Retrieves all Books.
- **POST /books**: Saves new Books. The request body should be in JSON format, for example, refer
  to [sample.json](./src/main/resources/sample.json)

## How to Run

To run this project locally, you need to have **Java** and **Maven** installed on your machine. You also need to have a
**PostgreSQL** database set up.

1. Clone the repository
2. Navigate to the project directory
3. Update the client configuration like `server.port` and `eureka.client.serviceUrl.defaultZone`
   in `application.properties` file.
4. Make sure the [Eureka Server](../EurekaServer/README.md) and [Config Server](../ConfigServer/README.md) is up and
   Running.
5. Run `mvn spring-boot:run` to start the application
6. See if the Service is discoverable at the Eureka Server by accessing [http://localhost:9000](http://localhost:9000).
7. Access the resource of this service at [http://localhost:9002/books](http://localhost:9002/books) ( `9002` port as
   mentioned in `application.properties` )

## Dependencies

- Spring Boot
- Spring Boot Web
- Spring Boot Data JPA
- Spring Cloud Netflix Eureka Client
- PostgreSQL JDBC Driver

## Author

- Mayank Sahu (https://github.com/mayank19o7).