package library;

import java.util.*;

import exceptions.BookNotAvailableException;
import exceptions.BookNotBorrowedException;

public class Member extends Person implements Borrowable {
    List<Book> borrowedBooks = new ArrayList<>();

    public Member(int id, String name) {
        super(id, name);
    }

    public void borrowBook(Book book) {
        if (borrowedBooks.size() < 3) {
            try {
                if (book.availableCopies < 1) {
                    throw new BookNotAvailableException("The book \"" + book.title + "\" is not available.");
                }

                book.borrowBook();
                borrowedBooks.add(book);
                System.out.println("You have successfully borrowed a copy of \"" + book.title + "\".");
            } catch (BookNotAvailableException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } else {
            System.out.println("Sorry, you can't borrow any more books until you return your current ones.");
        }
    }

    public void returnBook(Book book) {
        try {
            if (!borrowedBooks.contains(book)) {
                throw new BookNotBorrowedException(
                        "Returning failed because you are not currently borrowing any copies of the book \""
                                + book.title + "\".");
            }

            borrowedBooks.remove(book);
            book.returnBook();
            System.out.println("You have successfully returned a copy of the book \"" + book.title + "\".");
        } catch (BookNotBorrowedException e) {
            System.out.println("Error: " + e.getMessage());
        }
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
