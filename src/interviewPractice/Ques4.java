//4 : Write a program to print the numbers in an array in descending order.
package interviewPractice;

public class Ques4 {

	public static void main(String[] args) {
		int[] numbers = { 100, 13, 25, 180, 34, 70 };

		// Sorting the array in descending order
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] < numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}

		// Printing the array in descending order
		System.out.print("Array in Descending Order: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
}
