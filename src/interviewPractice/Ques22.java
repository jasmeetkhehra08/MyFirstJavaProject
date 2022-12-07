//Write a Program to Display Fibonacci Series
package interviewPractice;

public class Ques22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 1;
		int count = 10;

		for (int i = 0; i < count; i++) {
			int sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			System.out.println(sum);
		}
	}

}
