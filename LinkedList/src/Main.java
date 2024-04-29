import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int entry;
		int entries = 0;
		
		while(true) {
			System.out.print("Enter a number to add to linked list, 0 to exit: ");
			entry = input.nextInt();
			if (entry == 0) {
				System.out.print("There are no linked nodes in the linked list. Enter number to add to the list: ");
				entry = input.nextInt();
				head = new Node;
			}
		}
	}
	
	public static Node createNode() {
		
	}

}
