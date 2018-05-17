package exerciseSets;

import java.util.Scanner;

public class EvenOrOddNumber {

	public static void main(String[] args) {
		// Declare and Initialize variables
		Scanner in = new Scanner(System.in);
		int input;
		
		// Prompt user for input
		System.out.print("Please enter an integer: ");
		input = in.nextInt();		
		
		// Determine if input even or odd
		if (input % 2 == 0) {
			System.out.print("Even");
		}
		else {
			System.out.print("Odd");
		}
		
		
	}

}
