package library;

public class Librarytest {
    public static void main(String[] args) {
        // Create an instance of the Book class
        Book book = new Book("Java Programming", "John Doe");

        // Display book information
        System.out.println(book.getBookInfo());

        // Borrow the book
        System.out.println("Borrowing the book...");
        book.borrowBook();
        System.out.println("Availability after borrowing: " + false);

        // Display book information again
        System.out.println(book.getBookInfo());

        // Return the book
        System.out.println("Returning the book...");
        book.returnBook();
        System.out.println("Availability after returning: " + true);

        // Display final book information
        System.out.println(book.getBookInfo());
    }
}

