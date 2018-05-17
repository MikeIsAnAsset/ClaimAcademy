package exerciseSets;

public class KioskChangeCalculator {

	public static void main(String[] args) {
		// Given values
		double itemPrice = 17.18;
		double cashPaid = 18;
		
		
		// Call function
		returnChange(cashPaid, itemPrice);
	}

	// Define function and parameters
	public static void returnChange(double cashPaid, double itemPrice) {
				
		// Declare and initialize variables
		double remainder = 0;
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		int pennies = 0;
	
		// Calculate difference
		double difference = cashPaid - itemPrice;
		//System.out.println(difference);
		
		// Calculate how many quarters go into difference and remainder change
		quarters = (int) (difference / .25);
		remainder = difference % .25;
		//System.out.println(remainder);
		
		// Calculate how many dimes go into difference and remainder change
		dimes = (int) (remainder / .10);
		remainder = remainder % .10;
		
		// Calculate how many nickels go into difference and remainder change
		nickels = (int) (remainder / .05);
		remainder = remainder % .05;
		
		// Calculate how many pennies go into difference and remainder change
		pennies = (int) (remainder / .01);
		remainder = difference % .01;
		
		// Print result to console
		System.out.println("Quarters: " + quarters);
		System.out.println("Dimes: " + dimes);
		System.out.println("Nickels: " + nickels);
		System.out.print("Pennies: " + pennies);
	}
}
