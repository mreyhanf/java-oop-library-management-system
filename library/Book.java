package library;

public class Book {
    int bookId;
    String title;
    String author;
    int availableCopies;

    public Book(int bookId, String title, String author, int availableCopies) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.availableCopies = availableCopies;
    }

    void borrowBook() {
        this.availableCopies -= 1;
    }

    void returnBook() {
        this.availableCopies += 1;
    }

    public String toString() {
        String description = "Title: " + this.title + "\nAuthor: " + this.author + "\nAvailable copies: "
                + this.availableCopies;
        return description;
    }
}
