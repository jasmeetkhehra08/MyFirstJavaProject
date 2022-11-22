package assignmentWeek10;

import java.util.Scanner;

public class BookingMain {

	public static void main(String[] args) {
		String roomType = "";
		String cruiseSelec = "";
		String again = "";
		String userInput;
		Scanner sc = new Scanner(System.in);
		Cruise cruise = new Cruise(cruiseSelec, 0, 0, 0);
		Hotel hotel = new Hotel(0, roomType);
		cruise.signUp(); // for signup
		do {
			System.out.println("Please enter the service you want to book Hotel Stay/ Cruise");
			String UserSelected = sc.nextLine().toLowerCase();
			switch (UserSelected) {
			case "hotel":
				do {
					System.out.println("Please enter the room you want to select\r\n"
							+ "Delux Suite: accommodates 2 adults and 2 children at the rate of $180/ night\r\n"
							+ "Family Suite: accommodates 4 adults and 4 children at $230/ night.\r\n");
					roomType = sc.nextLine().toLowerCase();
				} while (!((roomType.equals("delux suite")) || roomType.equals("family suite")));
				if (roomType.equals("delux suite")) {
					hotel = new DeluxeSuite();
					hotel.getRoomDetails();
					hotel.calculateTax();
					break;
				} else if (roomType.equals("family suite")) {
					hotel = new FamilySuite();
					hotel.getRoomDetails();
					hotel.calculateTax();
					break;
				}
			case "cruise":
				do {
					System.out.println(
							"We offer 4 different packages as displayed below. Please enter the cruise that you want to select.\n"
									+ "Scenic Cruise\nSunset Cruise\nDiscovery Cruise\nMystery Cruise\n");
					cruiseSelec = sc.nextLine().toLowerCase();
				} while (!cruiseSelec.equals("scenic cruise") && !cruiseSelec.equals("sunset cruise")
						&& !cruiseSelec.equals("discovery cruise") && !cruiseSelec.equals("mystery cruise"));
				System.out.println("Please press Y if you want to continue with the selection or\n"
						+ "press any other alphabet to select another");
				again = sc.nextLine();
				while (!again.equalsIgnoreCase("Y"));
					
				switch (cruiseSelec) {
				case "sunset cruise":
					cruise = new SunsetCruise();
					cruise.calculations();
					break;
				case "scenic cruise":
					cruise = new ScenicCruise();
					cruise.calculations();
					break;
				case "discovery cruise":
					cruise = new DiscoveryCruise();
					cruise.calculations();
					break;
				case "mystery cruise":
					cruise = new MysteryCruise();
					cruise.calculations();
					break;
				}
			}
			System.out.println("Press Y if you want to book another Hotel Room or Cruise");
			userInput = sc.nextLine();
			if (!(userInput.equalsIgnoreCase("Y"))) {
				System.out.println("----Thankyou for choosing our services----");
				System.exit(0);
			}
		} while ((userInput.equalsIgnoreCase("Y")));
	}
}
