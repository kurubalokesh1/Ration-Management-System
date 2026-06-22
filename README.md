# Ration Management System REST API

## Overview

The Ration Management System is a backend REST API application developed using Spring Boot and MySQL. It helps manage ration distribution, user records, stock inventory, and transaction history in a digital and efficient manner.

## Features

* User registration and management
* Ration distribution based on family size
* Stock inventory management
* Transaction tracking and history
* RESTful API endpoints for CRUD operations
* Database integration using Spring Data JPA

## Technologies Used

* Java
* Spring Boot
* Spring Data JPA
* MySQL
* Maven
* REST APIs

## API Modules

### User Management

* Add User
* Update User
* Delete User
* Get User Details

### Stock Management

* Add Stock
* Update Stock Quantity
* View Available Stock

### Ration Distribution

* Calculate ration quantity based on family size
* Update stock after distribution
* Record transaction details

### Transaction Management

* View transaction history
* Track distributed ration records

## Database Design

### User Table

* user_id
* name
* ration_card_no
* phone_no
* family_size
* status

### Stock Table

* item_id
* item_name
* available_qty
* unit_price

### Transaction Table

* transaction_id
* ration_card_no
* total_kg
* total_amount
* distributed_at

## Business Logic

* Each family member is allocated a predefined ration quantity.
* Total ration quantity is calculated using family size.
* Stock is automatically updated after successful distribution.
* Transaction details are stored for auditing and tracking purposes.

## How to Run

1. Clone the repository:

   ```bash
   git clone <repository-url>
   ```

2. Configure MySQL database credentials in `application.properties`.

3. Create the database and required tables.

4. Run the Spring Boot application:

   ```bash
   mvn spring-boot:run
   ```

5. Test the APIs using Postman.

## Sample Endpoint

```http
POST /api/users
GET /api/users/{id}
PUT /api/users/{id}
DELETE /api/users/{id}
```

## Future Enhancements

* OTP-based verification
* JWT Authentication & Authorization
* Role-based access control
* Notification services
* Reporting and analytics

## Author

Lokesh Kuruba
