//Write a Program to Calculate the Power of a Number
package interviewPractice;

public class Ques23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int base = 2;
		int power=3;
		int sum=1;
		for(int i=0; i<power; i++) {
			sum=sum*base;
			
		}
		System.out.println(sum);
	}

}
