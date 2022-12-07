//Write a Program to Check Whether a Number is Positive or Negative
package interviewPractice;

import java.util.Scanner;

public class Ques17 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a number: ");
	        int number = sc.nextInt();
	        if(number > 0) {
	            System.out.println("The number is positive.");
	        } else if(number < 0) {
	            System.out.println("The number is negative.");
	        } else {
	            System.out.println("The number is zero.");
	        }
	    }	
	}
