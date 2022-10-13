/*S22	$25/ month	IPhone 14	$30/ month
S22+	$35/month	IPhone 14 pro	$40/Month
S22 Ultra	$55/ month	IPhone 14 pro max	$65/Month
S22FE	$20/month	IPhone 14 mini	$25/Month */
package assignmentsWeek6;

public class PriceOfPlans {
		// TODO Auto-generated method stub
		
		int total(int model, int carrier) {
			int total = model+carrier;
		
		int s22 = 25;
		int s22Plus = 35;
		int s22Ultra = 55;
		int s22FE = 20;
		int iphone14 = 30;
		int iphone14Pro = 40;
		int iphone14Promax = 65;
		int iphoneMini = 25;
		
		if (model==s22) {
			System.out.println(s22);
			}
			else if(model==s22Plus) {
				System.out.println(s22Plus);}
				else if (model==s22Ultra) {
					System.out.println(s22Ultra);
		}else if (model==s22FE) {
			System.out.println(s22FE);}
			else {
				System.out.println("invalid input");
			}
		
		
		int telus = 75;
		int bell = 80;
		int rogers = 70;
		
		if (carrier==telus) {
			System.out.println(telus);}
			else if (carrier==bell) {
				System.out.println(bell);}
			else if (carrier==rogers) {
				System.out.println(rogers);}
				else {
					System.out.println("wrong input");
				}
				
		
		
		return total;
		
		

}
}
