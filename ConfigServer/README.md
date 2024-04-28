# 5. Using Config Server to fetch DB Configurations from GitHub Repository.

## Config Server

This application is used as a server for your application's configuration stored in a version-controlled repository (
such as Git) and have your applications retrieve their configuration at runtime.

## Configuration

| Key                                              | Type    | Description                                                                                                               | Example                                            |
|--------------------------------------------------|---------|---------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------|
| spring.application.name                          | String  | The name of the application. In this case : `config-server`                                                               |                                                    | 
| spring.cloud.config.server.git.uri               | String  | To configure the URI of the Git repository where your application's configuration files are stored.                       | `https://github.com/mayank19o7/postgres-db-config` |
| spring.cloud.config.server.git.skipSslValidation | Boolean | To configure whether the Config Server should skip SSL certificate validation when communicating with the Git repository. | By default, this property is set to false.         |


## How to Run

To run this project locally, you need to have **Java** and **Maven** installed on your machine.

1. Clone the repository
2. Navigate to the project directory
3. Update the configuration like `server.port` and `...git.uri` in `application.properties` file.
4. Run `mvn spring-boot:run` to start the application.

## Dependencies

- Spring Boot
- Spring Cloud Config Server

## Author

- Mayank Sahu (https://github.com/mayank19o7).