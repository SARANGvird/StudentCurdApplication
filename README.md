# Student CRUD Application

This is a simple CRUD (Create, Read, Update, Delete) application for managing student information. It provides RESTful APIs for interacting with student data.

## Table of Contents

- [Features](#features)
- [Endpoints](#endpoints)
- [Setup](#setup)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Features

- Create, Read, Update, and Delete student records.
- Retrieve a list of all students or a specific student by ID.
- Support for pagination and sorting when retrieving a list of students.

## Endpoints

- **GET /api/students:** Get a list of all students.
- **GET /api/students/{id}:** Get details of a specific student by ID.
- **POST /api/students:** Create a new student.
- **PUT /api/students/{id}:** Update details of a specific student by ID.
- **DELETE /api/students/{id}:** Delete a student by ID.

## Setup

1. Clone the repository:

   ```bash
   git clone <repository-url>
