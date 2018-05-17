package exerciseSets;

public class SavingsCalculator {

	public static void main(String[] args) {
		// Given values
		double savingsPresentValue = 20000;
		double interestRatePercent = 4.5;
		int time = 15;
		
		
		// Call function
		int futureValue = calculateFutureValue(savingsPresentValue, interestRatePercent, time );
		System.out.print(futureValue);
	
	}

	// Define function
	// Parameters: present account value, interest rate percentage, time
	public static int calculateFutureValue(double savingsPresentValue, double interestRatePercent, int time) {
		// Convert rate percentage to decimal
		double interestRate = interestRatePercent / 100;
		
		// Calculate future value
		int futureValueCalculation = (int) (savingsPresentValue * (1 + (interestRate * time)));
		return futureValueCalculation;
	}
}
