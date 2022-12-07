//Write a Program to Find Factorial of a Number
//A factorial of a number is the product of all positive integers less than or equal to that number. 
package interviewPractice;

import java.util.Scanner;

public class Ques20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number to find factorial:");

	        int number = sc.nextInt();
	        int factorial = 1;

	        for (int i = 1; i <= number; i++) {
	        	factorial = factorial * i;
	        }

	        System.out.println("Factorial of " + number + " is " + factorial);
	    }
	}

