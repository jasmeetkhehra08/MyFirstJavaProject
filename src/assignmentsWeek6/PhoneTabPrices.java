/*S22	$25/ month	IPhone 14	$30/ month
S22+	$35/month	IPhone 14 pro	$40/Month
S22 Ultra	$55/ month	IPhone 14 pro max	$65/Month
S22FE	$20/month	IPhone 14 mini	$25/Month */
package assignmentsWeek6;

public class PhoneTabPrices {
		// TODO Auto-generated method stub
		
		String phoneTabPrice(String model) {
			
		int s22 = 25;
		int s22Plus = 35;
		int s22Ultra = 55;
		int s22FE = 20;
		int iphone14 = 30;
		int iphone14Pro = 40;
		int iphone14Promax = 65;
		int iphoneMini = 25;
		
	if (model.equals("s22")) {
			System.out.println(s22);
			}
			else if(model.equals("s22Plus")) {
				System.out.println(s22Plus);}
				else if (model.equals("s22Ultra")) {
					System.out.println(s22Ultra);
		}else if (model.equals("s22FE")) {
			System.out.println(s22FE);}
		else if (model.equals("iphone14")) {
			System.out.println(iphone14);}
		else if (model.equals("iphone14Pro")) {
			System.out.println(iphone14Pro);}
		else if (model.equals("iphone14Promax")) {
			System.out.println(iphone14Promax);}
		else if (model.equals("iphone14Mini")) {
			System.out.println("iphone14Mini");}
		else {
				System.out.println("invalid input");
			}
	return model;
		}
		
		
		
		}
		


