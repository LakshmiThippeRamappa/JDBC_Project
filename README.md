# 🧑‍💼 Employee Management System (Console-Based - Java + MySQL)

This is a console-based **Employee Management System** built using Java and MySQL. It allows CRUD operations on employee records through a menu-driven interface. The application is structured using a layered architecture (DAO, Service, Client) for clean separation of concerns.

---

## 📁 Project Structure

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



---

## 🧪 Technologies Used

- Java (Core, JDBC)
- MySQL
- Exception Handling
- Collections Framework (if applicable)
- MVC (Layered Architecture Simulation via DAO-Service-Client)

---

## 🚀 Features

- ✅ Add new employee details
- 📋 View all employee records
- ✏️ Update existing employee information
- 🗑️ Delete employee records
- 🔐 Custom exception handling using `EmployeeException`
- 🔄 Database interaction using **JDBC** and **PreparedStatement**
- 💡 Modular design (separation of business logic, data access, and presentation)

---

## ⚙️ How to Run

### 1️⃣ Set Up MySQL Database
- Create the database and table by executing `Database.sql` in your MySQL environment.

### 2️⃣ Configure DB Credentials
- Open `DbUtil.java` and set your **MySQL username, password, and database URL**.

### 3️⃣ Compile the Project

```bash
javac -d bin src/com/demo/**/*.java
