package assignmentsWeek6;

import java.util.Scanner;

public class MainClassCellphoneAndPlan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CellphoneAndPlan phonePlan = new CellphoneAndPlan();// instance of a class using reference variable
		{System.out.println("Please enter the Brand that you want to choose from: Apple/ Samsung");}
		String brand = sc.next();
		while(!(brand.equals("apple")||brand.equals("samsung"))) {
			System.out.println("invalid input:choose from the availabe brands only");
			 brand = sc.next();
		}
		
		String brandSelected=phonePlan.brands(brand);//invoking a method for brand selection
		String model = sc.next();
		while(!(model.equals("s22")||model.equals("s22Plus")||model.equals("s22Ultra")||model.equals("s22FE")||model.equals("iphone14")||model.equals("iphone14Pro")||model.equals("iphone14Promax")||model.equals("iphone14Mini"))){
			System.out.println("invalid input:choose from the availabe models only");
			 model = sc.next();
		}
		
		System.out.println("Please select the plan that you want to opt for: Rogers/ Telus/ Bell");
		String carrier = sc.next();
		while(!(carrier.equals("telus"))||(carrier.equals("bell"))||(carrier.equals("rogers"))) {
			System.out.println("invalid input:choose from the availabe models only");
			carrier = sc.next();
		}
		int priceOfPhone = phonePlan.phonePrice(model);//invoking a method for phone price
		int priceOfPlan= phonePlan.planPrice(carrier); //invoking a method for plan price
		
int totalCostOfPlan = priceOfPhone+priceOfPlan;
//phonePlan.totalPriceOfPlan(priceOfPhone, priceOfPlan);
{
	System.out.println("Total Monthly Amount:$"+totalCostOfPlan);
}

}
}