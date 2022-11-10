package assignmentWeek10;

import java.util.Scanner;

public class BookingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		DeluxeSuite deluxSuite = new DeluxeSuite();
		FamilySuite familySuite =new FamilySuite();
	//	deluxSuite.signUp(); //for signup
System.out.println("Please enter the service you want to book Hotel Stay/ Cruise");
String UserSelected= sc.next();
switch(UserSelected.toLowerCase()) {
case "hotel":
	deluxSuite.getRoomDetails();
	//deluxSuite.deluxRoom();
	familySuite.familyRoom();
	deluxSuite.calculateTax();
//	if ( roomType.equalsIgnoreCase("delux suite")){
//		deluxSuite.deluxRoom();
//		
//	break;}
//	else if (roomType.equalsIgnoreCase("family suite")) {
//		familySuite.FamilySuite();
//		deluxSuite.calculateTax();
	break;}
	
	

}
	}
	
