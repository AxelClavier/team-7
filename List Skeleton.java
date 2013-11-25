import java.util.Scanner;

/**
 * @author livia: One object of this class represents a list of contacts (maximum: 100 contacts)
 */
public class List {
	private int numberOfContacts = 0;
	private String[] fullContacts;
	private String[] lastNames;

	/**
	 * Constructor of List consists of fullContacts array
	 */
	public List(){
		fullContacts = new String[100];
		lastNames = new String[100];
	}
	/**
	 * Searches to see if there is an existing
	 * contact list .txt file on the hard drive.
	 */
	public void startUp (){
		//If there is, it loads it and returns to the main.
		//If there isn't, it returns to the main program.
	}

	/**
	 * Livia: enter a person information and put them in the array
	 * 
	 */
	public void addPerson (){
		// user enters: first name, last name, street address, email address, phone number and notes.
		// If the user leaves the last name blank, then the person will not be entered into the contact list.
		// If the user leaves one or more of the fields blank, the person will still be entered into the contact list.
	}

	/**
	 * Screen that directs the user to different parts of the program
	 */
	public int mainMenu(int userChoice) {
		return userChoice;
	}
	/**
	 * Livia: Prints the contact list.
	 */
	public void printList (){
		//The system prints all information about all contacts to the console,
			//sorted by last name.
	}

	/**
	 * Livia: Retrieve a person's information by last name
	 * Display all of the information that was previously entered on that person
	 * 	 */
	public void retrieve(){
		//If there is no one in the contact list with the given last name, the system will display a
		//message to the user telling her that: "last name is not found"
		// If there is more than one person in the contact list with the given last name, then all of
		//the people with that last name will be displayed.	
	}

	/**
	 * Livia: Saves the existing contact list to ContacList.txt file on the hard drive,
	 * quit the program.
	 */
	public void saveAndExit (){
	 //Result: there is data file on the disk
	 

	}


}

