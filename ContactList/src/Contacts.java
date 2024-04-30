
public class Contacts {

	public static void main(String[] args) {
		ContactList[] contacts = new ContactList[6];
		contacts[0] = new Favorites("Joe", "Smith", "1234567890", "123 Franklin St.", "jsmith@email.com");
		contacts[1] = new Favorites("RJ", "Jones", "1478523698", "456 Rockon Ave.", "rJones@email.com");
		contacts[2] = new Favorites("Izzy", "M", "9702082113", "123 Notsaying Dr.", "isaboodlie@gmail.com");
		contacts[3] = new ContactList("Frank", "Dune", "9874563210");
		contacts[4] = new ContactList("Elizabeth", "B", "9701111111");
		contacts[5] = new ContactList("Sean", "R", "9701111111");
		
		printContacts(contacts);
	}
	
	public static void printContacts(ContactList[] contacts) {
		for (int i = 0; i < contacts.length; i++) {
			System.out.println(contacts[i].toString() + "\n");
		}
	}
}
