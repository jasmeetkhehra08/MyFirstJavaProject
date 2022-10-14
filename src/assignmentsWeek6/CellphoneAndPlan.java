
package assignmentsWeek6;

import java.util.Scanner;

public class CellphoneAndPlan {
//	String osSelection( ) {

	String brands(String brandName) {
	
		if (brandName.equals("apple")) {
			System.out.println(
					"Please enter the model that you want to buy from below: iphone14/ iphone14Pro/ iphone14Promax/ iphone14Mini");
		} else if (brandName.equals("samsung")) {
			System.out
					.println("Please enter the model that you want to buy from below: S22/ S22Plus/ S22 Ultra/ S22FE");
		}

		else {
			System.out.println("invalid selection: choose from the availabe brands only");
		}

		return brandName;
	}

///2nd method
	int phonePrice(String model) {
		int priceOfPhone = 0;
		int s22 = 25;
		int s22Plus = 35;
		int s22Ultra = 55;
		int s22FE = 20;
		int iphone14 = 30;
		int iphone14Pro = 40;
		int iphone14Promax = 65;
		int iphone14Mini = 25;

		if (model.equals("s22")) {
			System.out.println(" Your Phone Tab will be : $" + s22 + "/month");
			priceOfPhone = s22;
		} else if (model.equals("s22Plus")) {
			System.out.println("Your Phone Tab will be : $" + s22Plus + "/ month");
			priceOfPhone = s22Plus;
		} else if (model.equals("s22Ultra")) {
			System.out.println("Your Phone Tab will be : $" + s22Ultra + "/ month");
			priceOfPhone = s22Ultra;
		} else if (model.equals("s22FE")) {
			System.out.println("Your Phone Tab will be : $" + s22FE + "/ month");
			priceOfPhone = s22FE;
		} else if (model.equals("iphone14")) {
			System.out.println("Your Phone Tab will be : $" + iphone14 + "/ month");
			priceOfPhone= iphone14;
		} else if (model.equals("iphone14Pro")) {
			System.out.println("Your Phone Tab will be : $" + iphone14Pro + "/ month");
			priceOfPhone = iphone14Pro;
		} else if (model.equals("iphone14Promax")) {
			System.out.println("Your Phone Tab will be : $" + iphone14Promax + "/ month");
			priceOfPhone = iphone14Promax;
		} else if (model.equals("iphone14Mini")) {
			System.out.println("Your Phone Tab will be : $" + iphone14Mini + "/ month");
			priceOfPhone = iphone14Mini;
		} else {
			System.out.println("invalid input");
		}
		return priceOfPhone;
	}

	///3rd method
	int planPrice(String carrier) {
		int priceOfPlan = 0; 
		int telus = 75;
		int bell = 80;
		int rogers = 70;

		if (carrier.equals("telus")) {
			System.out.println("Your Monthly Plan will be : $" + telus + "/month");
			priceOfPlan= telus;
		} else if (carrier.equals("bell")) {
			System.out.println("Your Monthly Plan will be : $" + bell + "/month");
			priceOfPlan= bell;
		} else if (carrier.equals("rogers")) {
			System.out.println("Your Monthly Plan will be : $" + rogers + "/month");
			priceOfPlan=rogers;
		} else {
			System.out.println("invalid input");
		}

		return priceOfPlan;
	}
}

