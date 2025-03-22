package library;

import java.util.*;

public class Member extends Person implements Borrowable {
    List<Book> borrowedBooks = new ArrayList<>();

    public Member(int id, String name) {
        super(id, name);
    }

    public void borrowBook(Book book) {
        if (borrowedBooks.size() < 3) {
            book.borrowBook();
            borrowedBooks.add(book);
            System.out.println("You have successfully borrowed a copy of \"" + book.title + "\".");
        } else {
            System.out.println("Sorry, you can't borrow any more books until you return your current ones.");
        }
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        book.returnBook();
    }

    public String toString() {
        String borrowedBooksTitle = stringBorrowedBooks();
        String description = "Name: " + name + "\nNumber of borrowed books: " + borrowedBooks.size()
                + "\nList of borrowed books: " + borrowedBooksTitle;
        return description;
    }

    protected String stringBorrowedBooks() {
        if (borrowedBooks.size() > 0) {
            StringJoiner books = new StringJoiner(", ");
            for (Book book : borrowedBooks) {
                books.add("\"" + book.title + "\"");
            }
            return books.toString();
        } else {
            return "";
        }
    }

    public void displayInfo() {
        System.out.println(toString());
    }
}
