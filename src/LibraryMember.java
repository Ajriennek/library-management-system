import java.util.ArrayList;
import java.util.List;

/**
 * Represents a registered library member.
 */

public class LibraryMember {

    private final String memberName;
    private final int memberId;
    private final List<Book> borrowedBooks;

    /**
     * Creates a library member with a name and ID.
     *
     * @param memberName the name of the library member
     * @param memberId the unique ID of the library member
     */

    public LibraryMember(String memberName, int memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getMemberName() {
        return memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    /**
     * Retrieves the list of books borrowed by the member.
     *
     * @return a list of the member's borrowed books
     */

    public List<Book> getBorrowedBooks() {
        return new ArrayList<>(borrowedBooks);
    }

    /**
     * Allows a library member to borrow an available book.
     *
     * @param book the book the member wants to borrow
     * @return true if the book was successfully borrowed,
     *         false if the book is unavailable
     */

    public boolean borrowBook(Book book) {
        if (book.isAvailable()) {
            book.borrowBook();
            borrowedBooks.add(book);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Allows a library member to return a book they have borrowed.
     *
     * @param book the book the member wants to return
     * @return true if the book was successfully returned,
     *         false if the member did not borrow the book
     */

    public boolean returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            book.returnBook();
            return true;
        } else {
            return false;
        }
    }
}
