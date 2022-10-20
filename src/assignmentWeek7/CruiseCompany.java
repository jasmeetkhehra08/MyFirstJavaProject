package assignmentWeek7;

import java.util.Scanner;

public class CruiseCompany {

	String packageChosen;
	double adultsTicketPrice;
	double childrenTicketPrice;
	int daysCount;
	int noOfAdults;

	public CruiseCompany(String nameOfCruise, double adultsTicketOver12, double childrenTicketOver5, int noOfDays) {

		packageChosen = nameOfCruise;
		adultsTicketPrice = adultsTicketOver12;
		childrenTicketPrice = childrenTicketOver5;
		daysCount = noOfDays;
		}
		
		int total1 (int adultsTicketPrice){
				{System.out.println("Your Package includes:");
				double total1= noOfAdults*adultsTicketPrice*daysCount;
				System.out.println(packageChosen + " adults @ " +noOfAdults +":"+ total1);}
				
				return adultsTicketPrice;
	}

	public CruiseCompany() {
		// TODO Auto-generated constructor stub
	}

	/// method 1 for cruise packages
	String cruisePackage(String packageChosen) {
		double priceForAdults;
		double priceForChildren;
		int noOfDays;
		switch (packageChosen) {
		case ("Scenic Cruise"): {
			System.out.println("The cruise that you have selected is Scenic Cruise which is a 3 day cruise\r\n"
					+ "Price for Adults	(greater than 12)	: 43.99 per day\r\n"
					+ "Price for kids above 5			: 12.99 per day\r\n" + "");
			break;
		}
		case ("Sunset Cruise"): {
			System.out.println("The cruise that you have selected is Sunset Cruise which is a 1 day cruise\r\n"
					+ "Price for Adults	(greater than 12)	: 52.99 per day\r\n"
					+ "Price for kids above 5			: 15.99 per day\r\n" + "");
			break;
		}
		case ("Discovery Cruise"): {
			System.out.println("The cruise that you have selected is Discovery Cruise which is a 4 day cruise\r\n"
					+ "Price for Adults	(greater than 12)	: 39.99 per day\r\n"
					+ "Price for kids above 5			: 9.99 per day\r\n" + "");
			break;
		}
		case ("Mystery Cruise"): {
			System.out.println("The cruise that you have selected is Mystery Cruise which is a 2 day cruise\r\n"
					+ "Price for Adults	(greater than 12)	: 45.99 per day\r\n"
					+ "Price for kids above 5			: 12.99 per day\r\n" + "");
			break;
		}
		default: {

			System.out.println("invalid input:choose from the following options only");
			break;
		}
		}

		return packageChosen;
	}

	// no of adult and child
	int adults(int noOfAdults) {
		int adults = 0;
		if (noOfAdults > 0) {
			adults = noOfAdults;
		}

		return adults;
	}

	////////// child age
	int ticketsForChildren(int ageOfChild) {
		int noOfChildren = 0;
		int ticketsForChildren;
		if (ageOfChild < 5) {
			ticketsForChildren = 0;
		} else if (ageOfChild < 5 && ageOfChild < 12) {
			ticketsForChildren = noOfChildren;
		}
		return ageOfChild;
	}

	///////// buffet option
	String buffetPrice(String buffetOption) {
		int buffetPrice = 0;
		double buffetmealForAdults = 20.99;
		double buffetmealForKids = 4.99;

		if (buffetOption.equals("Y")) {
			buffetmealForAdults = 20.99;
			buffetmealForKids = 4.99;
		} else {
			buffetPrice = 0;
			buffetmealForAdults = 0;
			buffetmealForKids = 0;
		}
		return buffetOption;

		

	}

	
	
}