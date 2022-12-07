/**Create a program that will store user data in a hashmap using their name as the key. 
The program should prompt the user for their name, and for each piece of data about them (e.g. age, phone number). 
Once all the data has been collected, the program should print out the data in a nicely formatted way.
*/
package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class PracticeQues2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String,String> info=new HashMap<String,String>();
		System.out.println("enter your name");
		String name = sc.next();
		System.out.println("enter your age");
		String age = sc.next();
		System.out.println("phone number");
		String phoneNumber = sc.next();
		
		info.put("Name", name);
		info.put("Number", phoneNumber);
		info.put("Age", age);
		for(String i: info.keySet()) {
		System.out.println(i + " : " +info.get(i));
		
		
	}
	}
}
