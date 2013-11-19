/**
 * One object of this class represents 1 contact information for 1 single person
 */
public class Contact {
	private String firstName, lastName, streetAddress, emailAddress, phoneNumber, notes;
	
	public Contact (String newFirstName, String newLastName, String newStreetAddress, String newEmailAddress, String newPhoneNumber, String newNotes){
		firstName = newFirstName;
		lastName = newLastName;
		streetAddress = newStreetAddress;
		emailAddress = newEmailAddress;
		phoneNumber = newPhoneNumber;
		notes = newNotes;
	}
	
	
	public void setFirstName (String newFirstName){
		firstName = newFirstName;
	}
	public void setLastName (String newLastName){
		lastName = newLastName;
	}
	public void setStreetAddress (String newStreetAddress){
		streetAddress = newStreetAddress;
	}
	public void setEmailAddress (String newEmailAddress){
		emailAddress = newEmailAddress;		
	}
	public void setPhoneNumber (String newPhoneNumber){
		phoneNumber = newPhoneNumber;
	}
	public void setNotes (String newNotes){
		notes = newNotes;
	}
	
	
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public String getStreetAddress(){
		return streetAddress;
	}
	public String getEmailAddress(){
		return emailAddress;
	}
	public String getPhoneNumber(){
		return phoneNumber;
	}
	public String getNotes(){
		return notes;
	}
	public String print(){
		return firstName + " " + lastName + "\n" + streetAddress + "\n" + emailAddress + "\n" + phoneNumber + "\n" + notes;
	}

}

//This is a test edit