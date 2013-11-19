/**
 * One object of this class stores 1 single person information
 */
public class Person {
	private String firstName, lastName, emailAddress, phoneNumber, notes;
	private StreetAddress myStreetAddress;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public StreetAddress getMyStreetAddress() {
		return myStreetAddress;
	}
	public void setMyStreetAddress(StreetAddress myStreetAddress) {
		this.myStreetAddress = myStreetAddress;
	}
	
	public void printPerson(){
		//print all information for 1 contact 
	}	
	
}
