import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

/**
 * One object of this class stores a list of information for many contacts
 */
public class List {
	private ArrayList<Person> myList = new ArrayList<Person>();

	/**
	 * Screen that directs the user to different parts of the program
	 */
	public int mainMenu() {
		System.out.println("------------------");
		System.out.println("What do you want to do?");
		System.out.println("  1. Add new person");
		System.out.println("  2. Visualize contact list");
		System.out
				.println("  3. Search a specific person on the contact list by last name");
		System.out.println("  4. Exit");
		System.out.println();
		System.out.print("Input: ");
		Scanner myScanner = new Scanner(System.in);
		String userChoice = myScanner.nextLine();
		int returnValue;

		if (isInt(userChoice) == false)
			return 5;
		else {
			returnValue = Integer.parseInt(userChoice);
			return returnValue;
		}
	}

	/**
	 * Prompts the user to enter a new contact's information and then stores
	 * that information in an array.
	 */
	public void addPerson() {
		Person newPerson = new Person();
		Scanner myScanner = new Scanner(System.in);
		int i = 0;

		System.out.println("------------------");
		System.out.println("1. Add new person");

		System.out.print("  Name: ");
		String name = myScanner.nextLine();
		newPerson.setFirstName(name);

		Boolean tryAgain = false;
		while (tryAgain == false) {
			System.out.print("  Last name: ");
			String surname = myScanner.nextLine();
			if (surname.equals("")) {
				System.out.println("    Please enter a last name.");
			} else {
				newPerson.setLastName(surname);
				tryAgain = true;
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

		System.out.println("\n" + newPerson.getFirstName() + " "
				+ newPerson.getLastName() + " added to contact list!");

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
	/**
	 * display list of Persons (objects) stored in myList
	 */
	public void printList() {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("------------------");
		System.out.println("2. Visualize contact list\n");
		for (Person person : myList) {
			System.out.println(person.toString() + "\n");
		}

		System.out.print("\npress enter to continue");
		String pause = myScanner.nextLine();
	}

	public boolean isInt(String userChoice) {
		try {
			Integer.parseInt(userChoice);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}

/**
 * print Person(s) (object) with certain last name
 */
/*
 * public void retrieve(String lastName){ int found = 0; for(Person person :
 * myList){ if(person.getLastName().equals(lastName)){ found = 1;
 * person.printPerson(); } } if(found == 0){
 * System.out.println("Last Name "+lastName+" is not found"); }
 * 
 * }
 */
