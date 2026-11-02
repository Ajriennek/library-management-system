import java.util.ArrayList;
import java.util.List;

/**
 * Manages the library's book collection.
 */

public class Library {

    private final List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();

        for (Book book : books) {
            if (book.isAvailable()) {
                availableBooks.add(book);
            }
        }

        return availableBooks;
    }

    public void lendBook(Book book, LibraryMember member) {
        if (books.contains(book)) {
            member.borrowBook(book);
        }
    }

    public void receiveBook(Book book, LibraryMember member) {
        member.returnBook(book);
    }
}
