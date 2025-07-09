# 🧑‍💼 Employee Management System (UAP-CSE Department)

A **Java Swing-based desktop application** for managing employee data such as salary, promotion, and profile details — designed specifically for the **CSE department of UAP**. This application demonstrates **Object-Oriented Programming (OOP)** in Java and GUI interaction using `JOptionPane`.

---

## 📌 Features

| Feature                      | Description                                             |
| ---------------------------- | ------------------------------------------------------- |
| ➕ Add New Employee          | Input employee's name, ID, designation, and salary.     |
| 💰 Get Salary Info           | Display the salary of a specific employee using ID.     |
| 📈 Increase Salary           | Update employee's salary by a given increment.          |
| 🏅 Promote Employee          | Change employee's designation and update salary.        |
| 👤 Display Specific Employee | Show full details of a selected employee by ID.         |
| 📋 Display All Employees     | Print all registered employees’ details in the console. |
| ❌ Exit System                | Cleanly exits the system.                               |

---

## 🧩 Class Structure (UML Diagram)

```
+----------------------+
|      Employee        |
+----------------------+
| - name: String       |
| - id: String         |
| - designation: String|
| - salary: double     |
+----------------------+
| + increaseSalary()   |
| + promote()          |
| + getId()            |
| + getSalary()        |
| + display()          |
+----------------------+

           ▲
           |
           |
+-----------------------+
|       UapCse          |
+-----------------------+
| - employees: ArrayList|
| - department: String  |
+-----------------------+
| + addNewEmployee()    |
| + increaseSalary()    |
| + promote()           |
| + getSalary()         |
| + display()           |
+-----------------------+

           ▲
           |
+----------------------+
|        Uap           |
+----------------------+
| + main(String[])     |
+----------------------+
```

---

## 🛠️ Technologies Used

* ✔️ Java (JDK 8 or above)
* ✔️ Swing (`JOptionPane`)
* ✔️ ArrayList
* ✔️ OOP (Encapsulation, Method Overloading, Composition)

---

## 💻 How to Run

### 🧾 Prerequisites

* Java installed (JDK 8+)

### 🔧 Compile and Run

1. Open terminal or command prompt.
2. Compile the code:

   ```bash
   javac Uap.java
   ```
3. Run the program:

   ```bash
   java Uap
   ```

---

## 🖼️ Screenshots (Placeholders)

*You can replace these with actual screenshots later.*

1. **Main Menu**

   ```
   JOptionPane Input:
   Enter:
   ‘1’ to add a new Employee.
   ‘2’ to get Salary info...
   ```

2. **Add Employee Prompt**

   ```
   JOptionPane Input: Enter employee name
   ```

3. **Display in Console**

   ```
   The employee's name: John Doe
   Id: EMP001
   Designation: Lecturer
   Salary: 45000.0
   ```

---

## 🌐 Multilingual Support (Bangla)

You can easily localize the prompts. For example:

| English Prompt               | Bangla Prompt                  |
| ---------------------------- | ------------------------------ |
| Enter the name of employee   | কর্মচারীর নাম লিখুন            |
| Enter the ID of employee     | কর্মচারীর আইডি লিখুন           |
| Enter the salary             | বেতন লিখুন                     |
| Employee added successfully! | কর্মচারী সফলভাবে যুক্ত হয়েছে! |
| Employee not found           | কর্মচারী খুঁজে পাওয়া যায়নি   |

---

## 📘 Example Workflow

```text
1. Run the program
2. Select option 1 → Add a new employee
3. Enter name: Afsana
4. Enter ID: EMP22
5. Enter designation: Developer
6. Enter salary: 55000
7. Message: Employee added successfully!
8. Select option 6 → Display all employees
```

