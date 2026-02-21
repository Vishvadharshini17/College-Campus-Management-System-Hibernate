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

## Application Output (Hibernate Console Execution):

### Campus Placement Management – Apply for Company
<img width="458" height="89" alt="image" src="https://github.com/user-attachments/assets/ffea5afe-351d-4cf0-8fd7-9a5374fb1221" />


### Fetch Student (Hibernate Query):
<img width="278" height="411" alt="image" src="https://github.com/user-attachments/assets/ec550e58-15ef-437a-87cc-27f583331c26" />


### Fetch Company Details:
<img width="349" height="403" alt="image" src="https://github.com/user-attachments/assets/def86b58-ea98-44dd-b025-f09092bb4a9e" />


### Hibernate Sequence Generation:
<img width="321" height="664" alt="image" src="https://github.com/user-attachments/assets/729e0313-1326-4664-9f7a-3fb50f45bc62" />
<img width="313" height="563" alt="image" src="https://github.com/user-attachments/assets/5f94658d-eac1-4747-83c1-d70449a97af2" />

### Insert Application Record:
<img width="1364" height="153" alt="image" src="https://github.com/user-attachments/assets/c5274e0e-ec83-40d1-9424-b54ac5dc2eef" />

### Final Output:
<img width="318" height="37" alt="image" src="https://github.com/user-attachments/assets/63cf6df8-f34f-4f2d-a91f-99c13856591d" />

## Author:

Vishvadharshini S
