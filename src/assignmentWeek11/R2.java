/*Rocket cost = $120 Million
Rocket weight = 18 Tonnes
Max weight (with cargo) = 29 Tonnes
Chance of launch explosion = 4% * (cargo carried / cargo limit)
Chance of landing crash = 8% * (cargo carried / cargo limit)*/

package assignmentWeek11;

public class R2 extends Rocket {

	public R2() {
		super(120,18000,29000);
	}

	@Override
	public boolean launch() {
		double chanceOfExploding = Math.random();
		if (chanceOfExploding >= 0.04 * (this.weight / this.maxWeight)) {
			System.out.println("Rocket launched successfully");
			return true;
		} else {
			System.out.println("R2 Rocket exploded");

			return false;

		}
	}

	@Override
	public boolean land() {
		double chanceOfCrash = Math.random();
		if (chanceOfCrash >= 0.08 * (this.weight / this.maxWeight)) {
			System.out.println("Rocket landed successfully");
			return true;
		} else {
			System.out.println("R2 Rocket crashed");
			return false;
		}
	}

}
