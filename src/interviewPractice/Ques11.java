//Write a program to sort an array of number.(same as ques 4)
package interviewPractice;

public class Ques11 {

	public static void main(String[] args) {
		int[] numbers = { 100, 13, 25, 180, 34, 70 };
		
		// Sorting the array in ascending order
				for (int i = 0; i < numbers.length; i++) {
					for (int j = i + 1; j < numbers.length; j++) {
						if (numbers[i] > numbers[j]) {
							int temp = numbers[i];
							numbers[i] = numbers[j];
							numbers[j] = temp;
						}
					}
				}

				// Printing the array in ascending order
				System.out.print("sorted array of number: ");
				for (int i = 0; i < numbers.length; i++) {
					System.out.print(numbers[i] + " ");
				}

	}

}
