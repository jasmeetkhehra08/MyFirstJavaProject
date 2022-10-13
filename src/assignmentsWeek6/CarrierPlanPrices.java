package assignmentsWeek6;

public class CarrierPlanPrices {

	String carrierPlanCharges(String carrier) {
		// TODO Auto-generated method stub

		int telus = 75;
		int bell = 80;
		int rogers = 70;

		if (carrier.equals("telus")) {
			System.out.println(telus);
		} else if (carrier.equals("bell")) {
			System.out.println(bell);
		} else if (carrier.equals("rogers")) {
			System.out.println(rogers);
		} else {
			System.out.println("wrong input");
		}

		return carrier;
	}

}
