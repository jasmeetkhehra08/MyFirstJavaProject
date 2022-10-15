package booleanMethod;

import java.util.Scanner;

public class MilkExampleMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the money available");
		int moneyAvailable = sc.nextInt();

		MilkBuyingExample buyMilk = new MilkBuyingExample();// instance of a class
		int moneyRequiredToBuyMilk = buyMilk.moneyRequiredToBuyMilk();// invoking a method

		boolean canCustomerBuyMilk = buyMilk.canCustomerBuyMilk(moneyAvailable);// invoking a method

		System.out.println(canCustomerBuyMilk);

	}

}
