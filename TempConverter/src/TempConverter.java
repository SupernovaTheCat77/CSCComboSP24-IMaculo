import java.util.Scanner;

public class TempConverter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter temp in fahrenheit: ");
		double fahrenheit = input.nextDouble();
		
		double celcius = (((fahrenheit-32)*5)/9);
		double kelvin = celcius+273.15;
		
		System.out.println("Fahrenheit: " + fahrenheit + "\nCelcius: " + celcius + "\nKelvin: " + kelvin);
	
		

	}

}
