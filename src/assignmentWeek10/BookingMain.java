package assignmentWeek10;

import java.util.Scanner;

public class BookingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String roomType = "";
		String cruiseSelec = "";
		String again = "";
		String userInput;
		Scanner sc = new Scanner(System.in);
		DeluxeSuite deluxSuite = new DeluxeSuite();
		FamilySuite familySuite = new FamilySuite();
		SunsetCruise sunsetCruise = new SunsetCruise();
		ScenicCruise scenicCruise = new ScenicCruise();
		DiscoveryCruise discoveryCruise = new DiscoveryCruise();
		MysteryCruise mysteryCruise = new MysteryCruise();
		deluxSuite.signUp(); // for signup
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
				} while (!((roomType.equals("family suite")) || roomType.equals("delux suite")));
				if (roomType.equals("delux suite")) {
					deluxSuite.getRoomDetails();
					deluxSuite.deluxRoom();
				} else if (roomType.equals("family suite")) {
					familySuite.getRoomDetails();
					familySuite.familyRoom();
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
				while (!again.equalsIgnoreCase("Y"))
					;
				switch (cruiseSelec) {
				case "sunset cruise":
					sunsetCruise.sunset();
					sunsetCruise.additionalDetails();
					sunsetCruise.addOn();
					sunsetCruise.output();
				case "scenic cruise":
					scenicCruise.scenic();
					scenicCruise.additionalDetails();
					scenicCruise.addOn();
					scenicCruise.output();
				case "discovery cruise":
					discoveryCruise.discovery();
					discoveryCruise.additionalDetails();
					discoveryCruise.addOn();
					discoveryCruise.output();
				case "mystery cruise":
					mysteryCruise.mystery();
					mysteryCruise.additionalDetails();
					mysteryCruise.addOn();
					mysteryCruise.output();
				}
			}
			System.out.println("Press Y if you want to book another Hotel Room or Cruise");
			userInput = sc.nextLine();
			if (!(userInput.equalsIgnoreCase("Y"))) {
				System.out.println("Thankyou for choosing our services");
				System.exit(0);
			}

		} while ((userInput.equalsIgnoreCase("Y")));
	}
}
