/**
 * Livia: One object of this class stores 1 single person information
 */
public class Person {
	private String firstName, lastName, StreetAddress, emailAddress,
			phoneNumber, notes;
	
	/**
	 * Returns the value of firstName.
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Sets the value for firstName to "firstName".
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * Returns the value of lastName.
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Sets the value for lastName to "lastName".
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * Returns the value of streetAddress.
	 */
	public String getStreetAddress() {
		return StreetAddress;
	}
	
	/**
	 * Sets the value for streetAddress to "streestAddress".
	 */
	public void setStreetAddress(String StreetAddress) {
		this.StreetAddress = StreetAddress;
	}
	
	/**
	 * Returns the value of emailAddress.
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * Sets the value for emailAddress to "emailAddress".
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	/**
	 * Returns the value of phoneNumber.
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	/**
	 * Sets the value for phoneNumber to "phoneNumber".
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	/**
	 * Returns the value of notes.
	 */
	public String getNotes() {
		return notes;
	}
	
	/**
	 * Sets the value for notes to "notes".
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	/**
	 * Returns a String containing firstName, lastName, StreetAddress, emailAddress, phoneNumber, notes
	 */
	public String getPerson() {
		return "  " + firstName + " " + lastName + "\n    Street Address: " + StreetAddress + "\n    Email address: " + emailAddress
				+ "\n    Phone number: " + phoneNumber + "\n    Phone number" + notes;
	}

}
