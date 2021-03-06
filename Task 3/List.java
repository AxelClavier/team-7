import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

/**
 * One object of this class stores a list of persons
 */
public class List {
	private ArrayList <Person> myList;

	public List (){
		myList = new ArrayList <Person> ();		//an arraylist with Person data type is created
	}

	/**
	 * add 1 Person into a single element of myList
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
	 * display list of Persons (objects) stored in myList
	 */
	public void printList(){
		System.out.println("------------------");
		System.out.println("2. Print list");
		for(Person person : myList){
			System.out.println(person.toString() + "\n"); 
		}
	}
	
	/*
	 * sort the whole list object by the last name attributes of the objects
	 */
	public void sortByLastName(){
		Collections.sort(myList);
	}
	
	/**
	 * print Person(s) (object) with certain last name
	 */
	public void retrieve(String lastName){
		//If there is no one in the contact list with the given last name, the system will display a
		//message to the user telling her that: "last name is not found"
		// If there is more than one person in the contact list with the given last name, then all of
		//the people with that last name will be displayed.
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
