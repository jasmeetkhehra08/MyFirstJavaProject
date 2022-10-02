
public class AndOrOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//get points at gas station 

		Boolean payByCard = false;
		Boolean payWithCash = false;
		Boolean hasPointsCard = false;
		
		if((payByCard || payWithCash) && hasPointsCard)
		{
			System.out.println("Customer can get points");
		}
		else 
		{
			System.out.println("Customer cannot get points");
		}
	}

}

