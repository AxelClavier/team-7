import java.util.Scanner;

/**
 * Contact list program that allows the user to add people to the list,
 * visualize the contacts he/she already inputed, search through the contacts by
 * last name.
 */
public class TestList {
	public static void main(String args[]) {
		Boolean run = true;
		Scanner myScanner = new Scanner(System.in);
		
		List myContactList = new List();
		
		while (run == true) {
			int userChoice = myContactList.mainMenu();

			if (userChoice == 1)
				myContactList.addPerson();

			else if (userChoice == 2) 
				myContactList.printList();
			
			else if (userChoice == 3) {
				System.out.println("------------------");
				System.out.println("3. Who do you want to search for?\n");
				System.out.print("Enter last name: ");
				String search = myScanner.nextLine();
				boolean found = myContactList.searchLastName(search);
				
				if (found == false)
					System.out.print("\n" + search + " not found.");
				
				System.out.print("\npress enter to continue");
				String pause = myScanner.nextLine();
			}

			else if (userChoice == 4) {
				System.out.println("------------------");
				System.out.println("Ta-ta for now!\nProgram terminated.");
				System.out.println("------------------");
				run = false;
			}

			else
				System.out.println("\nInvalid input, please try again.");
		}

	}
}

/*----- output------
------------------
What do you want to do?
  1. Add new person
  2. Visualize contact list
  3. Search a specific person on the contact list by last name
  4. Exit

Choose one: 1
------------------
1. Add new person
  Name: Livia
  Last name: Tjandra
  Street address: 1234 N, Mountain View, CA
  Email: livia@mail.com
  Phone: 123-456-7888
  Notes: contact 1

Livia Tjandra added to contact list!
------------------
What do you want to do?
  1. Add new person
  2. Visualize contact list
  3. Search a specific person on the contact list by last name
  4. Exit

Choose one: 1
------------------
1. Add new person
  Name: Tjandra
  Last name: 
    Please enter a last name.
  Last name: 
    Please enter a last name.
  Last name: 
    Please enter a last name.
  Last name: Livia
  Street address: 234-567-8900
  Email: tjandra@mail.com
  Phone: 234-567-8990
  Notes: contact 2 (try to skip last name)

Tjandra Livia added to contact list!
------------------
What do you want to do?
  1. Add new person
  2. Visualize contact list
  3. Search a specific person on the contact list by last name
  4. Exit

Choose one: Axel

Invalid input, please try again.
------------------
What do you want to do?
  1. Add new person
  2. Visualize contact list
  3. Search a specific person on the contact list by last name
  4. Exit

Choose one: 1
------------------
1. Add new person
  Name: Axel
  Last name: Clavier
  Street address: 234 S, Sunnyvale, CA
  Email: axel@mail.com
  Phone: 567-890-1234
  Notes: contact 3

Axel Clavier added to contact list!
------------------
What do you want to do?
  1. Add new person
  2. Visualize contact list
  3. Search a specific person on the contact list by last name
  4. Exit

Choose one: 1
------------------
1. Add new person
  Name: Team
  Last name: Seven
  Street address: 456 CS, Los Altos, CA
  Email: team7@mail.com
  Phone: 777-777-7777
  Notes: contact 4

Team Seven added to contact list!
------------------
What do you want to do?
  1. Add new person
  2. Visualize contact list
  3. Search a specific person on the contact list by last name
  4. Exit

Choose one: 2
------------------
2. Visualize contact list

  Axel Clavier
    Street Address: 234 S, Sunnyvale, CA
    Email address: axel@mail.com
    Phone number: 567-890-1234
    Notes: contact 3

  Tjandra Livia
    Street Address: 234 Castro, Mountain View, CA
    Email address: tjandra@mail.com
    Phone number: 234-567-8990
    Notes: contact 2 (try to skip last name)

  Team Seven
    Street Address: 456 CS, Los Altos, CA
    Email address: team7@mail.com
    Phone number: 777-777-7777
    Notes: contact 4

  Livia Tjandra
    Street Address: 1234 N, Mountain View, CA
    Email address: livia@mail.com
    Phone number: 123-456-7888
    Notes: contact 1


press enter to continue
------------------
What do you want to do?
  1. Add new person
  2. Visualize contact list
  3. Search a specific person on the contact list by last name
  4. Exit

Choose one: 3
------------------
3. Who do you want to search for?

Enter last name: Wong

Wong not found.
press enter to continue
------------------
What do you want to do?
  1. Add new person
  2. Visualize contact list
  3. Search a specific person on the contact list by last name
  4. Exit
  
Choose one: 3
------------------
3. Who do you want to search for?

Enter last name: Seven

  Team Seven
    Street Address: 456 CS, Los Altos, CA
    Email address: team7@mail.com
    Phone number: 777-777-7777
    Notes: contact 4

press enter to continue
------------------
What do you want to do?
  1. Add new person
  2. Visualize contact list
  3. Search a specific person on the contact list by last name
  4. Exit

Choose one: 4
------------------
Ta-ta for now!
Program terminated.
------------------
 */
