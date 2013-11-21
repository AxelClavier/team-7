import java.util.ArrayList;
//import java.io.*;

/**
 * One object of this class stores a list of information for many contacts
 */
public class List {
	private ArrayList <Person> myList;	//create an arraylist

	public List (){
		myList = new ArrayList <Person> ();		//an arraylist with Person data type is created
	}
	
	/**
	 * add 1 object of Person into a single element of myList
	 */
	public void addPerson(Person newPerson){
//		if(newPerson.getFirstName().equals("")){
//			System.out.println("Person is not entered because first or last name is empty");
//		}
//		else {
//			myList.add(newPerson);
//		}
	}

	/**
	 * display list of Persons (objects) stored in myList
	 */
	public void printList(){
		for(Person person : myList){
			person.printPerson(); 
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
				person.printPerson();
			}
		}
		if(found == 0){
			System.out.println("Last Name "+lastName+" is not found");
		}

	}
	
//	public void saveAndQuit(){
	//		quit the program and save to disk
//	}

//	public void start(String inputfile){
	//		start the list program:
	//		find the contact list on disk and system begins with an empty contact list
	//		outcome: there is a contact list in memory containing any contacts that were entered previously		}	
//	}
}
