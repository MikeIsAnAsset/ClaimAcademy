package exerciseSets;

import java.util.Scanner;

public class WeekDay {

	public static void main(String[] args) {
		// Declare and initialize variables
		Scanner in = new Scanner(System.in);
		int input = 0;
		boolean isValid;
		String weekday = "";
		
		// Prompt user for input and validate
		do {
			System.out.print("Enter numeric day of week 1-7: ");
			if (in.hasNextInt()) {
				input = in.nextInt();
				if (input < 1 || input > 7) {
					System.out.print("Invalid.  Must be 1-7.\n");
					in.next();
					isValid = false;
				} else {
					isValid = true;
				}
				
			} else {
				System.out.print("Invalid.  Must be 1-7.\n");
				in.next();
				isValid = false;
			}
		} while (!(isValid));
		
		// Convert numeric day to weekday
		switch (input) {
			case 1: weekday = "Sunday";
					break;
			case 2: weekday = "Monday";
			break;
			case 3: weekday = "Tuesday";
			break;
			case 4: weekday = "Wednesday";
			break;
			case 5: weekday = "Thursday";
			break;
			case 6: weekday = "Friday";
			break;
			case 7: weekday = "Saturday";
			break;
		}
		
		
		// Print weekday to console
		System.out.println(weekday);
	}

}
