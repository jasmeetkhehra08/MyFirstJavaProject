//3 : Write a program to find the maximum number in an array.
package interviewPractice;

public class MaxNoInArray {

	public static void main(String[] args) {
		
	        int[] array = {1, 4, 2, 6, 9, 3, 8, 5};
	        int max = array[0];
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] > max) {
	                max = array[i];
	            }
	        }
	        System.out.println("The maximum number is: " + max);
	    }
}
