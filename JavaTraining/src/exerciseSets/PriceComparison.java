package exerciseSets;

public class PriceComparison {

	public static void main(String[] Args) {
		
		// Declare & initialize variables
		String item = "Laptop";
		String ourStore = "Our Store";
		String competitor1 = "Best Buy";
		String competitor2 = "Amazon";
		
		// Do Long for money
		// Long priceAtOurStore = (long) 499;
		
		// Try it the lesson way
		int priceAtOurStore = 499;
		int priceAtCompetitor1 = 579;
		int priceAtCompetitor2 = 529;
		
/*		Difference against competitor price (you get the negative sign)
		int comparison1 = priceAtOurStore + (- priceAtCompetitor1);
		int comparison2 = priceAtOurStore - priceAtCompetitor2;*/
		
		// Calculate amount of savings against competitor price
		int comparison1 = priceAtCompetitor1 + (- priceAtOurStore);
		int comparison2 = priceAtCompetitor2 - priceAtOurStore;
		
		
		
		// Output message
		System.out.println("Comparing Prices for " + item);
		System.out.println(ourStore + ": $" + priceAtOurStore);
		System.out.println(competitor1 + ": $" + priceAtCompetitor1);
		System.out.println("*Save $" + comparison1);
		System.out.println(competitor2 + ": $" + priceAtCompetitor2);
		System.out.println("*Save $" + comparison2);
	}
	
}
