package assignmentWeek10;

import java.util.Scanner;

public class ScenicCruise extends Cruise {
	Scanner sc = new Scanner(System.in);

	public ScenicCruise() {
		super("Scenic Cruise", 43.99, 12.99, 3);
		additionalService = "spa ";
		additionalServicesPrice = 50;
		additionalActivity = "Press Y if want to get spa for additional $50.";
	}
}
