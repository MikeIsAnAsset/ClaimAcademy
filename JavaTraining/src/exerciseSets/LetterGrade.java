package exerciseSets;

import java.util.Scanner;

public class LetterGrade {

	public static void main(String[] args) {
		// Declare and define variables
		Scanner input = new Scanner(System.in);
		int number = 0;
		boolean isNumber;
		String grade;
		
		// Prompt user for numeric grade and validate
			
			do {
			System.out.print("Enter a numeric grade: ");
			if (input.hasNextInt()) {
				number = input.nextInt();
				isNumber = true;
			} 	else {
					System.out.print("Invalid.  Grade must be numeric.\n");
					isNumber = false;
					input.next();
				}
			} while (!(isNumber));
			
			
			while (number < 0 || number > 100) {
				System.out.print("Invalid.  Grade must be numeric.  Enter a numeric grade: ");
				number = input.nextInt();
			}	
/*				break;
			
			catch (Exception e) {
				System.out.print("Invalid.  Grade must be numeric.");
				 number = in.nextInt();
			
		}
	/while (true);*/
		

		
		// Convert numeric grade to letter grade
		if (number >= 90) {
			grade = "A";
		}
		else if (number >= 80 && number < 90) {
			grade = "B";
		}
		else if (number >= 72 && number < 80) {
			grade = "C";
		}
		else if (number >= 64 && number < 72) {
			grade = "D";
		}
		else {
			grade = "F";
		}
		// Print letter grade to console
		System.out.print(grade);

	}
	
}
