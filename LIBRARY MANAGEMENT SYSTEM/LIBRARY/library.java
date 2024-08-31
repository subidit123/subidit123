import java.util.ArrayList;
import java.util.List;

public class library {
    private List<book> books;
    private List<member> members;
    private List<librarian> librarians;

    public library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
        librarians = new ArrayList<>();
    }

    // Methods to manage books, members, and borrowing processes
    public void addBook(book Book) {
        books.add(Book);
    }

    public void removeBook(book Book) {
        books.remove(Book);
    }

    public void addMember(member Member) {
        members.add(Member);
    }

    public void addLibrarian(librarian Librarian) {
        librarians.add(Librarian);
    }

    // Search functionality
    public book searchBookByTitle(String title) {
        for (book  Book : books) {
            if (Book.getTitle().equalsIgnoreCase(title)) {
                return Book;
            }
        }
        return null;
    }

    public member searchMemberById(String memberId) {
        for (member Member : members) {
            if (Member.getMemberId().equals(memberId)) {
                return Member;
            }
        }
        return null;
    }
}
