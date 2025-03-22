package library;

public class StaffMember extends Member {
    String position = "Librarian";

    public StaffMember(int id, String name, String position) {
        super(id, name);
        this.position = position;
    }

    public String toString() {
        String borrowedBooksTitle = stringBorrowedBooks();
        String description = "Name: " + name + "\nPosition: " + position + "\nNumber of borrowed books: "
                + borrowedBooks.size()
                + "\nList of borrowed books: " + borrowedBooksTitle;
        return description;
    }

    public void borrowBook(Book book) {
        if (borrowedBooks.size() < 5) {
            book.borrowBook();
            borrowedBooks.add(book);
            System.out.println("You have successfully borrowed a copy of \"" + book.title + "\".");
        } else {
            System.out.println("Sorry, you can't borrow any more books until you return your current ones.");
        }
    }
}
