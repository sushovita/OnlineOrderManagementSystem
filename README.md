# Orders Management System (Spring Boot)

Project Overview
----------------
A backend Orders Management System built using Spring Boot, following clean
architecture principles.

This project was developed in phases to understand:
- Entity–Repository–Service–Controller layering
- JPA & Hibernate
- DTOs and Mappers
- Validation and Exception handling
- RESTful API design


Tech Stack
----------
- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 In-Memory Database
- Maven


Project Structure
-----------------
com.example.ordermanagement
|
|-- controller      -> REST controllers
|-- service         -> Business logic
|-- repository      -> JPA repositories
|-- entity          -> JPA entities
|-- dto             -> Request & response DTOs
|-- mapper          -> Entity <-> DTO mapping
|-- exception       -> Custom exceptions
|-- OrdersManagementApplication.java


Features Implemented
--------------------

Phase 1 – Core Setup
- Spring Boot project setup
- Basic application run
- H2 database configuration

Phase 2 – Domain & Persistence
- User and Order entities
- One-to-many relationship (User -> Orders)
- JPA repositories
- Service layer abstraction

Phase 3 – Clean API Layer, REST APIs
- DTOs for request & response
- Mapper classes
- Validation using @NotBlank, @Email
- Custom ResourceNotFoundException
- Create user
- Fetch user by ID
- Delete user
- Create order for a user
- Fetch orders by user


API Endpoints
-------------

User APIs
POST    /users            -> Create user
GET     /users/{id}       -> Get user by ID
DELETE  /users/{id}       -> Delete user

Order APIs
POST    /orders/{userId}        -> Create order for user
GET     /orders/user/{userId}  -> Get orders of a user


How to Run
----------
mvn spring-boot:run

Application runs on:
http://localhost:8080

H2 Console:
http://localhost:8080/h2-console

(JDBC URL is printed in startup logs)


Notes
-----
- Uses in-memory H2 database (data resets on restart)
- Focus is on backend architecture, not UI
- Docker setup was planned but intentionally skipped


Project Status
--------------
Core backend completed
APIs functional
Clean architecture followed

Possible future improvements:
- Docker & Docker Compose
- Authentication (JWT)
- Pagination & sorting
- Global exception handling


Final Note
----------
This project focuses on learning backend structure rather than rushing features.
It serves as a solid foundation for real-world Spring Boot applications.
