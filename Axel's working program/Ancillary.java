import java.util.Scanner;

public class Ancillary {
	private int numberOfContacts = 0;
	private String[] fullContacts = new String[100];
	private String[] lastNames = new String[100];
	
	
	/**
	 * Searches to see if there is an existing
	 * contact list .txt file on the hard drive.
	 * If there is, it loads it and returns to the main.
	 * If there isn't, it returns to the main program.
	 */
	public void startUp (){
	
	}
	
	/**
	 * Prompts the user to enter a new contact's information
	 * and then stores that information in an array.
	 */
	public void addPerson (){
		Person newContact = new Person();
		Scanner input = new Scanner(System.in);
		int i = 0;
		
		System.out.println("------------------");
		System.out.println("1. Add new person");
		
		System.out.print("  Name: ");
		String name = input.nextLine();
		newContact.setFirstName(name);
		
		System.out.print("  Last name: ");
		String surname = input.nextLine();
		newContact.setLastName(surname);
		
		System.out.print("  Street address: ");
		String streetAddress = input.nextLine();
		newContact.setStreetAddress(streetAddress);
		
		System.out.print("  Email: ");
		String email = input.nextLine();
		newContact.setEmailAddress(email);
		
		System.out.print("  Phone: ");
		String phone = input.nextLine();
		newContact.setPhoneNumber(phone);
		
		System.out.print("  Notes: ");
		String notes = input.nextLine();
		newContact.setNotes(notes);

		fullContacts[numberOfContacts] = newContact.getPerson();
		lastNames[numberOfContacts] = newContact.getLastName();
		numberOfContacts++;
	}
	
	/**
	 * Screen that directs the user to different parts of the program
	 */
	public int mainMenu() {
		System.out.println("------------------");
		System.out.println("What do you want to do?");
		System.out.println("  1. Add new person");
		System.out.println("  2. Visualize contact list");
		System.out.println("  3. Search a specific person on the contact list by last name");
		System.out.println("  4. Exit");
		System.out.println();
		System.out.print("Input: ");
		Scanner myScanner = new Scanner(System.in);
		int userChoice = myScanner.nextInt();
		
		return userChoice;
	}
	/**
	 * Retrieves and prints the existing contact list.
	 */
	public void printList (){
		System.out.println("------------------");
		System.out.println("2. Visualize contact list\n");
		Scanner myScanner = new Scanner(System.in);
		
		for (int i = 0; i < fullContacts.length && fullContacts[i] != null; i++) {
		     System.out.println(fullContacts[i] + "\n");
		}
		System.out.print("press enter to contiue");
		String pause = myScanner.nextLine();
		
	}
	
	/**
	 * Searches the arraylist by last name and prints the relevant 
	 * information to the console.
	 */
	public void search (){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("------------------");
		System.out.println("Feature not yet implemented.\n");
		System.out.print("press enter to contiue");
		String pause = myScanner.nextLine();
	}
	
	/**
	 * Saves the existing contact list to a .txt file on the hard drive, 
	 * then prints a confirmation and a farewell message.
	 */
	public void exit (){
		System.out.println("------------------");
		System.out.println("Ta-ta for now!\nProgram terminated.");
		System.out.println("------------------");
	}
	
	
}


