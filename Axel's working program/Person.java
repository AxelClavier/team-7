/**
 * One object of this class stores 1 single person information
 */
public class Person {
	private String firstName, lastName, StreetAddress, emailAddress,
			phoneNumber, notes;

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

	public String getStreetAddress() {
		return StreetAddress;
	}

	public void setStreetAddress(String StreetAddress) {
		this.StreetAddress = StreetAddress;
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

	public String getPerson() {
		return "  " + firstName + " " + lastName + "\n    Street Address: " + StreetAddress + "\n    Email address: " + emailAddress
				+ "\n    Phone number: " + phoneNumber + "\n    Phone number" + notes;
	}

}