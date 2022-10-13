package assignmentsWeek6;

import java.util.Scanner;

public class MainClassCrsScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CrsScore crsScore = new CrsScore();
		System.out.println("Enter your Education Level: PhD/ Master’s Degree/ Two or more university degrees/diplomas at the bachelor’s level one of which is a three year or longer duration / 12th+ Three Years or longer Degree /Diploma");
		int educationLevel = sc.nextInt();
		crsScore.main(educationLevel);
	}

}
