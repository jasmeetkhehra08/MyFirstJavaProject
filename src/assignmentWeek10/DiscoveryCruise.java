package assignmentWeek10;

import java.util.Scanner;

public class DiscoveryCruise extends Cruise  {
	Scanner sc=new Scanner(System.in);
	void discovery() {
		double priceForAdults=39.99;
		double priceForKids= 9.99;
		int noOfDays=4;
		String cruiseSelected="Discovery Cruise";
		super.priceForAdult=priceForAdults;
		super.priceForchildren=priceForKids;
		super.numDay=noOfDays;
		super.cruiseSelection=cruiseSelected;
		super.cruiseSelected();
		}
		
	void addOn() {
		String addOns= "Adventure Games ";
		System.out.println("Press Y if want to get Adventure Games for additional $50.");
		String userResponse = sc.nextLine();
		if(userResponse.equalsIgnoreCase("Y")) {
			super.additionalServicesPrice=50;
			super.additionalService=addOns;
		} else {
			super.additionalServicesPrice= 0;
		}
}
}
