//Write a Program to Check Whether a Character is Alphabet or Not.
package interviewPractice;

import java.util.Scanner;

public class Ques18 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a character: ");
	        char character = sc.next().charAt(0);
	        if((character>='a' && character<='z') || (character>='A' && character<='Z'))
	            System.out.println(character + " is an Alphabet");
	        else
	            System.out.println(character + " is not an Alphabet");

	}

}
