package assignmentWeek11;

public class Rocket implements Spaceship {

	int weight;
	int maxWeight;
	int cost;
	int cargoCarried;

	public Rocket(int cost,int weight, int maxWeight) {
		this.cost = cost;
		this.maxWeight = maxWeight;
		  this.weight = weight;
		this.cargoCarried = 0;

	}

	@Override
	public boolean launch() {
		return true;
	}

	@Override
	public boolean land() {
		return true;
	}

	@Override
	public boolean canCarry(Item item) { // passing class as parameter and accessing class level variables
		int totalWeight = item.weight + cargoCarried;
		if (totalWeight <= maxWeight) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int carry(Item item) {
		return cargoCarried = item.weight + cargoCarried;

	}

}
