
public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int actualDrinkingCapacity = 4;
		for (int drinksYouHad = 1; drinksYouHad <= actualDrinkingCapacity; drinksYouHad++) {
			System.out.println("You had " + drinksYouHad + " drinks ");
			if (drinksYouHad >= actualDrinkingCapacity) {
				System.out.println("You cannot have more drinks");

			} else {
				System.out.println("You can have more drinks");

			}
		}

	}

}