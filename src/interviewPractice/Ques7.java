//Write a program to find if a string is a substring of another String.
package interviewPractice;

public class Ques7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "glass of water";
		String str2 = "water";

		// Check if str2 is present in str1
		boolean isSubstring = str1.contains(str2);

		System.out.println("Is '" + str2 + "' present in '" + str1 + "'? -" + isSubstring);
	}

}
