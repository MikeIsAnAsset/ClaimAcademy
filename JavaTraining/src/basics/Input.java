package basics;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// Create the scanner
		Scanner in = new Scanner(System.in);
		
		
		// Prompt user to enter information
		System.out.print("Enter your name: ");
		String name = in.next();
		
		System.out.print("Enter your age: ");
		int age = in.nextInt();
		
		// Print back to console
		System.out.println("Hi " + name + ".  You are " + age + " years old.");
	}

}
