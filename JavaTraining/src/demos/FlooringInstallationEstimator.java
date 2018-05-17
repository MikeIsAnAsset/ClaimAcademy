package demos;

public class FlooringInstallationEstimator {

	public static void main(String[] args) {
		int squareFeet = 2000;
		String floorType = "Carpet";
		
		// Call function
		double quote = getQuote(squareFeet, floorType);
		System.out.print("Your quote is: $" + quote);
	}

	// Define quote function
	// Parameters:  square feet, floor type
	private static double getQuote(int squareFeet, String floorType) {
		System.out.println("QUOTE FUNCTION");
		System.out.println("SQUARE FEET: " + squareFeet);
		System.out.println("FLOOR TYPE: " + floorType);
		
		// Define variables
		double baseRate = 3;
		double carpetRate = .5;
		double hardwoodRate = 1.5;
		double hardwoodHardwareFee = 100;
		double totalRate = 0;
		double totalCost = 0;
		
		// Determine floor type and rate
		if (floorType == "Carpet") {
			totalRate = baseRate + carpetRate;
		} else if (floorType == "Hardwood") {
			totalRate = baseRate + hardwoodRate;
			totalCost = totalCost + hardwoodHardwareFee;
		} else {
			System.out.println("ERROR:  COULD NOT READ FLOOR TYPE");
		}
		
		// Calculate total cost
		System.out.println("TOTAL RATE: " + totalRate);
		totalCost = totalCost + totalRate * squareFeet;
		
		
		// Apply any appropriate discount
		if (squareFeet >= 1500) {
			double discount = totalCost * .1;
			totalCost = totalCost - discount;
			System.out.println("DISCOUNT: " + discount);
		}
		System.out.println("$" + totalCost);
		
		return totalCost;
	}
	
}
