package assignmentWeek7;

import java.util.Scanner;

public class Extra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String optionConfirmed = null;
		String packageChosen;
		CruiseCompany scenicCruise = new CruiseCompany("Scenic Cruise", 43.99, 12.99, 3);
		CruiseCompany sunsetCruise = new CruiseCompany("Sunset Cruise", 52.99, 15.99, 1);
		CruiseCompany discoveryCruise = new CruiseCompany("Discovery Cruise", 39.99, 9.99, 4);
		CruiseCompany mysteryCruise = new CruiseCompany("Mystery Cruise", 45.99, 12.99, 2);

		CruiseCompany[] cruiseDetails= { scenicCruise, sunsetCruise, discoveryCruise, mysteryCruise };
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println(
					"We offer 4 different packages as displayed below. Please enter the cruise that you want to select.\r\n"
							+ "Scenic Cruise\r\n" + "Sunset Cruise\r\n" + "Discovery Cruise\r\n"
							+ "Mystery Cruise\r\n");
			packageChosen = sc.nextLine();
			

			System.out.println(
					"Please press Y if you want to continue with the selection or press any other alphabet to select another");
			optionConfirmed = sc.nextLine();
		} while (!(optionConfirmed.equals("Y")));
		{
			double adultsTicketPrice = 0.0;
			double childrenTicketPrice = 0.0;
			int noOfDays = 0;

			if (packageChosen.equals("Scenic Cruise")) {
				adultsTicketPrice = scenicCruise.adultsTicketPrice;
				childrenTicketPrice = scenicCruise.childrenTicketPrice;
				noOfDays = scenicCruise.daysCount;
			} else if (packageChosen.equals("Sunset Cruise")) {
				adultsTicketPrice = sunsetCruise.adultsTicketPrice;
				childrenTicketPrice = sunsetCruise.childrenTicketPrice;
				noOfDays = sunsetCruise.daysCount;
			}

			else if (packageChosen.equals("Discovery Cruise")) {
				adultsTicketPrice = discoveryCruise.adultsTicketPrice;
				childrenTicketPrice = discoveryCruise.childrenTicketPrice;
				noOfDays = discoveryCruise.daysCount;
			}

			else if (packageChosen.equals("Mystery Cruise")) {
				adultsTicketPrice = mysteryCruise.adultsTicketPrice;
				childrenTicketPrice = mysteryCruise.childrenTicketPrice;
				noOfDays = mysteryCruise.daysCount;
			} else {
				System.out.println("invalid Input");
			}

			System.out.println("Enter the number of adults");
			int noOfAdults = sc.nextInt();
	//		noOfAdults = cruiseCompany.adults(noOfAdults);

			System.out.println("Enter the number of children");
			int noOfChildren = sc.nextInt();
			if (!(noOfChildren == 0)) {
				int counter = 1;
				int ageOfChild;
				do {
					System.out.println("Enter the age of child " + counter);
					ageOfChild = sc.nextInt();
					counter++;
			//		ageOfChild = cruiseCompany.ticketsForChildren(ageOfChild);

				} while (counter == noOfChildren);
			}
			// double total2 = noOfChildren * (cruiseCompanies[i].childrenTicketPrice);

			System.out.println(
					"All our cruises have food service on board. Do you want to pre-book for dinner buffet meals at 20.99 per day for adults and 4.99 per day for kids?");

			String buffetOption = sc.nextLine();
//			buffetOption = cruiseCompany.buffetPrice(buffetOption);
			if(!(buffetOption.equals("Y"))) {
				double buffetmealForAdults = 0;
				double buffetmealForKids = 0;}
			else { 
			double buffetmealForAdults = 20.99;
			double buffetmealForKids = 4.99;

			System.out.println("Your Package includes:");
			double total1 = noOfAdults * adultsTicketPrice * noOfDays;
			System.out.println(packageChosen + " adults @ " + noOfAdults + ":" + total1);

			double total2 = noOfChildren * childrenTicketPrice * noOfDays;
			System.out.println(packageChosen + " Children above 5 @ " + noOfChildren + ":" + total2);

			System.out.println("Buffet Special Price Adults" + noOfAdults + ":$" + (noOfAdults * buffetmealForAdults));
			System.out.println("Buffet Special Price Children above 5 @ " + noOfChildren + ":$"
					+ (noOfChildren * buffetmealForKids));

			double totalPrice = total1 + total2 + (noOfAdults * buffetmealForAdults)
					+ (noOfChildren * buffetmealForKids) + (noOfChildren * buffetmealForKids);

			System.out.println("Total Price :$ " + totalPrice);
			double hst = totalPrice * 0.15;
			System.out.println("HST	@ 15% :" + hst);
			double finalPrice = totalPrice + hst;
			System.out.println("Final Price: " + finalPrice);
		}
	}
	}
}


