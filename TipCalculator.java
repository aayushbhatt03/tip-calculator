import java.util.Scanner;

public class TipCalculator {
	
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);	// Create new Scanner object.

		// Prompt the user to enter the subtotal and the gratuity rate
		System.out.print("Enter the subtotal and a gratuity rate: ");
		double subtotal = t.nextDouble();
		double gratuityRate = t.nextDouble();

		// Calculate gratuity and total
		double gratuity = subtotal * (gratuityRate / 100);
		double total = subtotal + gratuity;

		// Display results
		System.out.println("The gratuity is $" + gratuity +
			" and total is $" + total);
	}
}