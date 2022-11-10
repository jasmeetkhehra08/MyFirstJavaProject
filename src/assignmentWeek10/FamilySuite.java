package assignmentWeek10;

public class FamilySuite extends Hotel {

	void familyRoom() {
		if (super.roomType.equalsIgnoreCase("family Suite"))
			super.roomPrice=230;
		roomType="family Suite";		
			while(!(super.adults<5 && super.children<5)) {
				System.out.println("this room is not suitable for more than 2 adults and 2 kids.pleas");
			}
	}
	
}
