# 1. Simple Spring Boot Application with JPA to show basic CRUD Operation for a Book Entity.

This Spring Boot application provides some of the CRUD (Create, Read, Update, Delete) operations for a Book entity.

## Features

- Retrieves a book by its ID.
- Retrieves all books.
- Saves a list of books.

## Endpoints

- **GET /books/{id}**: Retrieves a Book by its ID. If no Book is found, a custom RunTime Exception is handled and a
  meaningful error message is returned.
- **GET /books**: Retrieves all Books.
- **POST /books**: Saves new Books. The request body should be in JSON format, for example, refer
  to [sample.json](./src/main/resources/sample.json).

## How to Run

To run this project locally, you need to have **Java** and **Maven** installed on your machine. You also need to have a
**PostgreSQL** database set up.

1. Clone the repository
2. Navigate to the project directory
3. Update the database configuration in `application.properties` file:
4. Run `mvn spring-boot:run` to start the application
5. Access the application at `http://localhost:9000` ( port as mentioned in `application.properties`
   using `server.port` property )

## Dependencies

- Spring Boot
- Spring Boot Web
- Spring Boot Data JPA
- PostgreSQL JDBC Driver

## Author

- Mayank Sahu (https://github.com/mayank19o7).

