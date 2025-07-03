# Spring Boot Hello World — @RestController vs @Controller

This is a beginner-friendly Spring Boot project that demonstrates the difference between `@RestController` and `@Controller` in a simple and easy-to-understand way.

---

## 🚀 What You’ll Learn

- How to set up a basic Spring Boot application
- How `@RestController` returns plain responses (used in APIs)
- How `@Controller` returns HTML views using Thymeleaf
- How to organize controller classes
- How to add dependencies and configure your project for web development

---

## 🧾 Project Structure

spring-boot-crud/
├── src/
│ └── main/
│ ├── java/
│ │ └── com.example.demo/
│ │ ├── DemoApplication.java
│ │ └── controller/
│ │ ├── ApiController.java // Uses @RestController
│ │ └── ViewController.java // Uses @Controller
│ └── resources/
│ └── templates/
│ └── welcome.html // Thymeleaf HTML view
├── pom.xml
└── README.md

🔧 How to Run This Project
Clone the repository:

bash

git clone https://github.com/ssakibb0/Spring-boot-Diff-btw-controller-RestController.git
cd Spring-boot-Diff-btw-controller-RestController
Build and run the app using Maven:

bash

./mvnw spring-boot:run
Open your browser and visit:
http://localhost:8080/hello
http://localhost:8080/web/hello

📦 Dependencies Used
Spring Boot Starter Web

Spring Boot Starter Thymeleaf

Maven (build tool)

Java 17+ or Java 22

