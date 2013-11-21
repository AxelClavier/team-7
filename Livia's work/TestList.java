/**
 * This is the main
 * LT
 */
public class TestList {
	public static void main (String args[]) {
		
		//create a Scanner for start-up user interfaces:
			//1.Enter a new person data		2.Print Contact List
			// 3.Retrieve a person's information by last name		4.Quit the program and save to disk
			//5.Start the program and open the existing data file on disk
			// note: user can type "cancel" anytime and cancel the input process
	
		Person person1;
		person1 = new Person();
		
		System.out.println("First name: " + person1.getFirstName());
		System.out.println("Last name: " + person1.getLastName());
		System.out.println("Street address: " + person1.getStreetAddress());
		System.out.println("Email: " + person1.getEmailAddress());
		System.out.println("Phone: " + person1.getPhoneNumber());
		System.out.println("Notes: " + person1.getNotes());
		System.out.println("Return person's information : " + person1.printPerson());
		
		person1.setFirstName("Livia");
		person1.setLastName("Tj");
		person1.setStreetAddress("123 N");
		person1.setEmailAddress("litj@gmail.com");
		person1.setPhoneNumber("123-456-7899");
		person1.setNotes("adding person 1");
		
		System.out.println("First name: " + person1.getFirstName());
		System.out.println("Last name: " + person1.getLastName());
		System.out.println("Street address: " + person1.getStreetAddress());
		System.out.println("Email: " + person1.getEmailAddress());
		System.out.println("Phone: " + person1.getPhoneNumber());
		System.out.println("Notes: " + person1.getNotes());
		System.out.println("Return person's information: " + person1.printPerson());
				
		
		List myContactList;
		myContactList = new List();
		
		System.out.println("MyContactList should be empty! " + myContactList.toString());
		myContactList.addPerson(person1);
		System.out.println("Person1 in myContactList! " + myContactList.toString());
		
		myContactList.printList();	//I DO NOT KNOW HOW TO TEST. SINCE I WANT TO RETURN OBJECTS
		
		myContactList.retrieve("unknown");
		myContactList.retrieve("Tj");		//DISPLAY WRONG OUTPUT. IT SHOULD BE RETRIEVE!

	}
}	
