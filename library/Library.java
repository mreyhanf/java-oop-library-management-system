package library;

import java.util.*;

public class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBook(Book book) {
        if (!books.contains(book)) {
            books.add(book);
        } else {
            System.out.println("The book \"" + book.title + "\" is already in the library's collections.");
        }
    }

    public void registerMember(Member member) {
        members.add(member);
    }

    public void findBookByTitle(String title) {
        for (Book book : books) {
            if (book.title.toLowerCase().equals(title.toLowerCase())) {
                System.out.println(book.toString());
                return;
            }
        }
        System.out.println("Sorry, we don't have \"" + title + "\"" + "in our collections yet.");
    }

    public void displayAvailableBooks() {
        System.out.println("Books available to borrow:\n============================");
        for (Book book : books) {
            if (book.availableCopies >= 1) {
                System.out.println(book.toString() + "\n---------------------------");
            }
        }
    }
}
