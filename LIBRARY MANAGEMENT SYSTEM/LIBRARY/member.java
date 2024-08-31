import java.util.ArrayList;
import java.util.List;

public class member {
    private String name;
    private String memberId;
    private List<book> borrowedBooks;

    public member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getters and setters
    public String getName() { return name; }
    public String getMemberId() { return memberId; }

    public void borrowBook(book Book) {
        if (Book.isAvailable()) {
            borrowedBooks.add(Book);
            Book.setAvailable(false);
        } else {
            System.out.println("Book is not available.");
        }
    }

    public void returnBook(book Book) {
        borrowedBooks.remove(Book);
        Book.setAvailable(true);
    }
}
