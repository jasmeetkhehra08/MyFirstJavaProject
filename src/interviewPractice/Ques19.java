//Write a Program to Calculate the Sum of Natural Numbers.
package interviewPractice;

public class Ques19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 3;

		// Calculate the sum of natural numbers.
		int sum = 0;
		for(int i = 1; i <= number; i++) {
			sum = sum + i;
		}

		// Print the result.
		System.out.println("Sum = " + sum);
	}

}
