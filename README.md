# Online Grocery

A backend application for an online grocery store, built using Java and Spring Boot. The application provides REST APIs for managing customers, grocery items, and orders.

## Features

* Customer management
* Grocery item management
* Order management
* RESTful APIs
* MySQL database integration
* Spring Boot based backend

## Tech Stack

* Java
* Spring Boot
* Spring MVC
* Spring Data JPA
* MySQL
* Maven

## Project Structure

The application is organized into different layers:

* **Controller** – Handles REST API requests
* **Service** – Contains business logic
* **Repository** – Handles database operations
* **Entity** – Represents database entities

## Main Modules

### Customer

Provides APIs to create and manage customer information.

### Grocery Item

Provides APIs to add, update, retrieve, and manage grocery items.

### Order

Provides APIs for creating and managing customer orders.

## Getting Started

### Prerequisites

Make sure you have the following installed:

* Java 21
* Maven
* MySQL

### Clone the Repository

```bash
git clone https://github.com/prasannasbhat/online-grocery.git
cd online-grocery
```

### Configure Database

Create a MySQL database and update the database configuration in the application configuration file.

Do not commit your actual database password or other sensitive credentials to GitHub.

### Run the Application

Using Maven:

```bash
./mvnw spring-boot:run
```

The application will start on:

```text
http://localhost:8081
```

## Future Improvements

* User authentication and authorization
* Shopping cart functionality
* Payment integration
* Product categories
* Order tracking
* Exception handling and validation
* Unit and integration testing

## Author

**Prasanna S Bhat**

GitHub: https://github.com/prasannasbhat
