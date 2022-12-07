//write a program to find out smallest element in arraylist.
package InterviewQues;

import java.util.ArrayList;

public class Ques1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers= new ArrayList<Integer>();
		
		 numbers.add(100);
		 numbers.add(20);
		 numbers.add(30);
		 Integer smallest= numbers.get(0); 
		 
		for(int i = 0; i<numbers.size(); i++) {
			if(numbers.get(i)<smallest) {
				smallest=numbers.get(i);
			}	
		}
		System.out.println(smallest);
	}
}
