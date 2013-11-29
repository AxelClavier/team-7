import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

/**
 * One object of this class stores a list of information for many contacts
 */
public class List {
	private ArrayList <Person> myList = new ArrayList<Person>();
	
	/**
	 * Screen that directs the user to different parts of the program
	 */
	public int mainMenu() {
		int userChoice = 0;
		return userChoice;
	}

	/**
	 * Prompts the user to enter a new contact's information
	 * and then stores that information in an array.
	 */
	public void addPerson (){
		Person newPerson = new Person();
		Scanner myScanner = new Scanner(System.in);
		int i = 0;

		System.out.println("------------------");
		System.out.println("1. Add new person");

		System.out.print("  Name: ");
		String name = myScanner.nextLine();
		newPerson.setFirstName(name);

		int loop = 0;
		while (loop == 0) {
			System.out.print("  Last name: ");
			String surname = myScanner.nextLine();
			if (surname.equals("")) {
				System.out.println("    Please enter a last name.");
			} else {
				newPerson.setLastName(surname);
				loop = 1;
			}
		}

		System.out.print("  Street address: ");
		String streetAddress = myScanner.nextLine();
		newPerson.setStreetAddress(streetAddress);

		System.out.print("  Email: ");
		String email = myScanner.nextLine();
		newPerson.setEmailAddress(email);

		System.out.print("  Phone: ");
		String phone = myScanner.nextLine();
		newPerson.setPhoneNumber(phone);

		System.out.print("  Notes: ");
		String notes = myScanner.nextLine();
		newPerson.setNotes(notes);

		System.out.println("\n" + newPerson.getFirstName()
				+ " " + newPerson.getLastName() + " added to contact list!");

		myList.add(newPerson);
	}
	 
	/**
	 * String comparison between user input and last name.
	 */
	public void searchLastName() {

	}
	 
	/**
	 * display list of Persons (objects) stored in myList
	 */
	public void printList(){
		System.out.println("------------------");
		System.out.println("2. Print list\n");
		for(Person person : myList){
			System.out.println(person.toString() + "\n"); 
		}
	}
	/**
	 * print Person(s) (object) with certain last name
	 */
	 public void retrieve(String lastName){
		 
	}
}
