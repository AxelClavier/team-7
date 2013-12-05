import java.util.ArrayList;
import java.util.Collections;

/**
 * Contact list program that allows the user to add people to the list,
 * visualize the contacts he/she already inputed, search through the contacts by
 * last name, and save his/her contact list to the hard drive.
 */
public class TestList {
	public static void main(String args[]) {
//		/**
//		 * Screen that directs the user to different parts of the program
//		 */
//		public int mainMenu() {
//			int userChoice = 0;
//			return userChoice;
//		}
		
		List myContactList = new List();
		myContactList.addPerson(); // add someone name
		myContactList.addPerson(); 
		myContactList.addPerson(); 
		
		System.out.println("Objects are not sorted by last name: " );
		myContactList.printList(); // objects are not sorted by last name
		
		myContactList.sortByLastName();	//what am I doing with a returned value? nothing
		
		System.out.println("Objects are sorted by last name: " );
		myContactList.printList();	// objects are sorted by last name
	
	}
}

/*----- output ------
 * ------------------
1. Add new person
  Name: Livia
  Last name: Tja
  Street address: 123
  Email: 123
  Phone: 123
  Notes: 123

Livia Tja added to contact list!
------------------
1. Add new person
  Name: Axel
  Last name: Cla
  Street address: 123
  Email: 123
  Phone: 123
  Notes: 123

Axel Cla added to contact list!
------------------
1. Add new person
  Name: Dedd
  Last name: Wahyu
  Street address: 123
  Email: 123
  Phone: 123
  Notes: 123

Dedd Wahyu added to contact list!
Objects are not sorted by last name: 
------------------
2. Print list
[  Livia Tja
    Street Address: 123
    Email address: 123
    Phone number: 123
    Phone number123

[  Axel Cla
    Street Address: 123
    Email address: 123
    Phone number: 123
    Phone number123

[  Dedd Wahyu
    Street Address: 123
    Email address: 123
    Phone number: 123
    Phone number123

Objects are sorted by last name: 
------------------
2. Print list
[  Axel Cla
    Street Address: 123
    Email address: 123
    Phone number: 123
    Phone number123

[  Livia Tja
    Street Address: 123
    Email address: 123
    Phone number: 123
    Phone number123

[  Dedd Wahyu
    Street Address: 123
    Email address: 123
    Phone number: 123
    Phone number123
 */
