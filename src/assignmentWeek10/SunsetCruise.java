package assignmentWeek10;

import java.util.Scanner;

public class SunsetCruise extends Cruise {
	Scanner sc = new Scanner(System.in);

	public SunsetCruise() {
		super("Sunset Cruise", 52.99, 15.99, 1);
		additionalService = "candle light dinner ";
		additionalServicesPrice = 45;
		additionalActivity = "Press Y if want to add candle light dinner for additional $45.";
	}
}