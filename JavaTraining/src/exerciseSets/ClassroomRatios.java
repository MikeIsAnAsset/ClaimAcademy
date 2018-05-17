package exerciseSets;

import java.text.DecimalFormat;

public class ClassroomRatios {

	public static void main(String[] args) {
		
		// Declare & define variables
		int boys = 11;
		int girls = 16;
		int teacher = 1;
		int teacherAssist = 1;
		DecimalFormat df2 = new DecimalFormat(".###");
		
		// Calculate number of students
		int students = boys + girls;
		
		// Calculate girl percentage
		double percentage =  ((double) (girls * 100) / students);

		// Calculate student-teacher ratio
		double ratio = students / (double)(teacher + teacherAssist);
		
		// Output result
		System.out.println(df2.format(percentage) + "% of the class are girls");
		System.out.println("The Student-Teacher ratio is " + ratio);
	}


}
