import  java.util.*;
public class librarian extends member {
    public librarian(String name, String memberId) {
        super(name, memberId);
    }

    public void addBook(book Book, List<book> books) {
        books.add(Book);
        System.out.println("Book added successfully.");
    }

    public void removeBook(book Book, List<book> books) {
        books.remove(Book);
        System.out.println("Book removed successfully.");
    }

    public void registerMember(member Member, List<member> members) {
        members.add(Member);
        System.out.println("Member registered successfully.");
    }
}
