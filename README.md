# 🏦 MiniBankingAppJDBC

A simple Banking Application built using **Java**, **JDBC**, and **MySQL** that demonstrates full CRUD operations (Create, Read, Update, Delete) with a clean and maintainable project structure.

---

## 📌 Overview

This project simulates a basic banking system where you can manage customers and their balances. It focuses on backend development concepts like database connectivity, SQL operations, and layered architecture using DTO and Model classes.

---

## 🚀 Features

* ✅ Add new customer (INSERT)
* 🔍 Get customer by ID (SELECT)
* 📋 Get all customers (SELECT ALL)
* ✏️ Update customer data (UPDATE)
* ❌ Delete customer (DELETE)
* 🔐 Secure SQL execution using `PreparedStatement`
* ♻️ Reusable database connection class
* 🧱 Clean separation between Model, DTO, and Main layers

---

## 🛠️ Technologies Used

* Java
* JDBC (Java Database Connectivity)
* MySQL
* Maven
* IntelliJ IDEA

---

## 📁 Project Structure

```text
src
│
├── model
│   └── Customer.java
│
├── dto
│   └── CustomerDto.java
│
├── util
│   └── DBConnection.java
│
└── org.example
    └── Main.java
```

---

## 🗄️ Database Setup

### Create Database

```sql
CREATE DATABASE MiniBankingApp;
```

### Create Table

```sql
CREATE TABLE customers (
    id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    email VARCHAR(100),
    balance DOUBLE
);
```

---

## 🔌 Database Connection

Update your database credentials in:

```java
DBConnection.java
```

```java
private static final String URL = "jdbc:mysql://localhost:3306/MiniBankingApp";
private static final String USER = "root";
private static final String PASSWORD = "1111";
```

---

## ▶️ How to Run

1. Clone the repository:

```bash
git clone https://github.com/Abdullahabdelsalam/MiniBankingAppJDBC.git
```

2. Open the project in IntelliJ IDEA

3. Make sure MySQL is running

4. Create the database and table

5. Run:

```bash
Main.java
```

---

## 💡 Example Operations

### Insert Customer

```java
customerDto.insertCustomer(customer);
```

### Update Customer

```java
customerDto.updateCustomer(customer);
```

### Delete Customer

```java
customerDto.deleteCustomer(id);
```

### Select Customer By ID

```java
Customer customer = customerDto.selectCustomer(id);
System.out.println(customer);
```

### Select All Customers

```java
List<Customer> customers = customerDto.selectAllCustomers();
customers.forEach(System.out::println);
```

---

## 📷 Sample Output

```text
Customer deleted successfully
insert customer successfully
update customer successfully
Customer{id=1, firstName='Ali', email='ali@gmail.com', balance=5000.0}
Customer{id=2, firstName='Omar', email='omar@gmail.com', balance=3000.0}
```

---

## 🧠 Key Concepts

* JDBC Connection Management
* PreparedStatement vs Statement
* CRUD Operations
* Exception Handling
* Layered Architecture (Model - DTO - Utility)

---

## 👨‍💻 Author

**Abdullah Abdelsalam**

---

## ⭐ Contribution

Feel free to fork the project and improve it. Pull requests are welcome!
🚀
