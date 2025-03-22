import java.util.*;

import library.*;

public class LibraryApp {
    public static void main(String[] args) {
        Library cityLibrary = new Library();

        Book book1 = new Book(1, "Kafka on The Shore", "Haruki Murakami", 5);
        Book book2 = new Book(2, "Norwegian Wood", "Haruki Murakami", 5);
        Book book3 = new Book(3, "The Wind-Up Bird Chronicle", "Haruki Murakami", 5);
        Book book4 = new Book(4, "Title 4", "Haruki Murakami", 5);
        Book book5 = new Book(5, "Title 5", "Haruki Murakami", 5);
        Book book6 = new Book(6, "Title 6", "Haruki Murakami", 5);

        cityLibrary.addBook(book1);
        cityLibrary.addBook(book2);
        cityLibrary.addBook(book3);
        cityLibrary.addBook(book4);
        cityLibrary.addBook(book5);
        cityLibrary.addBook(book6);

        Member member1 = new Member(1, "Budi Awan");
        Member member2 = new Member(2, "Toni Awan");
        StaffMember staffMember1 = new StaffMember(3, "Ani Awan", "Librarian");

        cityLibrary.registerMember(member1);
        cityLibrary.registerMember(member2);
        cityLibrary.registerMember(staffMember1);

        cityLibrary.findBookByTitle("nOrweGiAN wOOd");
        System.out.println();
        cityLibrary.displayAvailableBooks();
        System.out.println();
        System.out.println(book1.toString());
        System.out.println();

        member1.borrowBook(book1);
        member1.borrowBook(book2);
        member1.borrowBook(book3);
        System.out.println();
        member1.displayInfo();
        System.out.println();
        member1.borrowBook(book4);
        System.out.println();
        member1.displayInfo();
        System.out.println();
        cityLibrary.displayAvailableBooks();
        System.out.println();

        staffMember1.borrowBook(book1);
        staffMember1.borrowBook(book2);
        staffMember1.borrowBook(book3);
        staffMember1.borrowBook(book4);
        staffMember1.borrowBook(book5);
        System.out.println();
        staffMember1.displayInfo();
        System.out.println();
        staffMember1.borrowBook(book6);
        System.out.println();
        staffMember1.displayInfo();
        System.out.println();
        cityLibrary.displayAvailableBooks();
        System.out.println();

        member1.returnBook(book1);
        member1.returnBook(book2);
        member1.returnBook(book3);
        member1.displayInfo();
        System.out.println();

        staffMember1.returnBook(book1);
        staffMember1.returnBook(book2);
        staffMember1.returnBook(book3);
        staffMember1.returnBook(book4);
        staffMember1.returnBook(book5);
        staffMember1.displayInfo();
        System.out.println();
        cityLibrary.displayAvailableBooks();

        Book book7 = new Book(7, "Title 7", "Haruki Murakami", 1);
        cityLibrary.addBook(book7);
        System.out.println();
        cityLibrary.displayAvailableBooks();
        System.out.println();

        member2.borrowBook(book7);
        System.out.println();
        staffMember1.borrowBook(book7);
        System.out.println();
        staffMember1.returnBook(book7);
        System.out.println();

        member2.displayInfo();
        System.out.println();
        staffMember1.displayInfo();
    }
}