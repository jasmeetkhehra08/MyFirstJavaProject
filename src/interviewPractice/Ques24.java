//Write a Program to Check Whether a Number is Palindrome
package interviewPractice;

import java.util.Scanner;

public class Ques24 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int num = 12, reversedInteger = 0, remainder, originalInteger;

    originalInteger = num;

    // reversed integer is stored in variable 
    while( num != 0 )
    {
        remainder = num % 10;
        reversedInteger = reversedInteger * 10 + remainder;
        num  /= 10;
    }
    System.out.println(reversedInteger);
    // palindrome if orignalInteger and reversedInteger are equal
    if (originalInteger == reversedInteger)
        System.out.println(originalInteger + " is a palindrome.");
    else
        System.out.println(originalInteger + " is not a palindrome.");
		
		
	}

}
