package assignmentWeek10;

public class FamilySuite extends Hotel {

	void familyRoom() {
		int roomPrice = 230;
		String roomType = "family Suite";
		do {
			if (!(super.adults <= 4 && super.children <= 4)) {
				System.out.println(
						"this room is not suitable for more than 4 adults and 4 kids.please select the number of adults and kids again");
				super.getRoomDetails();
				this.familyRoom();
				super.calculateTax();
			} else {
				super.roomPrice = roomPrice;
				super.roomType = roomType;
			}
		} while (!(super.adults <= 4 && super.children <= 4));

	}
}
