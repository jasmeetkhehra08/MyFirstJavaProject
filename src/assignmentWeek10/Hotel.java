package assignmentWeek10;

import java.util.Scanner;

public class Hotel extends UserSignUp {

	int adults;
	int children;
	int noOfDays;
	int roomPrice;
	String roomType;
	double lunchForAdults;
	double lunchForChildren;
	double priceForRoom;
	
	public Hotel() {
		
	}
	Scanner sc= new Scanner(System.in);

	void getRoomDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the room you want to select\r\n"
    			+ "Delux Suite: accommodates 2 adults and 2 children at the rate of $180/ night\r\n"
    			+ "Family Suite: accommodates 4 adults and 4 children at $230/ night.\r\n"
    			);
        roomType = sc.nextLine();
        System.out.println("Enter number of adults:");
        adults = sc.nextInt();
        System.out.println("Enter number of children:");
        children = sc.nextInt();
        System.out.println("Enter the number of days of stay");
        noOfDays=sc.nextInt();
		 System.out.println("All rooms come with free breakfast. Do you want to add lunch in your room as well at a discounted pre-booking rate of $25/ adult and $5/ child.");
				String extraMeal=sc.next();
		 if (extraMeal.equalsIgnoreCase("Yes")) {
					lunchForAdults = 25;
					lunchForChildren = 5;
				} else {
					lunchForAdults = 0;
					lunchForChildren = 0;
				}
			}
	void calculateTax() {
		 double priceForRoom=noOfDays*roomPrice;
		double lunchPriceForAdults=noOfDays*lunchForAdults;
		double lunchPriceForChildren=noOfDays*lunchForChildren;
		double totalPrice=priceForRoom+lunchPriceForAdults+lunchPriceForChildren;
		double hst= (totalPrice*18)/100;
		double finalPrice=totalPrice+hst;
		System.out.println("The total amount you will be charged is:\n"+ roomType+ "@"+ noOfDays+"nights : $"+ priceForRoom +"\n"+
		"Lunch Pre-Booked Special Rate Adults @"+ adults+ ":$"+ lunchPriceForAdults +"\n" + "Lunch Pre-Booked Special Rate Children @" +
				children+ ":$" + lunchPriceForChildren + "\n" + "Total Price :$"+ totalPrice + "\n" + "HST	@ 18%	:$"+ hst+"\n" + "Final Price :$" + finalPrice );
		
	}
	

}
