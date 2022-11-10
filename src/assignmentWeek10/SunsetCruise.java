package assignmentWeek10;

import java.util.Scanner;

public class SunsetCruise extends Cruise {
	Scanner sc=new Scanner(System.in);
	void sunset() {
	double priceForAdults=52.99;
	double priceForKids= 15.99;
	int noOfDays=1;
	String cruiseSelected="Sunset Cruise";

	super.priceForAdult=priceForAdults;
	super.priceForchildren=priceForKids;
	super.numDay=noOfDays;
	super.cruiseSelection=cruiseSelected;
	super.cruiseSelected();
	}
	
	void addOn() {
		String addOns= "candle light dinner ";
		System.out.println("Press Y if want to add candle light dinner for additional $45.");
		String userResponse = sc.nextLine();
		if(userResponse.equalsIgnoreCase("Y")) {
			super.additionalServicesPrice=45;
			super.additionalService=addOns;
		} else {
			super.additionalServicesPrice= 0;
		}
	}
	}