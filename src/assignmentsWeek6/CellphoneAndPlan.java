/*S22	$25/ month	IPhone 14	$30/ month
S22+	$35/month	IPhone 14 pro	$40/Month
S22 Ultra	$55/ month	IPhone 14 pro max	$65/Month
S22FE	$20/month	IPhone 14 mini	$25/Month */

package assignmentsWeek6;

public class CellphoneAndPlan {

	String selectDevice(String model) {
		//String phoneTab;
		
		if (model.equals("s22")) {
			System.out.println(" Your Phone Tab will be : $25/month");  
		} else if (model.equals("s22Plus")) {
			System.out.println("Your Phone Tab will be : $35/ month");  
		} else if (model.equals("s22Ultra")) {
			System.out.println("Your Phone Tab will be : $55/ month");  
		} else if (model.equals("s22FE")) {
			System.out.println("Your Phone Tab will be : $20/ month");  
		} else if (model.equals("iphone14")) {
			System.out.println("Your Phone Tab will be : $30/ month");  
		} else if (model.equals("iphone14Pro")) {
			System.out.println("Your Phone Tab will be : $40/ month");  
		} else if (model.equals("iphone14Promax")) {
			System.out.println("Your Phone Tab will be : $65/ month");  
		} else if (model.equals("iphone14Mini")) {
			System.out.println("Your Phone Tab will be : $25/ month");  
		} else {
			System.out.println("invalid input");
		}

		return model;
	}
	
	String selectPlan(String carrier)
	{
	//	String monthlyPlan;
		if(carrier.equals("telus")) {
			System.out.println("Your Monthly Plan will be : $75/month");  
		}else if (carrier.equals("bell")) {
			System.out.println("Your Monthly Plan will be : $80/month");
		}else if (carrier.equals("rogers")) {
			System.out.println("Your Monthly Plan will be : $70/month");}
			else {
				System.out.println("invalid intput");
			}
	

	return carrier;
	
	}
	
}
	


