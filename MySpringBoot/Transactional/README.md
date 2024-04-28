# Transactional - Spring Boot Application.

This application shows the behaviour of @Transactional annotation.
_Either the entire transaction must commit or roll back (if anything breaks in between)._

## Features

- Retrieves all employees.
- Retrieves an employee by ID.
- Saves a new employee with department information.

## Endpoints

- **GET /employees/all**: Retrieves a list of all employees.
- **GET /employees/{empId}**: Retrieves an employee by ID.
- **POST /employees**: Creates a new employee. The request body should be in JSON format, for example, refer
  to `sample.json` in the `resources` folder.

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