
public class Favorites extends ContactList{
	String address;
	String email;
	
	public Favorites() {
		super();
		this.address = null;
		this.email = null;
	}
	public Favorites(String firstName, String lastName, String phoneNumber, String address, String email) {
		super(firstName, lastName, phoneNumber);
		this.address = address;
		this.email = email;
		
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return super.toString() + "\nAddress: " + address + "\nEmail: " + email;
	}
	
	
}
