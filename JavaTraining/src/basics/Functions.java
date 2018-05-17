package basics;

public class Functions {

	public static void main(String[] args) {
		// Call the function sayHi
		sayHi();
		
		// Call printName function
		printName("Tim", "Stephens");
		
		// Call combineNane function
		String fullName = combineName("Davonne", "Murphy");
		System.out.print(fullName);
	}

	// Defining the function sayHi
	public static void sayHi() {
		System.out.println("Hi!");
	}
	
	// Define function that prints your name
	public static void printName(String firstName, String lastName) {
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);

	}
	
	// Define function that returns full name
	public static String combineName(String firstName, String lastName) {
		String combineName = firstName + " " + lastName;
		return combineName;
	}
	
}
