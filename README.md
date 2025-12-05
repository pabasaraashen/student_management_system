
# 🎓 Student Management System Java OOP

A desktop application built with Java Swing that demonstrates Object-Oriented Programming principles for managing student records with a simple file-based persistence layer.

## Features

- **User Authentication**: Secure login system to access the management interface
- **CRUD Operations**: Complete Create, Read, Update, and Delete functionality for student records
- **Search Functionality**: Filter students by grade level
- **Data Persistence**: File-based storage system for maintaining student records
- **Interactive GUI**: User-friendly interface built with Java Swing

## Project Structure

```
StudentManagementSystem/
├── GUI/
│   ├── LoginGUI.java          # Login interface
│   └── ManageGUI.java          # Main management interface
└── Data/
    ├── Student.java            # Student data model
    ├── Istudent.java           # Interface defining CRUD operations
    └── StudentDB.java          # Database implementation with file I/O
```

## OOP Concepts Demonstrated

### Encapsulation
- **Student class**: Private fields with public getter methods protect data integrity
- Student attributes (firstName, lastName, gender, age, grade) are encapsulated with controlled access

### Abstraction
- **Istudent interface**: Defines abstract methods for database operations without exposing implementation details
- Separates the contract from implementation

### Inheritance & Implementation
- **StudentDB class**: Implements the Istudent interface, providing concrete implementations of all abstract methods

### Separation of Concerns
- **GUI package**: Handles presentation layer
- **Data package**: Manages business logic and data persistence
- Clear separation between UI and data management

## Technologies Used

- **Java SE**: Core programming language
- **Java Swing**: GUI framework for desktop interface
- **File I/O**: Text-based data persistence
- **NetBeans IDE**: Development environment

## How to Run

1. Clone the repository:
```bash
git clone https://github.com/yourusername/student-management-system.git
```

2. Open the project in NetBeans IDE or your preferred Java IDE

3. Update the file path in `StudentDB.java`:
```java
File file = new File("YOUR_PATH/StudentDetails.txt");
```

4. Run the `LoginGUI.java` file to start the application

5. Default login credentials:
   - **Username**: Teacher
   - **Password**: 123
     (You can customize it)

## Usage

### Adding Students
1. Fill in student details (First Name, Last Name, Age, Gender, Grade)
2. Click the **Insert** button
3. Record is saved to the file system

### Viewing Students
- Click the **View** button to display all student records in the table

### Searching Students
1. Select a grade from the dropdown menu
2. Click the **Search** button to filter students by grade

### Updating Students
1. Click on a student record in the table to populate the form
2. Modify the desired fields
3. Click the **Update** button to save changes

### Deleting Students
1. Click on a student record in the table to select it
2. Click the **Delete** button
3. Confirm the deletion

## Student Data Model

Each student record contains:
- Student ID (Integer)
- First Name (String)
- Last Name (String)
- Gender (Male/Female)
- Age (Integer)
- Grade (1-13)

## File Storage Format

Student data is stored in a colon-delimited text file:
```
FirstName:LastName:Gender:Age:Grade
John:Doe:Male:15:10
Jane:Smith:Female:16:11
```

## Future Enhancements

- Database integration (MySQL/PostgreSQL)
- Password encryption for security
- User role management
- Export data to CSV/Excel
- Student photo upload
- Report generation
- Attendance tracking

## Requirements

- Java Development Kit (JDK) 8 or higher
- NetBeans IDE (recommended) or any Java IDE


<img width="1920" height="1080" alt="Screenshot (158)" src="https://github.com/user-attachments/assets/f633e1a8-8cd1-4439-97b7-1483c8a9ec01" />

<img width="1920" height="1080" alt="Screenshot (159)" src="https://github.com/user-attachments/assets/0aea7a56-df50-4dd7-841a-0469e1d38c05" />

<img width="1920" height="1080" alt="Screenshot (157)" src="https://github.com/user-attachments/assets/350e9875-10f7-455c-9da9-93e5bd507e64" />

<img width="1920" height="1080" alt="Screenshot (160)" src="https://github.com/user-attachments/assets/415901fb-7b0d-4e86-b005-0e91f754b3b6" />


