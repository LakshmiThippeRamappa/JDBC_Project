 Project Overview
This Java project is a console-based Employee Management System. It performs CRUD (Create, Read, Update, Delete) operations on employee records stored in a MySQL database. The application follows a layered architecture, separating concerns via DAO, Service, and Client layers.

📁 Project Structure
src/
│
├── Database.sql                         # SQL script to create and populate database tables
│
├── com/demo/client/
│   └── ClientApp.java                   # Main class with menu-driven interaction
│
├── com/demo/dao/
│   ├── EmployeeDao.java                 # DAO interface for employee operations
│   └── EmployeeDaoImpl.java             # DAO implementation using JDBC
│
├── com/demo/exception/
│   └── EmployeeException.java           # Custom exception class
│
├── com/demo/model/
│   └── Employee.java                    # POJO representing the Employee entity
│
├── com/demo/service/
│   ├── EmployeeService.java             # Service interface for business logic
│   └── EmployeeServiceImpl.java         # Service implementation
│
└── com/demo/util/
    └── DbUtil.java                      # Utility for establishing DB connection

🧪 Technologies Used
Java (Core + JDBC)

MySQL

Exception Handling

Collections (if applicable)

MVC Architecture (Simulated via DAO-Service-Client layers)


🚀 Features
Add new employee details

View all employee records

Update employee information

Delete employee records

Handle exceptions gracefully using custom exception class

JDBC-based database operations with prepared statements

⚙️ How to Run

Set up MySQL database:

Use Database.sql to create the necessary table(s).

Update your DB credentials in DbUtil.java.

Compile Java files:  javac src/com/demo/**/*.java

Run the main application:  java com.demo.client.ClientApp
