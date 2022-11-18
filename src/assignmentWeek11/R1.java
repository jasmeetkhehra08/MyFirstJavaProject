/*Rocket cost = $100 Million
Rocket weight = 10 Tonnes
Max weight (with cargo) = 18 Tonnes
Chance of launch explosion = 5% * (cargo carried / cargo limit)
Chance of landing crash = 1% * (cargo carried / cargo limit)*/

package assignmentWeek11;

public class R1 extends Rocket{

	@Override
	public boolean launch() {
		double chanceOfExploding=Math.random();
		if(chanceOfExploding<=0.1) {
			System.out.println("Rocket launched successfully");
		return true;
	}else {
		System.out.println("Rocket exploded");
		return false;
	}}

	@Override
	public boolean land() {
		double chanceOfLanding =Math.random();
		if(chanceOfLanding<=0.2) {
			System.out.println("Rocket landed successfully");
			return true;
		}else {
			System.out.println("Rocket crashed");
			return false;
		}
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
		
	
}}
