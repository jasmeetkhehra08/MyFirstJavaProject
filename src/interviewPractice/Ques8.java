//Write a program to find smallest and largest number in an array.
package interviewPractice;

public class Ques8 {

	public static void main(String[] args) {
		int[] numbers = {100, 20, 30, 40, 500};
		 
		int largest = numbers[0];
		int smallest = numbers[0];
 
		for(int i=1; i< numbers.length; i++)
		{
			if(numbers[i] > largest)
				largest = numbers[i];
			else if (numbers[i] < smallest)
				smallest = numbers[i];
		}
		System.out.println("Largest Number is : " + largest);
		System.out.println("Smallest Number is : " + smallest);
	}
}
