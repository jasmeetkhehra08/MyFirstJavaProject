package assignmentsWeek6;

import java.util.Scanner;

public class MainClassCellphoneAndPlan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CellphoneAndPlan cp = new CellphoneAndPlan(); // instance of a class
		System.out.println("Please enter the Brand that you want to choose from: Apple/ Samsung");
		String brand = sc.next();
		switch (brand) {
		case "apple": {
			System.out.println(
					"Please enter the model that you want to buy from below: iphone14/ iphone14Pro/ iphone14Promax/ iphone14Mini");
			break;
		}
		case "samsung": {
			System.out
					.println("Please enter the model that you want to buy from below: S22/ S22Plus/ S22 Ultra/ S22FE");
			break;
		}
		default:
			System.out.println("invalid selection: choose from the availabe brands only");
			break;
		}
		String model = sc.next();
		System.out.println("Please select the plan that you want to opt for: Rogers/ Telus/ Bell");
		String Carrier = sc.next();
		String phoneTab = cp.selectDevice(model); // invoke a method

		String monthlyPlan = cp.selectPlan(Carrier); // invoke a method
		PhoneTabPrices pop = new PhoneTabPrices();
		CarrierPlanPrices pr = new CarrierPlanPrices();
//String phonePrice= pop.phoneTabPrice(model);

		// String planPrice = pr.carrierPlanCharges(Carrier);

	}
}
