# 8. Resilience4j - Circuit breaker mechanism.
## Spring Boot Order Management Application

This is a simple Spring Boot application for managing orders.

## Features

- Retrieve all orders.
- Retrieve orders by category.

## Endpoints

- **GET /orders**: Retrieve all orders.
- **GET /orders/{category}**: Retrieve orders by category.

## How to Run

To run this project locally, you need to have **Java** and **Maven** installed on your machine. You also need to have a
**PostgreSQL** database set up.

1. Clone the repository
2. Navigate to the project directory
3. Update the port and database configuration in `application.properties` file:
4. Run `mvn spring-boot:run` to start the application
5. Access the resources at [http://localhost:9001](http://localhost:9001)
   like [http://localhost:9001/orders](http://localhost:9001/orders), [http://localhost:9001/orders/electronics](http://localhost:9001/orders/electronics).

## Dependencies

- Spring Boot
- Spring Boot Web
- Spring Boot AOP
- Spring Boot Data JPA
- PostgreSQL JDBC Driver

## Author

- Mayank Sahu (https://github.com/mayank19o7).

