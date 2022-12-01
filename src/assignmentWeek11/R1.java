/*Rocket cost = $100 Million
Rocket weight = 10 Tonnes
Max weight (with cargo) = 18 Tonnes
Chance of launch explosion = 5% * (cargo carried / cargo limit)
Chance of landing crash = 1% * (cargo carried / cargo limit)*/

package assignmentWeek11;

public class R1 extends Rocket {
	
	public R1() {
		super(100,10000,18000);
	}

	@Override
	public boolean launch() {
		double chanceOfExploding =( Math.random());
		if (chanceOfExploding <= 0.50 * (this.getCargoCarried() / this.getCargoLimit())) {
			System.out.println("Rocket launched successfully");
			return true;
		} else {
			System.out.println("R1 Rocket exploded");
			return false;
		}
	}

	@Override
	public boolean land() {
		double chanceOfCrash = (Math.random())/100;
		if (chanceOfCrash <= 0.50 * (this.getCargoCarried() / this.getCargoLimit())) {
			System.out.println("Rocket landed successfully");
			return true;
		} else {
			System.out.println("R1 Rocket crashed");
			return false;
		}
	}


}
