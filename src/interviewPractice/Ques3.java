//3 : Write a program to find the maximum number in an array.
package interviewPractice;

public class Ques3 {

	public static void main(String[] args) {
		
	        int[] array = {16, 45, 26, 6, 90};
	        int max = array[0];
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] > max) {
	                max = array[i];
	            }
	        }
	        System.out.println("The maximum number is: " + max);
	    }
}
