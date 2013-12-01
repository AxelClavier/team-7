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

/*--- output ---
------------------
1. Add new person
  Name: Livia
  Last name: Tjandra
  Street address: 123 N
  Email: asd@mail.com
  Phone: 123-456-7899
  Notes: test 1

Livia Tjandra added to contact list!
------------------
1. Add new person
  Name: Axel
  Last name: Clavier
  Street address: 456 H
  Email: hjl@mail.com
  Phone: 987-654-3211
  Notes: test 2

Axel Clavier added to contact list!
------------------
1. Add new person
  Name: Kennetg
  Last name: Wong
  Street address: qwe
  Email: qwe@mail.com
  Phone: 234-567-8912
  Notes: test 3

Kennetg Wong added to contact list!
------------------
2. Print list
  Livia Tjandra
    Street Address: 123 N
    Email address: asd@mail.com
    Phone number: 123-456-7899
    Phone numbertest 1

  Axel Clavier
    Street Address: 456 H
    Email address: hjl@mail.com
    Phone number: 987-654-3211
    Phone numbertest 2

  Kennetg Wong
    Street Address: qwe
    Email address: qwe@mail.com
    Phone number: 234-567-8912
    Phone numbertest 3

------------------
*/
