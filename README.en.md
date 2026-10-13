# 📚 Spring Boot Learning Project

🇧🇷 [Leia em Português](README.md) | 🇬🇧 English

This project documents, in a **didactic and practical** way, the use of the main tools of the **Spring** ecosystem, showing step by step each feature applied during the learning process.

The idea is to serve as study material and a reference for anyone starting out or consolidating their knowledge of back-end development with Java and Spring Boot.

---

## 🚀 Technologies Used

- **Java**
- **Spring Boot**
- **Spring Framework**
  * Spring Web
  * Spring Data JPA
  * Spring Security
- **Lombok**
- **Maven**
- **REST API**
- **Postman**
- **Object-Oriented Programming (OOP)**

---

## 🏗 Project Architecture

The project follows a **layered architecture**, widely used in Spring applications:

- **Controller**
  * Responsible for receiving HTTP requests and returning responses.
- **Business**
  * Contains the application's business logic.
- **Infrastructure**
  * Layer responsible for the technical aspects of the application, including:

  * **Entity**

    + Represents the domain entities and their mapping to the database.

  * **Repository**

    + Responsible for accessing and manipulating data in the database.

  * **Exceptions**

    + Centralises exception handling across the application, ensuring standardised responses and better error control.

This separation makes the code easier to maintain, scale and organise.

---

## 📌 Features Developed

- Creation of REST APIs
- Project organisation following good practices
- Data persistence with Spring Data JPA
- Use of DTOs (where applicable)
- Endpoint testing with Postman
- Basic security configuration with Spring Security

---

## 🧠 Project Goals

- Consolidate fundamental Spring Boot concepts
- Apply good software architecture practices
- Build well-organised and scalable REST APIs
- Serve as a foundation for future projects
