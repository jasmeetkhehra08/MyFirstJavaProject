/*o	Scenic Cruise will have a Spa for which the user will be charged $50 per person.*/
package assignmentWeek10;

import java.util.Scanner;

public class ScenicCruise extends Cruise {
	Scanner sc = new Scanner(System.in);

	void scenic() {
		double priceForAdults = 43.99;
		double priceForKids = 12.99;
		int noOfDays = 3;
		String cruiseSelected = "Scenic Cruise";
		super.priceForAdult = priceForAdults;
		super.priceForchildren = priceForKids;
		super.numDay = noOfDays;
		super.cruiseSelection = cruiseSelected;
		super.cruiseSelected();
	}

	void addOn() {
		String addOns = "spa ";
		System.out.println("Press Y if want to get spa for additional $50.");
		String userResponse = sc.nextLine();
		if (userResponse.equalsIgnoreCase("Y")) {
			super.additionalServicesPrice = 50;
			super.additionalService = addOns;
		} else {
			super.additionalServicesPrice = 0;
		}
	}

}
