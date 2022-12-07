package interviewPractice;

import java.util.Scanner;

public class Ques15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String str=sc.next();
		
		String revStr="";
		for(int i=0; i<str.length(); i++) {
			revStr=str.charAt(i)+revStr;
		}
		System.out.println("Reverse String :" +revStr);
	}

}
