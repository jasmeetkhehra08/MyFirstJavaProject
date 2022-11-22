package assignmentWeek10;

import java.util.Scanner;

public class Hotel extends UserSignUp {

	int adults;
	int children;
	int noOfDays;
	int roomPrice;
	String roomType;
	double lunchForAdults = 25;
	double lunchForChildren = 5;
	Scanner sc = new Scanner(System.in);

	public Hotel(int roomPrice, String roomType) {
		this.roomPrice = roomPrice;
		this.roomType = roomType;
	}

	void getRoomDetails() {
		do {
			System.out.println("Enter number of adults:");
			adults = sc.nextInt();
			System.out.println("Enter number of children:");
			children = sc.nextInt();
			if ((roomType.equals("family Suite") && (!(adults <= 4 && children <= 4)))
					|| (roomType.equals("delux Suite") && (!(adults <= 2 && children <= 2)))) {
				System.out.println(
						"this room is not suitable for no. of adults/childrens you choose.please select the number of adults and kids again");
			}
		} while ((roomType.equals("family Suite") && (!(adults <= 4 && children <= 4)))
				|| (roomType.equals("delux Suite") && (!(adults <= 2 && children <= 2))));
		do {
			System.out.println("Enter the number of days of stay");
			noOfDays = sc.nextInt();
		} while (noOfDays == 0);
		System.out.println(
				"All rooms come with free breakfast. Do you want to add lunch in your room as well at a discounted pre-booking rate of $25/ adult and $5/ child.\n Press Y to add");
		String extraMeal = sc.next();
		if (!(extraMeal.equalsIgnoreCase("Y"))) {
			lunchForAdults = 0;
			lunchForChildren = 0;
		}
	}

	void calculateTax() {
		double priceForRoom = noOfDays * roomPrice;
		double lunchPriceForAdults = noOfDays * lunchForAdults;
		double lunchPriceForChildren = noOfDays * lunchForChildren;
		double totalPrice = priceForRoom + lunchPriceForAdults + lunchPriceForChildren;
		double hst = (totalPrice * 18) / 100;
		double finalPrice = totalPrice + hst;
		System.out.println("The total amount you will be charged is:\n" + roomType + "@" + noOfDays + "nights : $"
				+ priceForRoom + "\n" + "Lunch Pre-Booked Special Rate Adults @" + adults + ":$" + lunchPriceForAdults
				+ "\n" + "Lunch Pre-Booked Special Rate Children @" + children + ":$" + lunchPriceForChildren + "\n"
				+ "Total Price :$" + totalPrice + "\n" + "HST	@ 18%	:$" + hst + "\n" + "Final Price :$"
				+ finalPrice);
	}
}
