package assignmentWeek7;

import java.util.Scanner;

public class CruiseCompanyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CruiseCompany scenicCruise = new CruiseCompany("Scenic Cruise", 43.99, 12.99, 3);
		CruiseCompany sunsetCruise = new CruiseCompany("Sunset Cruise", 52.99, 15.99, 1);
		CruiseCompany discoveryCruise = new CruiseCompany("Discovery Cruise", 39.99, 9.99, 4);
		CruiseCompany mysteryCruise = new CruiseCompany("Mystery Cruise", 45.99, 12.99, 2);
		
		Scanner sc = new Scanner(System.in);
		String optionConfirmed=null;
		CruiseCompany cruiseCompany = new CruiseCompany();
		do {
			System.out.println(
					"We offer 4 different packages as displayed below. Please enter the cruise that you want to select.\r\n"
							+ "Scenic Cruise\r\n" + "Sunset Cruise\r\n" + "Discovery Cruise\r\n" + "Mystery Cruise\r\n");
			CruiseCompany[] cruiseCompanies = {scenicCruise, sunsetCruise, discoveryCruise, mysteryCruise};
			
			String packageChosen = sc.nextLine();
			for (int i = 0; i < cruiseCompanies.length; i++ ) 
			//packageChosen = cruiseCompany.cruisePackage(packageChosen);
			 {if (packageChosen.equals(cruiseCompanies[i].cruiseName)){
					packageChosen=cruiseCompanies[i].cruiseName;
				}
				
			}
			System.out.println(
					"Please press Y if you want to continue with the selection or press any other alphabet to select another");
			optionConfirmed = sc.nextLine();
		} while (!(optionConfirmed.equals("Y")));
		
		
		System.out.println("Enter the number of adults");
		int noOfAdults = sc.nextInt();
		noOfAdults=cruiseCompany.adults(noOfAdults);
	double total=(noOfAdults*cruiseCompanies[i].adultsTicketPrice);
			//*cruiseCompanies[i].daysCount;
		System.out.println("Enter the number of children");
		int noOfChildren = sc.nextInt();
		if (!(noOfChildren == 0)) {
			int counter = 1;
			int ageOfChild;
			do {
				System.out.println("Enter the age of child " + counter);
				ageOfChild = sc.nextInt();
				counter++;
				ageOfChild= cruiseCompany.ticketsForChildren(ageOfChild);
				
			} while (counter == noOfChildren);
		} 
		double total1= noOfChildren*(cruiseCompanies[i].childrenTicketPrice);
		
	{System.out.println("All our cruises have food service on board. Do you want to pre-book for dinner buffet meals at 20.99 per day for adults and 4.99 per day for kids?");
	String buffetOption=null;
	buffetOption = sc.nextLine();
		buffetOption= cruiseCompany.buffetPrice(buffetOption);}
	{	System.out.println("Your Package includes:");
	System.out.println(packageChosen +"adults @"+total);
		}
	{System.out.println(packageChosen +" Children above 5 @ "+noOfChildren+total1);}
}
}
}
		
		
		
	


