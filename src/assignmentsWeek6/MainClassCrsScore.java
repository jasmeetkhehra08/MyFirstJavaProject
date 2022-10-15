package assignmentsWeek6;

import java.util.Scanner;

public class MainClassCrsScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CrsScore crsScore = new CrsScore(); // instance of a class
		System.out.println(
				"Enter your Education Level: \n Press 1 : PhD\n Press 2: Masters Degree\n Press 3: Two or more university degrees/diplomas at the bachelor’s level one of which is a three year or longer duration \n Press 4: 12th+ Three Years or longer Degree /Diploma");
		String educationLevel = sc.next();
		while (!(educationLevel.equals("1") || educationLevel.equals("2") || educationLevel.equals("3")
				|| educationLevel.equals("4"))) {
			System.out.println("invalid input:choose from the given options only");
			educationLevel = sc.next();
		}
		int eduLevel = crsScore.educationLevelPoints(educationLevel);// invoking a method for education level

		System.out.println("Enter your Experience in years");
		int experienceInYears = sc.nextInt();

		int yearsOfExperience = crsScore.experiencePoints(experienceInYears);// invoking a method for years of
																				// experience

		System.out.println("Enter your age in years");
		int age = sc.nextInt();
		int agePoints = crsScore.agePoints(age);

		System.out.println("Enter your IELTS Score for Listening");
		double listeningScore = sc.nextDouble();
		int listeningPoints = crsScore.listeningPoints(listeningScore);

		System.out.println("Enter your IELTS Score for Speaking");
		double speakingScore = sc.nextDouble();
		int speakingPoints = crsScore.speakingPoints(speakingScore);

		System.out.println("Enter your IELTS Score for Reading");
		double readingScore = sc.nextDouble();
		int readingPoints = crsScore.readingPoints(readingScore);

		System.out.println("Enter your IELTS Score for Writing");
		double writingScore = sc.nextDouble();
		int writingPoints = crsScore.writingPoints(writingScore);

		System.out.println(
				"If you have a relative  in Canada(Parents, Grand Parents, Brother, Sister, Aunt, Uncle, Nephew or Niece) who is a Canadian Citizen or PR holder (Y/N)");
		char relativeInCanada = sc.next().charAt(0);
		int relativesInCanadaPoints = crsScore.relativesInCanadaPoints(relativeInCanada);

		System.out.println("Have you studied in Canada for atleast 2 years (Y/N)");
		char studyInCanada = sc.next().charAt(0);
		int studyInCanadaPoints = crsScore.studyInCanadaPoints(studyInCanada);

		System.out.println("Have you studied in Canada for atleast 2 years at NOC 0, A, B (Y/N)");
		char studyNocInCanada = sc.next().charAt(0);
		int workInCanadaPoints = crsScore.workInCanadaPoints(studyNocInCanada);

		int totalPoints = (eduLevel + yearsOfExperience + agePoints + listeningPoints + speakingPoints + readingPoints
				+ writingPoints + relativesInCanadaPoints + studyInCanadaPoints + workInCanadaPoints);
		{
			System.out.println("Total Points you have scored: " + totalPoints);
		}

		int Eligibility = crsScore.requiredPoints(totalPoints);
	}

}
