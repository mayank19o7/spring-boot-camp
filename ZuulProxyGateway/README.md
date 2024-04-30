# 11. Zuul Proxy Server Application

This is a Spring Boot application that demonstrates the use of Zuul Proxy for routing and filtering requests to backend
services. It acts as a gateway that sits between client requests and your backend services.

## Configuration

The application can be configured using the `application.properties` or `application.yml` file.
Here are some key configurations:

| Key                     | Description                                                               |
|-------------------------|---------------------------------------------------------------------------|
| server.port             | The port on which the application runs.                                   |
| zuul.routes.[name].path | The path pattern to match for routing.                                    |
| zuul.routes.[name].url  | The URL of the backend service to which the requests should be forwarded. |

## How to Run

To run this project locally, you need to have **Java** and **Maven** installed on your machine.

1. Clone the repository
2. Navigate to the project directory.
3. Update the Routing configuration like routes _url_, _path_.
4. We can run [Order Service](../OrderService/README.md) to route to using Zuul Proxy.
5. Run `mvn spring-boot:run` to start the application.
6. Access the resource at [http://localhost:9000/serviceone/orders](http://localhost:9000/serviceone/orders).

## Dependencies

- Spring Boot : Version: `2.3.7.RELEASE`
- Spring Cloud : Version: `Hoxton.SR9`
- Spring Cloud Netflix Zuul

## Author

- Mayank Sahu (https://github.com/mayank19o7).