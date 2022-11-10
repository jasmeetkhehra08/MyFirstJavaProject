/* you will be handling the price calculation, buffet details, tax calculation etc.*/
package assignmentWeek10;

import assignmentWeek7.CruiseDetails;

public class Cruise extends UserSignUp{

    String cruiseSelection="";
	double priceForAdult=0;
	double priceForchildren=0;
	 int numDay=0;
	double buffetForAdults;
	double buffetForChildren;
	int numAdults;
	int numChildren;
	int ageAboveFive;
	int additionalServicesPrice;
	String additionalService="";

	void cruiseSelected() {
		{System.out.println("The cruise that you have selected is " + cruiseSelection
				+ " which is a " + numDay + " day cruise\r\n"
				+ "Price for Adults	(greater than 12)	: " + priceForAdult
				+ " per day\r\n" + "Price for kids above 5			: " + priceForchildren
				+ " per day\r\n" + "");
		}}
	
	void additionalDetails() {
	System.out.println("Enter the number of adults");
	numAdults = sc.nextInt();
	System.out.println("Enter the number of children");
	 numChildren = sc.nextInt();
	ageAboveFive = 0;
	int age;
	if (numChildren > 0) {
		for (int i = 0; i < numChildren; i++) {
			System.out.println("Enter the age of child " + (i + 1));
			age = sc.nextInt();
			while (age >= 13 || age <= 0) {
				System.out.println("Please enter a valid age of child " + (i + 1) + " from (1-12)");
				age = sc.nextInt();
			}

			if (age >= 5) {
				ageAboveFive++;
			}
		}
	}

	System.out.println(
			"All our cruises have food service on board. Do you want to pre-book for dinner buffet meals at \n20.99 per day for adults and 4.99 per day for kids?"
					+ "\nPlease press Y if you want to Prebook otherwise press any other alphabet");
	String buffetMeal = sc.next();
if (buffetMeal.equalsIgnoreCase("Y")) {
			buffetForAdults = 20.99;
			buffetForChildren = 4.99;
		} else {
			buffetForAdults = 0.0;
			buffetForChildren = 0.0;
		}
	 
	}
	 void output() {
		double priceForAdults = numAdults * priceForAdult * numDay;
		double priceforChildren = ageAboveFive * priceForchildren * numDay;
		double buffetTotalPriceAdult = numAdults * buffetForAdults;
		double buffetTotalPriceChildren = ageAboveFive * buffetForChildren;
		additionalServicesPrice= numAdults*additionalServicesPrice;
		double totalPrice = priceForAdults + priceforChildren + buffetTotalPriceAdult + buffetTotalPriceChildren+ additionalServicesPrice;
		double hst = (totalPrice * 15) / 100;
		double FinalPrice = totalPrice + hst;
		System.out.println("Your Package includes:\n" + cruiseSelection + " Adults 		@ 		" + numAdults + "	:$"
				+ (priceForAdults) + "\n" + cruiseSelection + " Children above 5 @ 		" + ageAboveFive
				+ "	:$" + (priceforChildren) + "\n" + "Buffet Special Price Adults	@		" + numAdults
				+ "	:$" + (buffetTotalPriceAdult) + "\n" + "Buffet Special Price Children above 5 @ 	"
				+ ageAboveFive + "	:$" + (buffetTotalPriceChildren) + "\n" +"add-Ons "+ additionalService +":$"+additionalServicesPrice+ "\n"+ "Total Price					"
				+ "	:$" +(totalPrice) + "\n" + "HST	@ 15%					" + "	:$" + (hst)
				+ "\n" + "Final Price						: $" + (FinalPrice) + "\n");
	}
}
	

