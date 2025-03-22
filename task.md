# _Java OOP Exercise: Library Management System_

## _Objective_

Build a simple _Library Management System_ using _Object-Oriented Programming (OOP) principles_ in Java. This system should allow users to manage books, members, and basic library operations.

---

## _Requirements_

- **Book**

  - Attributes: bookId, title, author, availableCopies
  - Methods: borrowBook(), returnBook(), toString()

- **Member**

  - Attributes: memberId, name, borrowedBooks (List<Book>)
  - Methods: borrowBook(Book book), returnBook(Book book), toString()

- **Library**
  - Attributes: books (List<Book>), members (List<Member>)
  - Methods: addBook(Book book), registerMember(Member member), findBookByTitle(String title), displayAvailableBooks()

---

- **StaffMember**
  - Inherits from Member
  - Additional Attributes: position (e.g., Librarian, Assistant)
  - Override borrowBook() to allow staff to borrow more books than regular members.

---

- **Person**
  - Attributes: id, name
  - Abstract Method: displayInfo()
- **Borrowable (Interface)**
  - Method: borrowBook(Book book), returnBook(Book book)

Member and StaffMember should implement Borrowable.

---

### _4. Implementation Details_

- Create a _main program_ (LibraryApp.java) where:
  1. Books and members are added to the library.
  2. A member borrows and returns a book.
  3. The system displays available books.
  4. Staff members have special borrowing privileges.

---

### _Bonus Challenge_

- Implement _Exception Handling_ for cases like:
  - Borrowing a book that is not available.
  - Returning a book not borrowed.
