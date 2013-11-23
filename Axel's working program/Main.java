import java.util.Scanner;

/**
 * Contact list program that allows the user to add people to the list,
 * visualize the contacts he/she already inputed, search through the contacts by
 * last name, and save his/her contact list to the hard drive.
 * 
 * AC
 */
public class Main {
	public static void main(String args[]) {
		Ancillary run = new Ancillary();
		int runVariable = 0;

		run.startUp();

		while (runVariable == 0) {
			int userChoice = run.mainMenu();

			if (userChoice == 1) 
				run.addPerson();
			else if (userChoice == 2)
				run.printList();
			else if (userChoice == 3)
				run.search();
			else if (userChoice == 4) {
				run.exit();
				runVariable = 1;
			} 
			else
				System.out.println("Invalid input.");
		}

	}

}
