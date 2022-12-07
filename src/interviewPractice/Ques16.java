//Write a program to Check Whether an Alphabet is Vowel or Consonant.
package interviewPractice;

import java.util.Scanner;

public class Ques16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a alphabet");
		char alphabet= sc.next().charAt(0);
		
		if(alphabet=='a'||alphabet=='e'||alphabet=='i'||
				alphabet=='o'||alphabet=='u')
		{
		System.out.println(alphabet+" is a vowel");
	}else{ 
			System.out.println(alphabet+" is a constant");
			}	
}

}
