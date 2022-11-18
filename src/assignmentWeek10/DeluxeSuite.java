package assignmentWeek10;

public class DeluxeSuite extends Hotel {

	void deluxRoom() {
	int roomPrice = 180;
		String roomType = "delux Suite";
		do {
			if (!(super.adults <= 2 && super.children <= 2)) {
				System.out.println(
						"this room is not suitable for more than 2 adults and 2 kids.please select the number of adults and kids again");
				super.getRoomDetails();
				this.deluxRoom();
				super.calculateTax();
			} else {
				super.roomPrice = roomPrice;
				super.roomType = roomType;
			}
		} while (!(super.adults <= 2 && super.children <= 2));
	}
}