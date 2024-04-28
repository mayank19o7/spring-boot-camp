# Simple Spring Boot Application to show basic CRUD Operation for a Book Entity.

This Spring Boot application provides some of the CRUD (Create, Read, Update, Delete) operations for a Book entity.

## Features

- Retrieves a book by its ID.
- Retrieves all books.
- Saves a list of books.

## Endpoints

- **GET /books/{id}**: Retrieves a Book by its ID. If no Book is found, a custom RunTime Exception is handled and a
  meaningful error message is returned.
- **GET /books**: Retrieves all Books.
- **POST /books**: Saves new Books. The request body should be in JSON format, for example, refer to `sample.json` in
  the `resources` folder.

## Technologies Used

- Java
- Spring Boot Starter
- Spring Boot Data JPA
- Spring Boot Web
- Postgres

## How to Run

1. Clone the repository
2. Navigate to the project directory
3. Run `mvn spring-boot:run` to start the application
4. Access the application at `http://localhost:9000` ( `server.port=9000` mentioned in `application.properties`)

## Configuration

- Database configuration can be found in `application.properties`
- Modify the configuration to switch to a different database or configure other settings

## Contact

For any questions or feedback, please contact [me].