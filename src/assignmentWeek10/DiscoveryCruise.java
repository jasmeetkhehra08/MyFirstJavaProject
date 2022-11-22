package assignmentWeek10;

import java.util.Scanner;

public class DiscoveryCruise extends Cruise {
	Scanner sc = new Scanner(System.in);

	public DiscoveryCruise() {
		super("Discovery Cruise", 39.99, 9.99, 4);
		additionalService = "Adventure Games ";
		additionalServicesPrice = 50;
		additionalActivity = "Press Y if want to get Adventure Games for additional $50.";
	}
}
