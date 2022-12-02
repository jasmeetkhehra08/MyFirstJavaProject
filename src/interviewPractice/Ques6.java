//Write a program to replace 2 number without using third variable
package interviewPractice;

public class Ques6 {

	public static void main(String[] args) {
int x = 2, y = 5; 
		
		System.out.println("Before Replace: x = " + x + " & y = " + y);
		
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println("After Replace: x = " + x + " & y = " + y);
	}
	}
