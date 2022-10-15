/*if cx has $50 only then he can buy milk.*/

package booleanMethod;

public class MilkBuyingExample {

	int moneyRequiredToBuyMilk = 50;

	int moneyRequiredToBuyMilk() {
		return moneyRequiredToBuyMilk;
	}

	boolean canCustomerBuyMilk(int moneyAvailable) {
		if (moneyAvailable >= moneyRequiredToBuyMilk) {
			return true;
		}
		return false;
	}
}
