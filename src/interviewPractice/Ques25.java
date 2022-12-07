//Write a Program to Check Armstrong Number
package interviewPractice;

import java.util.Scanner;

public class Ques25 {

	public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a number: ");
	        int number = scanner.nextInt();
	        int temp = number;
	        int rem, sum = 0;
	        while (temp != 0) {
	            rem = temp % 10;
	            sum = sum + (rem * rem * rem);
	            temp = temp / 10;
	        }
	        if (number == sum) {
	            System.out.println(number + " is an Armstrong number");
	        } else {
	            System.out.println(number + " is not an Armstrong number");
	        }
	    }

	}
