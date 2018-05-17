package exerciseSets;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;;

public class IdCardPrinter {

	public static void main (String[] args) throws ParseException {
		
		// Declare & define variables
		String name = "Roger Williams";
		String id = "ST05GH23";
		String state = "CA";
		SimpleDateFormat formatDate = new SimpleDateFormat("MM/yyyy");
		Date expirationDate = formatDate.parse("12/2023");

		// Print ID Card
		System.out.println("NAME: " + name);
		System.out.println("ID: " + id);
		System.out.println("STATE: " + state);
		// .format(new Date())
		System.out.println("EXP. DATE: " + formatDate.format(expirationDate));
	
	}
	
}
