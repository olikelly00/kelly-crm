# Contact Management System

## Project Overview

A simple **Console-Based Contact Management System** built in **Java**. It allows users to:
- Add new contacts
- View all contacts
- Update existing contacts
- Delete contacts

This project helped me learn key Java concepts like object-oriented programming (OOP), handling collections (`ArrayList`), and interacting with users via the console using `Scanner`.

## Features

- **Add Contact**: Input contact details such as ID, name, email, phone number, company, and tags.
- **View All Contacts**: Displays all stored contacts.
- **Update Contact**: Modify contact details by ID.
- **Delete Contact**: Remove a contact by ID.
- **Exit**: Terminate the program.

## How to Use

1. **Run the Program**:
   - Compile the project:
     ```bash
     javac -d bin src/**/*.java
     ```
   - Run the program:
     ```bash
     java -cp bin main.Main
     ```

2. **Menu Options**:
- Add Contact
- View All Contacts
- Update Contact
- Delete Contact
- Exit



Follow the prompts to input data and manage contacts.

## What I Learned

- **OOP Basics**: Implemented `Contact` and `Database` classes with methods for contact management.
- **Console Input**: Used `Scanner` to handle user input, including managing integer and string inputs effectively.
- **ArrayList**: Stored contacts in a dynamic list and performed operations like search, update, and delete.

## Challenges Overcome

- **Handling Mixed Input**: Learned to handle different input types and manage scanner buffer issues with `scanner.nextLine()`.
- **Contact Management**: Implemented searching and modifying contacts using loops and conditionals.
- **Error Handling**: Managed cases like non-existing contacts when updating or deleting.

## Future Improvements

- **Data Persistence**: Store contacts in a file or database for permanent storage.
- **Input Validation**: Add checks for valid email formats and numeric phone numbers.
- **Search Functionality**: Implement a search feature by name, email, or tags.
