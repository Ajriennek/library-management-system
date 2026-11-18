# **Library Management System**

This project is a Java-based Library Management System developed to demonstrate Object-Oriented Programming (OOP) principles.

The application models basic library operations, including managing books, identifying members, borrowing books and processing returns. 
It uses three Java classes to represent the relationships between books, library members and the library.

**The implemented features include:**

- Book management: Stores book titles, authors and availability status 
- Member identification: Stores library member names and unique IDs 
- Book borrowing: Allows members to borrow books that are available 
- Borrowing validation: Prevents members from borrowing books that are already unavailable 
- Return management: Allows members to return books they have previously borrowed 
- Return validation: Checks whether a member has borrowed a book before processing its return 
- Library collection validation: Checks whether a book belongs to the library before processing a return 
- Availability management: Updates book availability when books are borrowed and returned 
- Operation feedback: Borrowing and returning methods return Boolean values to indicate whether an operation was successful 
- Code documentation: Uses Javadoc comments to explain classes, constructors, methods, parameters and return values 

**Tech Stack**

Java – Programming language

Object-Oriented Programming – Application design

Git – Version control

GitHub – Repository hosting

VSCode – Development environment

**Installation and Usage**

**Prerequisites:**
- Java Development Kit (JDK)
- Java-compatible IDE
- Git (if cloning the repository)

**Clone the repository:**
```python
git clone <"repository-url">
```
**Navigate into the project directory:**

```python
cd library-management-system
```
**Compile the Application**

Compile the Java source files into an output directory:

```python
javac -d out src/*.java
```
Run the Test Class

```python
java -cp out BorrowBookTest
```
**Testing**

The borrowing and returning functionality can be tested using **BorrowBookTest.java.**

The tests cover:

- Successfully borrowing an available book.
- Preventing a second borrowing attempt when the book is unavailable.
- Successfully returning a borrowed book.
- Borrowing a book again after it has been returned.
- Checking that the library does not process returns for books outside its collection.

**Expected Boolean results include:**

| **Operation** | **Expected result** |
|---|---|
| Borrow an available book | true |
| Borrow an unavailable book | false |
| Return a borrowed book | true |
| Return a book not borrowed by the member | false |

**Developer Guidance**

Developers should review **Book.java**, **LibraryMember.java** and **Library.java** to understand how the classes interact.
Each class has a specific responsibility, supporting code organisation, encapsulation and maintainability.
Javadoc comments are provided to explain the purpose of classes and methods, including their parameters and return values.

**Version Control**

The project uses Git for version control.

Development improvements are made on separate branches to keep changes organised and allow them to be reviewed before being merged into the main branch.