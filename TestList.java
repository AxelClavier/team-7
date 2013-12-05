import java.util.Scanner;

/**
 * Contact list program that allows the user to add people to the list,
 * visualize the contacts he/she already inputed, search through the contacts by
 * last name, and save his/her contact list to the hard drive.
 */
public class testList {
	public static void main(String args[]) {
		Boolean run = true;
		Scanner myScanner = new Scanner(System.in);
		
		List myContactList = new List();
		
		while (run == true) {
			int userChoice = myContactList.mainMenu();

			if (userChoice == 1)
				myContactList.addPerson();

			else if (userChoice == 2) 
				myContactList.printList();
			

			else if (userChoice == 3) {
				System.out.println("------------------");
				System.out
						.println(" What is the last name of the person you are looking for? ");
				String search = myScanner.nextLine();

			}

			else if (userChoice == 4) {
				System.out.println("------------------");
				System.out.println("Ta-ta for now!\nProgram terminated.");
				System.out.println("------------------");
				run = false;
			}

			else
				System.out.println("\nInvalid input, please try again.");
		}

	}
}


