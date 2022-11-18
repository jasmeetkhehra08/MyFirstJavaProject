/*Rocket cost = $100 Million
Rocket weight = 10 Tonnes
Max weight (with cargo) = 18 Tonnes
Chance of launch explosion = 5% * (cargo carried / cargo limit)
Chance of landing crash = 1% * (cargo carried / cargo limit)*/

package assignmentWeek11;

public class R1 extends Rocket {

	int weight = 10000;
	int maxWeight = 18000;
	int cost = 100;

	public R1() {
		super.cost = cost;
		super.maxWeight = maxWeight;
		super.weight = weight;
	}

	@Override
	public boolean launch() {
		double chanceOfExploding = Math.random();
		if (chanceOfExploding <= 0.05 * (this.weight / this.maxWeight)) {
			System.out.println("Rocket launched successfully");
			return true;
		} else {
			System.out.println("Rocket exploded");
			return false;
		}
	}

	@Override
	public boolean land() {
		double chanceOfCrash = Math.random();
		if (chanceOfCrash <= 0.01 * (this.weight / this.maxWeight)) {
			System.out.println("Rocket landed successfully");
			return true;
		} else {
			System.out.println("Rocket crashed");
			return false;
		}
	}

}
