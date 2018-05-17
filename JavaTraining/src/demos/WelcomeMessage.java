package demos;

public class WelcomeMessage {

	public static void main(String[] args) {
		System.out.println("Starting Welcome message");
		
		// Declaring variable
		String name;
		
		// Define variable
		name = "Steve";
		
		// Declare & Define variable
		String date = "Friday, 3:12pm";
		Double transactionAmount = 112.58;
		char sign = '-';

		// Use the variable
		System.out.println(name);
		System.out.println(date);
		System.out.println(transactionAmount);
		
		// Print message
		System.out.println("Hi " + name + ", welcome back!  Your last login was " + date + ".  Your last transaction was for " + sign + "$" + transactionAmount + ".");
		
//		"Hi Shawn, welcome back!  Your last login was Friday, 2:12pm.  Your last transaction was fo +$32.58"
	}
	
}
