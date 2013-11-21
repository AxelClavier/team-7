/**
 * Contact list program that allows the user to add people to the list,
 * visualize the contacts he/she already inputed, search through the contacts
 * by last name, and save his/her contact list to the hard drive.
 * 
 * AC
 */
public class Main {
	public static void main (String args[]) {
		int runVariable = 0;
		Ancillary run;
		run = new Ancillary ();
	    
	    run.startUp();
	    
	    while (runVariable == 0){
	    	// Prompts the user to choose between four options:
	    	  // 1. Add new person
	    	  // 2. Visualize contact list
	    	  // 3. Search a specific person on the contact list by last name
	    	  // 4. Exit
	    	
	    	// if 1. is chosen:
	    	  run.addPerson();
	    	  
	    	// if 2. is chosen:
	    	  run.printList();
	    	  
	    	// if 3. is chosen:
	    	  run.search();
	    	  
	    	// if 4. is chosen:
	    	  run.exit();
	    	  runVariable = 1;
             }

	    }

	}