# JDBC Employee Management System

A simple **Java + JDBC console-based CRUD application** to manage employees stored in a MySQL database.  
Built to practice **Core Java**, **JDBC**, **MySQL**, and **menu-driven applications**.

---

## 🚀 Features

- Add new Employee  
- Update Employee Salary  
- Delete Employee by ID  
- View All Employees  
- Console-based menu navigation  
- MySQL database integration using JDBC  

**Employee Fields:**
- EID  
- Name  
- Location  
- Department  
- Salary  

---

## 🛠️ Tech Stack

| Component | Technology |
|----------|------------|
| Language | Java (JDK 17) |
| Database | MySQL |
| Driver | MySQL Connector/J |
| IDE | VS Code / Eclipse |
| Build Type | Manual (No Maven/Gradle) |

---

## 📂 Project Structure

```text
JDBCSTUDENTAPP/
 ├── src/
 │    └── com/jdbc/project/
 │         ├── DBConnection.java
 │         └── MenuEmployeeApp.java
 ├── lib/
 │    └── mysql-connector-j-8.x.x.jar
 ├── README.md
 └── .gitignore
🧩 MySQL Database Setup
Run these SQL commands:

sql
Copy code
CREATE DATABASE JDBCSTUDENTAPP;

USE JDBCSTUDENTAPP;

CREATE TABLE employee (
    eid VARCHAR(20) PRIMARY KEY,
    name VARCHAR(40),
    location VARCHAR(40),
    dept VARCHAR(40),
    salary DOUBLE
);
Update your DB credentials in DBConnection.java:

java
Copy code
private static final String URL = "jdbc:mysql://127.0.0.1:3306/JDBCSTUDENTAPP";
private static final String USER = "root";
private static final String PASSWORD = "your_password";
▶️ How to Run
Option 1 — Using VS Code RUN button
Open project folder in VS Code

Install Java Extension Pack

Open MenuEmployeeApp.java

Click Run above the main method

Option 2 — Using Terminal (Windows)
bash
Copy code
javac -cp "lib/mysql-connector-j-8.x.x.jar;src" src/com/jdbc/project/*.java

java -cp "lib/mysql-connector-j-8.x.x.jar;src" com.jdbc.project.MenuEmployeeApp
📌 Sample Output
text
Copy code
=== EMPLOYEE MENU ===
1. Insert Employee
2. Update Employee Salary
3. Delete Employee
4. View All Employees
5. Exit
Enter choice:
💡 Future Enhancements
Search employee by ID

Update all fields (name, dept, location)

Input validation

Move to Spring Boot + Hibernate

Add GUI using JavaFX/Swing

👨‍💻 Author
Umesh DC
Java Developer | CSE

GitHub: https://github.com/UmeshDc13
