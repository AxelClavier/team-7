import java.util.ArrayList;
import java.util.Scanner;
/**
 * One object of this class stores 1 array of contact list
 */
public class ContactList {
	public static void main (String args[]){

		ArrayList <Contact> contactList = new ArrayList<Contact>();
		String firstName, lastName, streetAddress, emailAddress, phoneNumber, notes;
 
		boolean notExit = true;
		Scanner scan;
		int userInput;
		while (notExit){
			scan = new Scanner(System.in);
			System.out.println("Welcome to the Contact manager!");
			System.out.println("What would you like to do (please choose a number)");
			System.out.println("1. Add Contact");
			System.out.println("2. List Contact");
			System.out.println("3. Exit");

			// System.out.println("4. Retrieve");

			userInput = scan.nextInt();


			switch(userInput){
			case 1:
				Scanner scanContact;
				scanContact = new Scanner(System.in);
				System.out.println ("First Name:");
				firstName = scanContact.nextLine(); 
				System.out.println ("Last Name:");
				lastName = scanContact.nextLine();
				System.out.println ("Street Address:");
				streetAddress = scanContact.nextLine();
				System.out.println ("Email Address");
				emailAddress = scanContact.nextLine();
				System.out.println ("Phone number:");
				phoneNumber = scanContact.nextLine();
				System.out.println ("Notes:");
				notes = scanContact.nextLine();

				Contact person1;
				person1 = new Contact(firstName, lastName, streetAddress, emailAddress, phoneNumber, notes);

				contactList.add(person1);
				System.out.println("Adding " + person1.getFirstName() + " to contact list " );
				break;

			case 2:
				// display list;

				//for (Contact var:contactList){
				//System.out.println(var.getLastName());
				//}
				for (int i=0; i<contactList.size(); i++){
					Contact var;
					var = contactList.get(i);
					System.out.println("First Name:" + var.getFirstName());
					System.out.println("Last Name: " + var.getLastName());
					System.out.println("Street Address:" + var.getStreetAddress());
				}
				break;

			case 3:	
				notExit = false;
				break;

				// not sure about this search code	
				//case 4:
				//int searchByLastName(Contact []contactList, String lastName){
				//for (int i=0; i<contactList.list; i++){
				//if(contactList[i].getLastName.equals(lastName))
				//return i;

			}	
		}
	}
}	
