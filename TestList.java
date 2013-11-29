import java.util.Scanner;

/**
 * Contact list program that allows the user to add people to the list,
 * visualize the contacts he/she already inputed, search through the contacts by
 * last name, and save his/her contact list to the hard drive.
 */
public class TestList {
	public static void main(String args[]) {
		int runVariable = 0;
		Scanner myScanner = new Scanner(System.in);
		
		List myContactList = new List();
		
		while (runVariable == 0) {
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
				runVariable = 1;
			}

			else
				System.out.println("Invalid input.");
		}

	}
}
	/*
	 * System.out.println("MyContactList should be empty! " +
	 * myContactList.toString()); myContactList.addPerson(person1);
	 * System.out.println("Person1 in myContactList! " +
	 * myContactList.toString());
	 * 
	 * myContactList.printList(); //I DO NOT KNOW HOW TO TEST. SINCE I WANT TO
	 * RETURN OBJECTS
	 * 
	 * myContactList.retrieve("unknown"); myContactList.retrieve("Tj");
	 * //DISPLAY WRONG OUTPUT. IT SHOULD BE RETRIEVE!
	 * }
	 */
