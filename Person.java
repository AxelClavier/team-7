/**
 * Livia (L): One object of this class stores 1 single person information
 */
public class Person implements Comparable <Person> {
	private String firstName;
	private String lastName;
	private String StreetAddress;
	private String emailAddress;
	private String phoneNumber;
	private String notes;

	/**
	 * L: Compare the value of lastName
	 */
	public int compareTo(Person newPerson){
		if(lastName.equals(newPerson.lastName))
		    return firstName.compareTo(newPerson.firstName);
		else
		return lastName.compareTo(newPerson.lastName);
		}
	
	
	/**
	 * L: Returns the value of firstName.
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * L: Sets the value for firstName to "firstName".
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * L: Returns the value of lastName.
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * L: Sets the value for lastName to "lastName".
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * L: Returns the value of streetAddress.
	 */
	public String getStreetAddress() {
		return StreetAddress;
	}

	/**
	 * L: Sets the value for streetAddress to "streestAddress".
	 */
	public void setStreetAddress(String StreetAddress) {
		this.StreetAddress = StreetAddress;
	}

	/**
	 * L: Returns the value of emailAddress.
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * L: Sets the value for emailAddress to "emailAddress".
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	/**
	 * L: Returns the value of phoneNumber.
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * L: Sets the value for phoneNumber to "phoneNumber".
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * L: Returns the value of notes.
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * L: Sets the value for notes to "notes".
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	/**
	 * L: Returns a String containing firstName, lastName, StreetAddress, emailAddress, phoneNumber, notes
	 */
	public String toString() {
		return "  " + firstName + " " + lastName + "\n    Street Address: " + StreetAddress + "\n    Email address: " + emailAddress
				+ "\n    Phone number: " + phoneNumber + "\n    Notes: " + notes;
	}

}
