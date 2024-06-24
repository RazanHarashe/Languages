# Language Dashboard

A CRUD application for managing programming languages using Java, JSP, and Spring Boot. This project allows users to create, read, update, and delete language records and persists data in a MySQL database.

## Features

- Display a list of programming languages
- Add a new programming language
- Edit an existing programming language
- View details of a specific programming language
- Delete a programming language

## Technologies Used

- Java
- Spring Boot
- JSP
- MySQL
- Spring Data JPA
- Maven

## Usage

### Viewing All Languages

Navigate to the `/languages` route to view all the programming languages. This page displays a table with the name, creator, and version of each language, along with links to edit and delete each language.

### Adding a New Language

Navigate to the `/languages/new` route to add a new programming language. Fill in the required fields and submit the form.

### Editing a Language

Navigate to the `/languages/{id}/edit` route (where `{id}` is the ID of the language you want to edit). Update the desired fields and submit the form.

### Viewing Language Details

Navigate to the `/languages/{id}` route (where `{id}` is the ID of the language you want to view) to see the details of a specific programming language.

### Deleting a Language

On the `/languages` route, click the "Delete" button next to the language you want to remove.

## Validation

- Name: Minimum 2 characters, Maximum 20 characters
- Creator: Minimum 2 characters, Maximum 20 characters
- Version: Cannot be empty
