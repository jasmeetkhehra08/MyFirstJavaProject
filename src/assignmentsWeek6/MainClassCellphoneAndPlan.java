package assignmentsWeek6;

import java.util.Scanner;

public class MainClassCellphoneAndPlan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the Brand that you want to choose from: Apple/ Samsung");
		String brand = sc.next();
		System.out.println("Please enter the model that you want to buy from below:");
		switch (brand) {
		case "apple": {
			System.out.println("iphone14/ iphone14Pro/ iphone14Promax/ iphone14Mini");
			break;
		}
		case "samsung": {
			System.out.println("S22/ S22Plus/ S22 Ultra/ S22FE");
			break;
		}
		default:
			System.out.println("invalid selection: choose from the availabe models only");
			break;
		}
		String model = sc.next();
		System.out.println("Please select the plan that you want to opt for: Rogers/ Telus/ Bell");
		String Carrier = sc.next();

		CellphoneAndPlan cp = new CellphoneAndPlan(); //instance of a class
		String phoneTab = cp.selectDevice(model); //invoke a method

		String monthlyPlan = cp.selectPlan(Carrier); //invoke a method
		PriceOfPlans pop = new PriceOfPlans();
		int total = pop.total(0, 0);
		{System.out.println("model+carrier");
	}
}
}