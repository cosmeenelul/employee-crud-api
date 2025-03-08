# Employee CRUD API

## RO LANGUAGE ![RomaniaFlagOfRomaniaGIF](https://github.com/user-attachments/assets/037ebdf5-726e-4b7c-9144-fe8a4189404f)


## Descriere
Acest proiect este o aplicație **Spring Boot** care implementează un **CRUD API** pentru gestionarea angajaților. API-ul permite efectuarea operațiunilor de creare, citire, actualizare și ștergere (Create, Read, Update, Delete) asupra unei baze de date de angajați.

## Tehnologii folosite
- **Java 17+**
- **Spring Boot**
- **Spring Data JPA**
- **MySQL**
- **Maven**

## Instalare și rulare
1. Clonează repository-ul:
   ```sh
   git clone https://github.com/cosmeenelul/employee-crud-api.git
   ```
2. Accesează directorul proiectului:
   ```sh
   cd employee-crud-api
   ```
3. Build și rulare aplicație:
   ```sh
   mvn spring-boot:run
   ```
4. Aplicația va rula pe `http://localhost:8080`

## Endpoint-uri API

### 1. Obținerea tuturor angajaților
**GET** `/api/employees`
- Răspuns: listă de angajați în format JSON

### 2. Obținerea unui angajat după ID
**GET** `/api/employees/{employeeId}`
- Răspuns: obiect `Employee`
- Dacă ID-ul nu există, returnează o eroare

### 3. Adăugarea unui angajat
**POST** `/api/employees`
- Body: obiect JSON `Employee`
- Răspuns: angajatul nou creat

### 4. Actualizarea unui angajat
**PUT** `/api/employees`
- Body: obiect JSON `Employee`
- Răspuns: angajatul actualizat

### 5. Ștergerea unui angajat după ID
**DELETE** `/api/employees/{employeeId}`
- Răspuns: mesaj de confirmare

## Contribuție
Dacă dorești să contribui la acest proiect:
1. Fork repository-ul
2. Creează un branch nou (`git checkout -b feature/noua-functionalitate`)
3. Fă commit și push la modificări (`git push origin feature/noua-functionalitate`)
4. Creează un pull request

## Autor
[cosmeenelul](https://github.com/cosmeenelul)

## EN LANGUAGE ![BritainFlagGIF](https://github.com/user-attachments/assets/c406e892-6460-485d-9905-da2330f57ab1)

## Description
This project is a **Spring Boot** application that implements a **CRUD API** for managing employees. The API allows performing create, read, update, and delete (CRUD) operations on an employee database.

## Technologies Used
- **Java 17+**
- **Spring Boot**
- **Spring Data JPA**
- **MySQL**
- **Maven**

## Installation and Running
1. Clone the repository:
   ```sh
   git clone https://github.com/cosmeenelul/employee-crud-api.git
   ```
2. Navigate to the project directory:
   ```sh
   cd employee-crud-api
   ```
3. Build and run the application:
   ```sh
   mvn spring-boot:run
   ```
4. The application will run on `http://localhost:8080`

## API Endpoints

### 1. Get all employees
**GET** `/api/employees`
- Response: list of employees in JSON format

### 2. Get an employee by ID
**GET** `/api/employees/{employeeId}`
- Response: `Employee` object
- If the ID does not exist, returns an error

### 3. Add a new employee
**POST** `/api/employees`
- Body: JSON `Employee` object
- Response: newly created employee

### 4. Update an employee
**PUT** `/api/employees`
- Body: JSON `Employee` object
- Response: updated employee

### 5. Delete an employee by ID
**DELETE** `/api/employees/{employeeId}`
- Response: confirmation message

## Contribution
If you want to contribute to this project:
1. Fork the repository
2. Create a new branch (`git checkout -b feature/new-feature`)
3. Commit and push your changes (`git push origin feature/new-feature`)
4. Create a pull request

## Author
[cosmeenelul](https://github.com/cosmeenelul)


