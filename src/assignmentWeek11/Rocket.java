package assignmentWeek11;

public class Rocket implements Spaceship {

	int weight;
	int maxWeight;
	int cost;

	@Override
	public boolean launch() {
		return true;
	}

	@Override
	public boolean land() {
		return true;
	}

	@Override
	public boolean canCarry(Item item) { //passing class as parameter and accessing class level variables
int totalWeight= item.weight+weight;
if (totalWeight <= maxWeight) {
    return true;
} else {
    return false;}
	}
	

	@Override
	public int carry(Item item) {
		return weight = item.weight+weight;
		
	}

}
