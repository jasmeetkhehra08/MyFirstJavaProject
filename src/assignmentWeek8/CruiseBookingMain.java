package assignmentWeek8;

import java.util.Scanner;

import assignmentWeek7.CruiseDetails;

public class CruiseBookingMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CruiseDetailsAndRegistration signUp = new CruiseDetailsAndRegistration("username", "password", "fullname",
				"phoneNumber");
		String enteredUsername=null;
		String enteredPassword=null;
		String enteredPhoneNumber=null;
		System.out.println("Welcome to Cruise Booking \nPlease sign up to book a cruise.\ndo you want to signup?");
		String userResponse = sc.next();
		signUp.signUp(userResponse);


			signUp.setUsername(enteredUsername); // setting username
			signUp.setPassword(enteredPassword); //setting password
		System.out.println("Enter your Full Name");
		String fullName = sc.next();
			signUp.setPhoneNumber(enteredPhoneNumber);
		System.out.println("Thank you for registering!");

		String again;
		String cruiseSelec;
		int index = 0;
		CruiseDetails scenicCruise = new CruiseDetails("Scenic Cruise", 43.99, 12.99, 3);
		CruiseDetails sunsetCruise = new CruiseDetails("Sunset Cruise", 52.99, 15.99, 1);
		CruiseDetails discoveryCruise = new CruiseDetails("Discovery Cruise", 39.99, 9.99, 4);
		CruiseDetails mysteryCruise = new CruiseDetails("Mystery Cruise", 45.99, 12.99, 2);
		CruiseDetails[] cruiseDetails = { scenicCruise, sunsetCruise, discoveryCruise, mysteryCruise };

		do {
			{System.out.println(
					"We offer 4 different packages as displayed below. Please enter the cruise that you want to select.\n"
							+ "Scenic Cruise\nSunset Cruise\nDiscovery Cruise\nMystery Cruise\n");
		
			cruiseSelec = sc.nextLine();
		}
			int counTry = 1;
			while (!cruiseSelec.equalsIgnoreCase("Scenic Cruise") && !cruiseSelec.equalsIgnoreCase("Sunset Cruise")
					&& !cruiseSelec.equalsIgnoreCase("Discovery Cruise")
					&& !cruiseSelec.equalsIgnoreCase("Mystery Cruise")) {
				++counTry;
				if (counTry > 3) {
					System.out.println("Please Start over,you have reached the input limit");
					System.exit(0);
					break;
				}
				System.out.println("Select below");
				cruiseSelec = sc.nextLine();

			}

			for (int i = 0; i < cruiseDetails.length; i++) {
				if ((cruiseSelec).equalsIgnoreCase(cruiseDetails[i].cruiseSelection)) {
					index = i;
					System.out.println("The cruise that you have selected is " + cruiseDetails[i].cruiseSelection
							+ " which is a " + cruiseDetails[i].numDay + " day cruise\r\n"
							+ "Price for Adults	(greater than 12)	: " + cruiseDetails[i].priceForAdult
							+ " per day\r\n" + "Price for kids above 5			: " + cruiseDetails[i].priceForchildren
							+ " per day\r\n" + "");
					break;
				}

			}
			System.out.println("Please press Y if you want to continue with the selection or\n"
					+ "press any other alphabet to select another");
			again = sc.nextLine();
		} while (!(again.equalsIgnoreCase("Y")));

		System.out.println("Enter the number of adults");
		int numAdults = sc.nextInt();
		System.out.println("Enter the number of children");
		int numChildren = sc.nextInt();
		int ageAboveFive = 0;
		int age;
		if (numChildren > 0) {
			for (int i = 0; i < numChildren; i++) {
				System.out.println("Enter the age of child " + (i + 1));
				age = sc.nextInt();
				while (age > 13 || age < 0) {
					System.out.println("Please enter a valid age of child " + (i + 1) + " from (1-12)");
					age = sc.nextInt();
				}
				if (age > 5) {
					ageAboveFive++;
				}
			}

		}
		{
			System.out.println(
					"All our cruises have food service on board. Do you want to pre-book for dinner buffet meals at \n20.99 per day for adults and 4.99 per day for kids?"
							+ "\nPlease press Y if you want to Prebook otherwise press any other alphabet");
			String buffetMeal = sc.next();
			cruiseDetails[index].setbuffetPrice(buffetMeal);
			cruiseDetails[index].output(numAdults, ageAboveFive);
		}
		System.out.println(
				"Do you want to change your personal information. Press Y to change. Press any other alphabet to exit.");
		String infoChange = sc.next();
		signUp.userResponse(infoChange);
		String userResp= sc.next();
		//signUp.infoChange(userResp);
		String newPassword="";
		String newUsername="";
		String newPhoneNumber="";
switch(userResp) {
case "1":
	signUp.updatePassword( enteredPassword, newPassword);
	break;
case "2":
	signUp.updatePhoneNumber(enteredPhoneNumber, newPhoneNumber);
	break;
case "3":
	signUp.updateUsername(enteredUsername, newUsername);
break;}
System.out.println("Thank you for using the service!");
}
}