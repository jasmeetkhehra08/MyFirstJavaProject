//2 : Write a program to find if the number is prime or not.
package interviewPractice;

import java.util.Scanner;

public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		boolean isPrime= true;
		if(number > 1) {
		for(int i=2; i<number; i++) {
		if(number%i==0) {
			isPrime=false;
			System.out.println("Number is not prime");
			break;
			}}
		if(isPrime==true) {
			System.out.println("Number is prime");
		}}
		else {
			System.out.println("number is not prime");
		}

}
}
