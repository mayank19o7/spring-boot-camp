# 9. Spring Boot Security Application - Authentication and Authorization.

This is a simple Spring Boot application demonstrating security using Spring Security.

## Features

- Configures password encoding using BCryptPasswordEncoder.
- Defines user details for authentication.
- Configures security filter chain for HTTP requests.
- Provides REST endpoints for login functionality.

## Usage

* To access the login endpoints, use the following URLs:
    * Admin endpoints:
        * **POST /login/admin** - Saves an admin.
        * **GET /login/admin** - Retrieves the admin.
    * User endpoints:
        * **POST /login/user** - Saves a user. _Only Accessible by ADMIN role_.
        * **GET /login/user** - Retrieves the user.
* Users:
    * `Username`: Pheonix, `Password`: Pheonix123 (Role: **USER**)
    * `Username`: Ninja, `Password`: Ninja987 (Roles: **ADMIN**, **USER**)

## Security

* CSRF protection is disabled.
* Users need to be logged in to access specific APIs.
* Authorization is enforced based on user roles.

## How to Run

To run this project locally, you need to have **Java** and **Maven** installed on your machine.

1. Clone the repository
2. Navigate to the project directory
3. Update the port in `application.properties` file if required.
4. Run `mvn spring-boot:run` to start the application
5. Access the resources at [http://localhost:9000](http://localhost:9000)
   like [http://localhost:9000/login/admin](http://localhost:9000/login/admin),
   [http://localhost:9000/login/user](http://localhost:9000/login/user).

## Dependencies

- Spring Boot
- Spring Boot Web
- Spring Boot Security

## Author

- Mayank Sahu (https://github.com/mayank19o7).

