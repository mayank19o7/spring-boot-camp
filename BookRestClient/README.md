# 5. Using Config Server to fetch DB Configurations from GitHub Repository.

## Book Rest Client - Using Rest Template

This application is a Spring Boot microservice that serves as a Consumer for Book Service Application.
It is designed to be discoverable and configurable using Spring Cloud.

## Configuration

| Key                                  | Type   | Description                                                                                                                                                                            | Default Value |
|--------------------------------------|--------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------|
| spring.application.name              | String | The name of the application. In this case : `book-rest-client`.                                                                                                                        |               | 
| eureka.instance.hostname	            | String | Sets the hostname for a Eureka instance. For example, to set the hostname to `localhost` in standalone mode                                                                            |               |
| eureka.client.serviceUrl.defaultZone | String | To specify the default zone for the Eureka server. <br/>This property is used by Eureka clients to locate the Eureka server where they register themselves and discover other services |               |

## Features

- Retrieves all books.
- Saves a list of books.

## Endpoints

- **GET /api/books** : Retrieves all Books.
- **POST /api/books**: Saves new Books. The request body should be in JSON format, for example, refer
  to [sample.json](./src/main/resources/sample.json).

## How to Run

To run this project locally, you need to have **Java** and **Maven** installed on your machine.

1. Clone the repository
2. Navigate to the project directory
3. Update the client configuration like `server.port` and `eureka.client.serviceUrl.defaultZone`
   in `application.properties` file.
4. Make sure the [Eureka Server](../EurekaServer/README.md), [Config Server](../ConfigServer/README.md)
   and [Book Service](../BookClientService/README.md) is up and Running.
5. Run `mvn spring-boot:run` to start the application
6. See if the Service is discoverable at the Eureka Server by accessing [http://localhost:9000](http://localhost:9000).
7. Access the resource of this service at [http://localhost:9001/api/books](http://localhost:9001/api/books) ( `9001`
   port as mentioned in `application.properties` )

## Dependencies

- Spring Boot
- Spring Boot Web
- Spring Cloud Netflix Eureka Client

## Author

- Mayank Sahu (https://github.com/mayank19o7).