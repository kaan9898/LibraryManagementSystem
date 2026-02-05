Library Management System

A simple Spring Boot application for managing a library's books.  
This project provides RESTful APIs to add, update, delete, and retrieve books.  

Features

- Add a new book with details such as ISBN, title, author, section, shelf, and publication year.  
- Retrieve all books in the library.  
- Search books by ISBN, author, or section.  
- Update existing book details.  
- Delete books from the library.  
- Default book status is `"In stock"`.  


Technologies Used

- Java 17+  
- Spring Boot  
- Spring Data JPA  
- Hibernate  
- H2 database
- Lombok  

Project Structure


com.kaan_karahan.LibraryManagementSystem

├── Controller REST API endpoints

├── Model Book entity

├── Repository Database access layer

├── Service Business logic

└── LibraryManagementSystemApplication.java
