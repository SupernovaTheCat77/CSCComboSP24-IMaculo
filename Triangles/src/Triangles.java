import java.util.Scanner;

public class Triangles {

	public static void main(String[] args) {
		String another = "y";
		int size;
		String fill;
		Scanner input = new Scanner(System.in);
		
		while (another.toLowerCase().equals("y") || another.toLowerCase().equals("yes")) {
			System.out.print("Input size (between 1-50): ");
			size = input.nextInt();
			while (size > 50 || size < 1) {
				System.out.print("Invalid range. Input size (between 1-50): ");
				size = input.nextInt();
			}
			System.out.print("Input fill character: ");
			fill = input.next();
			while (fill.length() != 1) {
				System.out.print("Invalid number of characters. Input fill character: ");
				fill = input.next();
			}
			printTriangle(size, fill);
			System.out.print("Another triangle?: ");
			another = input.next();
		}
	}
	
	public static void printTriangle(int size, String fill) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				if (j != i-1) System.out.print(fill + " ");
				else System.out.print(fill);
				
			}
			System.out.println();
		}
		System.out.println();
	}

}
