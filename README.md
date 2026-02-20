# Campus Placement Management System (Hibernate Console Application)

A Java Console-Based Placement Management System developed using Hibernate ORM and Maven to manage Students, Companies, and Applications efficiently.

This project demonstrates strong understanding of:

Hibernate ORM

Layered Architecture (DAO → Service → Main)

Database Mapping using hibernate.cfg.xml

# Project Overview:

The system allows:

Managing student records

Managing company details

Handling job applications

Validating eligibility criteria

Preventing duplicate/invalid applications

It follows a clean and structured architecture suitable for enterprise-level applications.

## Tech Stack:

Backend: Java
ORM Framework: Hibernate
Build Tool: Maven
Database: MySQL / Oracle (Configurable)
Configuration: hibernate.cfg.xml
Architecture: Layered (Bean → DAO → Service → App)

# Project Structure:

```plaintext
HibernateConsoleapp
│
├── src/main/java
│   └── com.placement
│
│       ├── app
│       │     └── PlacementMain.java
│       │
│       ├── bean
│       │     ├── Student.java
│       │     ├── Company.java
│       │     └── Application.java
│       │
│       ├── dao
│       │     ├── StudentDAO.java
│       │     ├── CompanyDAO.java
│       │     └── ApplicationDAO.java
│       │
│       ├── service
│       │     └── PlacementService.java
│       │
│       └── util
│             ├── HibernateUtil.java
│             ├── ValidationException.java
│             ├── EligibilityViolationException.java
│             └── ActiveApplicationsExistException.java
│
├── src/main/resources
│     └── hibernate.cfg.xml
│
└── pom.xml
```
# Architecture Explanation:

## Entity Layer (Bean):

Student.java

Company.java

Application.java

These classes represent database tables and are mapped using Hibernate annotations.

## DAO Layer:

StudentDAO

CompanyDAO

ApplicationDAO

Responsible for:

Insert

Update

Delete

Fetch operations
Using Hibernate Session API.

## Service Layer:

PlacementService

Handles:

Business logic

Eligibility validation

Application rules

Exception handling

## Utility Layer:

HibernateUtil → SessionFactory configuration

## Custom Exceptions:

ValidationException

EligibilityViolationException

ActiveApplicationsExistException

Hibernate Configuration

Configured using:

src/main/resources/hibernate.cfg.xml

Includes:

- Database connection details

- Dialect configuration

- Entity mappings

- Show SQL option

 ## How to Run the Project:
 
-  Clone the Repository
git clone https://github.com/your-username/HibernateConsoleapp.git
- Import as Maven Project in Eclipse
File → Import → Existing Maven Project
- Configure Database

## PlacementMain.java:
Sample Functional Flow

Add Student

Add Company

Apply Student to Company

Validate eligibility

Display applications

## Future Enhancements:

Add Spring Boot integration

Convert to REST API

Add logging framework

## Author:

Vishvadharshini S
