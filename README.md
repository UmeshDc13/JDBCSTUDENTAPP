# JDBC Employee Management System

A simple **Java console application** that performs **CRUD operations** using **JDBC with MySQL**.  
This project is built to understand database connectivity and basic operations in Java.

---

## 🚀 Features

- Add new Employee  
- Update Employee Salary  
- Delete Employee  
- View All Employees  

Each employee record contains:
- Employee ID  
- Name  
- Location  
- Department  
- Salary  

---

## 🛠 Tech Stack

- **Java (JDK 17)**  
- **JDBC (Java Database Connectivity)**  
- **MySQL Database**  
- **MySQL Connector/J**  
- **VS Code / Eclipse**

---

## 🗂 Project Structure

src/
└── com
└── jdbc
└── project
├── DBConnection.java
└── MenuEmployeeApp.java
lib/
└── mysql-connector-j-<version>.jar

pgsql
Copy code

---

## 🧩 Database Setup (MySQL)

```sql
CREATE DATABASE JDBCSTUDENTAPP;

USE JDBCSTUDENTAPP;

CREATE TABLE employee (
    eid VARCHAR(20) PRIMARY KEY,
    name VARCHAR(40),
    location VARCHAR(40),
    dept VARCHAR(40),
    salary DOUBLE
);
Update DB details inside DBConnection.java:

java
Copy code
private static final String URL = "jdbc:mysql://127.0.0.1:3306/JDBCSTUDENTAPP";
private static final String USER = "root";
private static final String PASSWORD = "SQL123";  // Your MySQL password
▶️ How to Run
Import project in VS Code or Eclipse

Add MySQL Connector/J (.jar) to Referenced Libraries

Make sure MySQL is running

Run the main file:

Copy code
MenuEmployeeApp.java
📌 Sample Menu
mathematica
Copy code
=== EMPLOYEE MENU ===
1. Insert Employee
2. Update Employee Salary
3. Delete Employee
4. View All Employees
5. Exit
Enter choice:
📚 Learning Outcomes
Java + MySQL integration

JDBC driver usage

CRUD operations

PreparedStatement

Console-based menu systems

🔮 Future Enhancements
Add search by Employee ID

Validate inputs

Add GUI (JavaFX / Swing)

Move to Spring Boot + JPA

yaml
Copy code

---

# ✅ **STEP 3 — Save the file**

Press:

Ctrl + S

yaml
Copy code

---

# ✅ **STEP 4 — Push README to GitHub**

Open VS Code terminal:

### Add README:
git add README.md

shell
Copy code

### Commit:
git commit -m "Added README documentation"

shell
Copy code

### Push:
