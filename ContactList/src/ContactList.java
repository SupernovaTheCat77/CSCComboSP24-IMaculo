
public class ContactList {
	String firstName;
	String lastName;
	String phoneNumber;
	
	public ContactList() {
		this.firstName = null;
		this.lastName = null;
		this.phoneNumber = "0000000000";
	}
	
	public ContactList(String firstName, String lastName, String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}

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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Name: " + firstName + " " + lastName + "\nPhone number: " + phoneNumber;
	}
	
	
	
}
