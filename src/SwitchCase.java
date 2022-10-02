
public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// coffeeshop menu

		String typeOfDrink = "tea";

		switch (typeOfDrink) {
		case "coffee":
			System.out.println("Customer will get coffee");
			break;
		case "tea":
			System.out.println("customer will get tea");
			break;
		case "juice":
			System.out.println("customer will get juice");
			break;
		case "smoothie":
			System.out.println("customer will get smoothie");
			break;
		default:
			System.out.println("Item is not in the menu");
			break;

		}
	}

}
