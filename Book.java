// File: library/Book.java
package library;

public class Book {
    // Private Attributes
    private String title;
    private String author;
    private boolean isAvailable;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true; // By default, the book is available
    }

    // Method to borrow the book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Borrowed successfully!");
        } else {
            System.out.println("The book is already borrowed.");
        }
    }

    // Method to return the book
    public void returnBook() {
        isAvailable = true;
        System.out.println("Returned successfully!");
    }

    // Method to get the book info
    public String getBookInfo() {
        return "Book Title: \"" + title + "\"\nAuthor: \"" + author + "\"\nAvailability: " + isAvailable;
    }
}
