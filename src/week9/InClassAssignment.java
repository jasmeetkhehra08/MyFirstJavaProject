package week9;

public class InClassAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Print first name
		// Just print your first name

		String name = "jasmeet kaur";

		// Find length of your name
		int nameLength = name.length();
		System.out.println("name length :" + nameLength);

		// Replace all e with another character in your name
		String newName = name.replace("e", "i");
		System.out.println("replacing e with i :" + newName);

		// Just print your first name
		String firstName = name.substring(0, 7);
		System.out.println(firstName);

		// Write your first and Last name and replace Last name with *
		name = name.replace("kaur", "****");
		System.out.println("replacing last name :" + name);
	}

}
