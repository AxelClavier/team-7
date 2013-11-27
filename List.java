import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

/**
 * One object of this class stores a list of information for many contacts
 */
public class List {
	private ArrayList <Person> myList = new ArrayList<Person>();	
	private int numberOfContacts = 0;

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
				+ " added to contact list!");

		myList.add(newPerson);
	}

	/**
	 * Retrieves and prints the existing contact list.
	 */
	/*
	public void printList (){
		System.out.println("------------------");
		System.out.println("2. Visualize contact list\n");
		Scanner myScanner = new Scanner(System.in);

		for (int i = 0; i < fullContacts.length && fullContacts[i] != null; i++) {
		     System.out.println(fullContacts[i] + "\n");
		}
		System.out.print("press enter to continue");
		String pause = myScanner.nextLine();

	}
	 */
	/**
	 * String comparison between user input and last name.
	 */
	/*public void searchLastName() {

		for (int i = 0; i < lastNames.length; i++)
		{
			if ((search).equals(lastNames[i])) 
			{
				System.out.println(fullContacts[i]);
			}
		}
		System.out.println("press enter to continue");
	}
	 
	/**
	 * display list of Persons (objects) stored in myList
	 */
	public void printList(){
		for(Person person : myList){
			person.toString(); 
		}
	}
	/**
	 * print Person(s) (object) with certain last name
	 */
	public void retrieve(String lastName){
		int found = 0;
		for(Person person : myList){
			if(person.getLastName().equals(lastName)){
				found = 1;
				person.toString();
			}
		}
		if(found == 0){
			System.out.println("Last Name "+lastName+" is not found");
		}

	}
}
