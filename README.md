
---

# Spring Boot Bootcamp by Emran Codebox

Welcome to my Spring Boot learning journey! This repository contains the code and projects from the **Spring Boot tutorials** provided by the **Emran Codebox** YouTube channel. Each class focuses on a different aspect of Spring Boot development, from basic setup to advanced topics like security, database integration, and API development.

You can follow along with the tutorials here: [Emran Codebox YouTube Channel](https://www.youtube.com/@emrancodebox)

---

## **Project Setup**

1. **Clone this repository**:

   ```bash
   git clone https://github.com/fmahadybd/springboot-bootcamp.git
   cd springboot-bootcamp
   ```

2. **Set up your MySQL database**:
   - Create a new database called ECB (or modify the `application.properties` file to match your database configuration).

   ```sql
   CREATE DATABASE ECB;
   ```

3. **Configure the `application.properties` file**:
   - Add your MySQL credentials and connection details.

   ```properties
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
   spring.datasource.url=jdbc:mysql://localhost:3306/springboot-bootcamp?createDatabaseIfNotExist=true
   spring.datasource.username=root
   spring.datasource.password=

   spring.jpa.show-sql=true
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.properties.hibernate.format_sql=true

   server.port=8088
   ```

4. **Run the application**:
   - Start the Spring Boot application by running the `SpringBootApplication` class in your IDE or using Maven:

   ```bash
   mvn spring-boot:run
   ```

---

## **Table of Class**

1. [Class 1: Introduction to Spring Boot and Basic Setup](#class-1-introduction-to-spring-boot-and-basic-setup)
2. [Class 2: Create Controller Service and Repository and basic Operation](#class-1-Create-Controller-Service-and-Repository-and-basic-Operation)

---

## **Class 1: Introduction to Spring Boot and Basic Setup**

In this first class, we learned how to set up a Spring Boot project, configure MySQL, create a basic `Student` entity, and work with JPA (Java Persistence API). The main goal was to understand the core concepts of Spring Boot and get started with database integration.

---


- **Spring Boot Setup**:
  - Introduction to Spring Boot framework.
  - Setting up a Spring Boot project using Spring Initializr.
  - Project structure overview.

- **JPA & Hibernate**:
  - Introduction to JPA for database interaction.
  - Setting up Hibernate for ORM (Object Relational Mapping).
  - Using annotations like `@Entity`, `@Table`, `@Column`, `@Id`, and `@GeneratedValue`.

- **MySQL Database Integration**:
  - Configuring MySQL as the database provider.
  - Connecting Spring Boot to a MySQL database.
  - Using `application.properties` for database configuration (driver, URL, username, and password).
  - Defining schema generation strategies.

- **Basic Entity Example**:
  - Creating a `Student` entity class with fields like `id`, `name`, `email`, and `cellNo`.
  - Using `@Entity` and `@Table` annotations to map the `Student` class to a database table.
  - Applying `@GeneratedValue(strategy = GenerationType.IDENTITY)` for auto-incrementing the `id`.

- **Lombok**:
  - Introduction to Lombok library.
  - Using annotations like `@Data`, `@NoArgsConstructor`, and `@AllArgsConstructor` to reduce boilerplate code.

- **Application Configuration**:
  - Modifying `application.properties` for custom configurations like server port and SQL logging.




## **Class 2: Creating Controller, Service, and Repository with Basic Operations**

This class focuses on implementing the core layers of a Spring Boot application and performing basic CRUD operations. Below are the highlights of each component:

**Controller Layer: `StudentController`**
Handles HTTP requests and maps them to service methods.
- **Get All Students**
  - **URL**: `/api/student/`
  - **Method**: `GET`
  - Fetches all students and returns them as a list.

- **Get Student by ID**
  - **URL**: `/api/student/{id}`
  - **Method**: `GET`
  - Retrieves a specific student by their `id`.

- **Save Student**
  - **URL**: `/api/student/save`
  - **Method**: `POST`
  - Saves a new student record from the request body.

**Service Layer: `StudentService`**
Contains the business logic and acts as a bridge between the controller and the repository.
- **Methods**:
  - `getAllStudents`: Returns a list of all students.
  - `getStudentById`: Fetches a specific student by `id`.
  - `saveStudent`: Saves a new student record.

**Repository Layer: `StudentRepository`**
Handles database interactions using JPA.
- **Extends**: `JpaRepository<Student, Integer>`
  - `Student`: The entity class mapped to the database table.
  - `Integer`: The data type of the primary key.

**Key Highlights**
- **Annotations**: Utilized Spring annotations like `@RestController`, `@Service`, and `@Repository` to define roles of each layer.
- **Separation of Concerns**: Cleanly structured the project into three layers for maintainability.
- **JPA Integration**: Leveraged Spring Data JPA for seamless database operations.

---

## **Contributions**

Feel free to fork this repository, make improvements, or contribute in any way. You can submit pull requests with fixes, enhancements, or additions related to the course.

---

## **License**

This repository is open source, and you are free to use and modify the code for your learning purposes.

---
