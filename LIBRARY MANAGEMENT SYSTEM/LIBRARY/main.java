import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        library Library = new library();
        Scanner scanner = new Scanner(System.in);

        // Sample code for console UI
        while (true) {
            System.out.println("1. Add Book");
            System.out.println("2. Search Book");
            System.out.println("3. Register Member");
            System.out.println("4. Borrow Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add book
                    System.out.println("Enter book title:");
                    String title = scanner.nextLine();
                    System.out.println("Enter book author:");
                    String author = scanner.nextLine();
                    System.out.println("Enter book ISBN:");
                    String ISBN = scanner.nextLine();
                    Library.addBook(new book(title, author, ISBN));
                    break;
                case 2:
                    // Search book
                    System.out.println("Enter book title to search:");
                    title = scanner.nextLine();
                    book Book = Library.searchBookByTitle(title);
                    if (Book != null) {
                        System.out.println("Book found: " + Book.getTitle());
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 3:
                    // Register member
                    System.out.println("Enter member name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter member ID:");
                    String memberId = scanner.nextLine();
                    Library.addMember(new member(name, memberId));
                    break;
                case 4:
                    // Borrow book
                    System.out.println("Enter member ID:");
                    memberId = scanner.nextLine();
                    System.out.println("Enter book title:");
                    title = scanner.nextLine();
                    member Member = Library.searchMemberById(memberId);
                    Book = Library.searchBookByTitle(title);
                    if (Member != null && Book != null) {
                        Member.borrowBook(Book);
                    } else {
                        System.out.println("Member or book not found.");
                    }
                    break;
                case 5:
                    // Return book
                    System.out.println("Enter member ID:");
                    memberId = scanner.nextLine();
                    System.out.println("Enter book title:");
                    title = scanner.nextLine();
                    Member = Library.searchMemberById(memberId);
                    Book = Library.searchBookByTitle(title);
                    if (Member != null && Book != null) {
                        Member.returnBook(Book);
                    } else {
                        System.out.println("Member or book not found.");
                    }
                    break;
                case 6:
                    // Exit1
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
