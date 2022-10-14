package assignmentsWeek6;

import java.util.Scanner;

public class MainClassCrsScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CrsScore crsScore = new CrsScore(); //instance of a class
		System.out.println("Enter your Education Level: PhD/ Masters Degree/ Two or more university degrees/diplomas at the bachelor’s level one of which is a three year or longer duration / 12th+ Three Years or longer Degree /Diploma");
		int educationLevel = sc.nextInt();
		
		System.out.println("Enter your Experience in years");
		int experience = sc.nextInt();
		
		System.out.println("Enter your age in years");
		int age = sc.nextInt();
		
		System.out.println("Enter your IELTS Score for Listening");
		double listeningScore = sc.nextDouble();
		
		System.out.println("");
		
		int Score = crsScore.educationLevel(educationLevel);
		
		
	}

}
