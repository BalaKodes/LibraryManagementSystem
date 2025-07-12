# 📚 Library Management System - REST API

A lightweight Spring Boot REST API for managing users and books in a library. Uses Spring Data JPA and MySQL.

---

## 🔗 API Endpoints

### 👥 Users

* `POST /api/users` → Add user
* `GET /api/users` → Get all users

### 📚 Books

* `POST /api/books` → Add book
* `GET /api/books` → Get all books
* `GET /api/books/{id}` → Get book by ID
* `PUT /api/books/{id}` → Update book
* `DELETE /api/books/{id}` → Delete book

### 🔄 Borrowing

* `POST /api/books/{bookId}/borrow/{userId}` → Borrow book
* `POST /api/books/{bookId}/return` → Return book

## ⚙️ Setup

1. Clone: `git clone https://github.com/BalaKodes/LibraryManagementSystem.git`

## ✅ Features

* Add, update, delete, fetch books
* Borrow and return functionality
* User management

---

## 📌 Conclusion

Built with Spring Boot, Spring Data JPA, and MySQL to provide REST APIs for core library operations.

Future plans include integrating role-based login and UI frontend.
