Event Ticket Platform

Tech Stack: React.js, Java, Spring Boot, MySQL, REST APIs, Keycloak, Docker

A full-stack Event Management System enabling event creation, ticket booking, and real-time ticket validation. Built with modern web technologies and secure authentication to provide a seamless user experience.

Features

User Authentication & Authorization:

Secure login and role-based access using Keycloak and Spring Security.

Keycloak deployed via Docker for easy setup.

Event Management:

Create, update, and manage events.

Users can view event details and book tickets in real-time.

Ticket Management:

QR code generation for booked tickets.

QR code scanning for ticket verification at events.

Database:

Optimized MySQL database for storing event and ticket data efficiently.

Frontend:

Responsive UI built with React.js.

Seamless integration with backend REST APIs.

Deployment:

Dockerized Keycloak for authentication management.

Backend and frontend ready for deployment on any platform.

Installation & Setup

1.Clone the repository:

git clone https://github.com/YourUsername/Event-Ticket-Platform.git


2.Setup Keycloak via Docker:

docker run -p 8080:8080 -e KEYCLOAK_USER=admin -e KEYCLOAK_PASSWORD=admin quay.io/keycloak/keycloak:latest start-dev


3.Backend (Spring Boot):

Navigate to backend folder:

cd backend


Configure MySQL database in application.properties.

Run the Spring Boot application:

mvn spring-boot:run


4.Frontend (React.js):

Navigate to frontend folder:

cd frontend


Install dependencies and start:

npm install
npm start

Usage

1.Register or login using Keycloak credentials.

2.Browse or create events.

3.Book tickets and view QR code.

4.Validate tickets using QR code scanning at the event.
