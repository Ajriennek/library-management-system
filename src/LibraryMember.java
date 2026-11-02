import java.util.ArrayList;
import java.util.List;

/**
 * Represents a registered library member.
 */

public class LibraryMember {

    private final String memberName;
    private final int memberId;
    private final List<Book> borrowedBooks;

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

    public List<Book> getBorrowedBooks() {
        return new ArrayList<>(borrowedBooks);
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.borrowBook();
            borrowedBooks.add(book);
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            book.returnBook();
        }
    }
}
