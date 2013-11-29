/**
 * Contact list program that allows the user to add people to the list,
 * visualize the contacts he/she already inputed, search through the contacts by
 * last name, and save his/her contact list to the hard drive.
 */
public class TestList {
	public static void main(String args[]) {
		List myContactList = new List();
		myContactList.addPerson();
		myContactList.addPerson();
		myContactList.addPerson();
		myContactList.printList();
		System.out.println("------------------");

	}
}