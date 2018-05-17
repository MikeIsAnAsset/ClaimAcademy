package exerciseSets;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TipRecommender {

	public static void main(String[] args) {
		// Declaration and definition
		String serviceQuality = "Great";
		Scanner in = new Scanner(System.in);
		DecimalFormat df2 = new DecimalFormat(".####");
		
		// Prompt user for tab input
		System.out.print("Enter tab amount: ");
		double tab = in.nextDouble();
		
		// Call function
		double tip = computeTip(tab, serviceQuality);
		System.out.print(df2.format(tip));
	}

	// Define tip function
	// Parameters: tab and service quality
	public static double computeTip(double tab, String serviceQuality) {
		double tipPercent;
		
		if (serviceQuality == "Poor") {
			tipPercent = 16;
			return tab * (tipPercent/100);
		} else if (serviceQuality == "Good") {
			tipPercent = 22;
			return tab * (tipPercent/100);
		} else {
			tipPercent = 26;
			return tab * (tipPercent/100);
		}
		
		
		
	}
	
	
	
}
