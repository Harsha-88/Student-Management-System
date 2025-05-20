🎓 Student Management System

A **simple yet powerful Student Management System** built using **Spring Boot**, **H2 Database**, and a **Bootstrap-styled frontend**. This full-stack project allows you to add, update, delete, and view student records — perfect for showcasing Java backend development skills.

---

## 🚀 Features

- ✅ Add a new student with name and course
- ✅ Update student details by ID
- ✅ Delete a student by ID
- ✅ View all students in a responsive table
- ✅ RESTful API endpoints for each operation
- ✅ Frontend built using HTML + Bootstrap
- ✅ Backend powered by Spring Boot and H2 in-memory DB
- ✅ Easy setup with embedded Tomcat server

---

## 🧠 Technologies Used

| Layer     | Technology                        |
|-----------|------------------------------------|
| Frontend  | HTML, CSS (Bootstrap)              |
| Backend   | Spring Boot (Java)                 |
| Database  | H2 In-Memory Database              |
| Tools     | IntelliJ IDEA, Postman, Git, GitHub|

---

## 📁 Project Structure

```
student-management/
├── src/
│ ├── main/
│ │ ├── java/com/student/student_management/
│ │ │ ├── Student.java
│ │ │ ├── StudentController.java
│ │ │ └── StudentRepository.java
│ │ └── resources/
│ │ ├── application.properties
│ │ └── static/index.html
└── README.md

```

How to Run
Clone the repo:
git clone https://github.com/your-username/student-management.git

Open the project in IntelliJ (or any Java IDE).

Run the main class:
StudentManager.java

Once running, open in browser:
👉 http://localhost:8080/ – Main UI
👉 http://localhost:8080/h2-console – H2 Database Console
JDBC URL: jdbc:h2:mem:students
User: sa
Password: (leave blank)
