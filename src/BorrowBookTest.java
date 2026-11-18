public class BorrowBookTest {
    public static void main(String[] args) {

        // Create a member and a book
        LibraryMember member = new LibraryMember("Ava", 101);
        Book book = new Book("Java Basics", "John Smith");

        // First borrowing attempt
        boolean firstAttempt = member.borrowBook(book);
        System.out.println("First attempt: " + firstAttempt);

        // Second borrowing attempt
        boolean secondAttempt = member.borrowBook(book);
        System.out.println("Second attempt: " + secondAttempt); 

        // Return the book
        boolean returnAttempt = member.returnBook(book);
        System.out.println("Return successful: " + returnAttempt);

        // Third borrowing attempt
        boolean thirdAttempt = member.borrowBook(book);
        System.out.println("Third attempt: " + thirdAttempt);

        // Create a Library
        Library library = new Library();

        // Add the existing book to the library
        library.addBook(book);

        // Return the book through the library
        library.receiveBook(book, member);

        // Check whether the book is available
        System.out.println("Book available: " + book.isAvailable());

        // Create a book that does not belong to the library
        Book outsideBook = new Book("Advanced Python", "Jane Smith");

        // Try to return the unregistered book
        library.receiveBook(outsideBook, member);

        // Check its availability
        System.out.println("Outside book available: " + outsideBook.isAvailable());
    }
}
