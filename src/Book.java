/**
 * Represents a book in the library.
 */

public class Book {

    private final String title;
    private final String author;
    private boolean available;

    /**
     * Creates a book with a title and author.
     *
     * @param title the title of the book
     * @param author the author of the book
     */

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    /**
     * Checks whether the book is available to borrow.
     *
     * @return true if the book is available, false otherwise
     */

    public boolean isAvailable() {
        return available;
    }

    /**
     * Marks the book as borrowed and unavailable.
     */

    public void borrowBook() {
        if (available) {
            available = false;
        }
    }

    /**
     * Marks the book as available after being returned.
     */
    
    public void returnBook() {
        available = true;
    }
}
