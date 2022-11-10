package assignmentWeek10;

public class DeluxeSuite extends Hotel {
	
	void deluxRoom() {
	if (super.roomType.equalsIgnoreCase("Delux Suite"))
super.roomPrice=180;
 roomType="Delux Suite";
		
		if(!(super.adults<3 && super.children<3)) {
			System.out.println("this room is not suitable for more than 2 adults and 2 kids.please");
		}
	}
}
