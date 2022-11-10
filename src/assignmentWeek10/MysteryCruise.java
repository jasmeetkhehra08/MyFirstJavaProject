package assignmentWeek10;

import java.util.Scanner;

import assignmentWeek7.CruiseDetails;

public class MysteryCruise extends Cruise {

	Scanner sc=new Scanner(System.in);
	void mystery() {
	double priceForAdults=45.99;
	double priceForKids= 12.99;
	int noOfDays=2;
	String cruiseSelected="Mystery Cruise";
	super.priceForAdult=priceForAdults;
	super.priceForchildren=priceForKids;
	super.numDay=noOfDays;
	super.cruiseSelection=cruiseSelected;
	super.cruiseSelected();
	}
	
	void addOn() {
		String addOns= "casino entry ticket ";
		System.out.println("Press Y if want to get casino entry ticket for additional $20.");
		String userResponse = sc.nextLine();
		if(userResponse.equalsIgnoreCase("Y")) {
			super.additionalServicesPrice=20;
			super.additionalService=addOns;
		} else {
			super.additionalServicesPrice= 0;
		}
	}
}
