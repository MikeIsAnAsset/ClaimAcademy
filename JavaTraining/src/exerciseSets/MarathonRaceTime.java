package exerciseSets;

import java.text.DecimalFormat;

public class MarathonRaceTime {
	
	public static void main(String[] args) {
	
	// Declare and define variables
	double miles = 26.2;
	int totalSeconds = 7724;
	int remainingSeconds;
	int hours;
	int mins;
	int remainingMins;
	double averagePace;
	DecimalFormat df2 = new DecimalFormat(".###");
	
	
	// Calculate hours, minutes, and seconds
	mins = totalSeconds / 60;
	remainingSeconds = totalSeconds % 60;
	hours = mins / 60;
	remainingMins = mins % 60;
	
	// Calculate average pace per mile in minutes
	averagePace = mins / miles;
	
	// Output
	System.out.println(hours + "hrs:" + remainingMins + "mins:" + remainingSeconds + "secs");
	System.out.println("Average pace: " + df2.format(averagePace) + " minutes per mile");
}
}