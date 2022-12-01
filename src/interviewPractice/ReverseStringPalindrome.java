//1 : Write a program to reverse a string and check if it is a palindrome.
package interviewPractice;

import java.util.Scanner;

public class ReverseStringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String str=sc.next();
		
		String revStr="";
		for(int i=0; i<str.length(); i++) {
			revStr=str.charAt(i)+revStr;
		}
		System.out.println("Reverse String :" +revStr);
		
		if(revStr.equalsIgnoreCase(str)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
	}

}
