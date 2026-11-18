import java.util.ArrayList;
import java.util.List;

/**
 * Manages the library's book collection.
 */

public class Library {

    private final List<Book> books;

    /**
     * Creates an empty library.
     */

    public Library() {
        this.books = new ArrayList<>();
    }

    /**
     * Adds a book to the library's collection.
     *
     * @param book the book to add
     */

    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * Retrieves all books currently available to borrow.
     *
     * @return a list of available books
     */

    public List<Book> getAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();

        for (Book book : books) {
            if (book.isAvailable()) {
                availableBooks.add(book);
            }
        }

        return availableBooks;
    }

    /**
     * Lends a book to a library member if the book belongs to the library.
     *
     * @param book the book to lend
     * @param member the member borrowing the book
     */

    public void lendBook(Book book, LibraryMember member) {
        if (books.contains(book)) {
            member.borrowBook(book);
        }
    }

    /**
     * Receives a book returned by a library member if it belongs to the library.
     *
     * @param book the book being returned
     * @param member the member returning the book
     */

    public void receiveBook(Book book, LibraryMember member) {
        if (books.contains(book)) {
            member.returnBook(book);
        }
    }
}
