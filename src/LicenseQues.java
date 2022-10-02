
public class LicenseQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age = 20;
String currentLicense = "";

		if (20>=16) {
			if (currentLicense == "noLicense") {
				System.out.println("G1 will be issued");
			}
			else if (currentLicense == "G1"){
			
				System.out.println("G2 will be issued");
			}
			else if(currentLicense == "G2"){
				System.out.println("G will be issued");
			}
			else if ( currentLicense == "G") {
				System.out.println("GZ will be issued");
				}
				else if (currentLicense == "GZ")
				{
					System.out.println("AZ will be issued");
				}	
				else if (currentLicense == "AZ") {
					System.out.println("You already have the heigher level license");
			}
				else {
					System.out.println("License will not be issued");
				}
		}
		
	}

}
