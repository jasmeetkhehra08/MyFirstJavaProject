package assignmentWeek10;

import java.util.Scanner;

public class MysteryCruise extends Cruise {
	Scanner sc = new Scanner(System.in);

	public MysteryCruise() {
		super("Mystery Cruise", 45.99, 12.99, 2);
		additionalService= "casino entry ticket ";
		additionalServicesPrice=20;
		additionalActivity="Press Y if want to get casino entry ticket for additional $20.";
	}
}
