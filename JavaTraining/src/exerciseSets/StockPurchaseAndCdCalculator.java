package exerciseSets;

public class StockPurchaseAndCdCalculator {

	public static void main(String[] args) {
		// Declare & define variables
		int savings = 25000;
		int stockPricePerShare = 989;
		int shares;
		int cd;
		
		// Calculate number of shares to buy
		// Divide savings by stock price
		shares = savings / stockPricePerShare;
		
		// Calculate leftover money for CD
		// savings minus (number of shares * stock price)
		cd = savings - (shares * stockPricePerShare);
		
		// Output
		System.out.println("Buy " + shares + " shares of stock");
		System.out.println("Invest $" + cd + " in CD account");

	}

}
