// Java Program to Illustrate Application CLass
// To Create The Menu For the Program

// Importing required classes
import java.util.Scanner;

// Class
public class library {

	// Main driver method
	public static void main(String[] args)
	{
		// Creating object of Scanner class
		// to take input from user
		Scanner input = new Scanner(System.in);

		// Displaying menu
		System.out.println(
			"********************Welcome to the  Library!********************");
		System.out.println(
			"				 Select From The Following Options:			 ");
		System.out.println(
			"**********************************************************************");

		// Creating object of book class
		books ob = new books();
		// Creating object of students class
		students obStudent = new students();

		int choice;
		int searchChoice;

		// Creating menu
		// using do-while loop
		do {

			ob.dispMenu();
			choice = input.nextInt();

			// Switch case
			switch (choice) {
			case 1 -> {
                            book b = new book();
                            ob.addBook(b);
                        }
			case 2 -> ob.upgradeBookQty();
			case 3 -> {
                            System.out.println(
                                    " press 1 to Search with Book Serial No.");
                            System.out.println(
                                    " Press 2 to Search with Book's Author Name.");
                            searchChoice = input.nextInt();
                            
                            // Nested switch
                            switch (searchChoice) {
                                case 1 -> ob.searchBySno();
                                case 2 -> ob.searchByAuthorName();
                            }
                            // Case
                            // Case
                                                    }
			case 4 -> ob.showAllBooks();
			case 5 -> {
                            student s = new student();
                            obStudent.addStudent(s);
                        }
			case 6 -> obStudent.showAllStudents();
			case 7 -> obStudent.checkOutBook(ob);
			case 8 -> obStudent.checkInBook(ob);
			default -> // Print statement
				System.out.println("ENTER BETWEEN 0 TO 8.");
			}
                    // Case
                    // Case
                    // Case
                    // Case
                    // Case
                    // Case
                    // Case
                    // Case
                    // Default case that will execute for sure
                    // if above cases does not match
                    
		}

		// Checking condition at last where we are
		// checking case entered value is not zero
		while (choice != 0);
	}
}
