# Product Management System

A full-stack web application for managing products, built with Spring Boot and Tailwind CSS.

## Tech Stack

- Backend: Java with Spring Boot
- Database: PostgreSQL
- Frontend: HTML + Tailwind CSS
- Communication: JavaScript Fetch API

## Prerequisites

- Java 17 or higher
- Maven
- PostgreSQL
- Web browser

## Setup Instructions

1. **Database Setup**
   - Install PostgreSQL if not already installed
   - Create a new database named `product_management`
   - Update database credentials in `src/main/resources/application.properties` if needed

2. **Backend Setup**
   ```bash
   # Navigate to project root
   cd /path/to/project

   # Build the project
   mvn clean install

   # Run the application
   mvn spring-boot:run
   ```

3. **Frontend Setup**
   - Open `frontend/product.html` in your web browser
   - The application should now be accessible at `http://localhost:8080`

## Features

- View all products in a searchable table
- Add new products
- Delete existing products
- Responsive design with Tailwind CSS
- Real-time search functionality

## API Endpoints

- GET `/api/products` - List all products
- POST `/api/products` - Create new product
- PUT `/api/products/{id}` - Update a product
- DELETE `/api/products/{id}` - Delete a product

## Project Structure

```
├── src/main/java/com/example/demo/
│   ├── controller/
│   │   └── ProductController.java
│   ├── entity/
│   │   └── Product.java
│   ├── repository/
│   │   └── ProductRepository.java
│   ├── service/
│   │   └── ProductService.java
│   └── DemoApplication.java
├── src/main/resources/
│   └── application.properties
├── frontend/
│   ├── product.html
│   └── addProduct.html
└── pom.xml
```