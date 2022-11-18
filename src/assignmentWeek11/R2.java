/*Rocket cost = $120 Million
Rocket weight = 18 Tonnes
Max weight (with cargo) = 29 Tonnes
Chance of launch explosion = 4% * (cargo carried / cargo limit)
Chance of landing crash = 8% * (cargo carried / cargo limit)*/

package assignmentWeek11;

public class R2 extends Rocket {
	@Override
	public boolean launch() {
		double chanceOfExploding=Math.random();
		if(chanceOfExploding<=0.15) {
			System.out.println("Rocket launched successfully");
		return true;
	}else {
		System.out.println("Rocket exploded");
		
		return false;
		
	}
	}

	@Override
	public boolean land() {
		double chanceOfLanding =Math.random();
		if(chanceOfLanding<=0.2) {
			System.out.println("Rocket landed successfully");
			return true;
		}else {
			System.out.println("Rocket crashed");
			return false;
		}}

	
}
