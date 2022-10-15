package assignmentsWeek6;

import java.util.Scanner;

public class CrsScore {
//method 1- for education level
	int educationLevelPoints(String educationLevel) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int educationLevelPoints = 0;
		int phD = 25;
		int mastersDegree = 23;
		int twoOrMoreUniversityDegreesOrDiplomasAtTheBachelorsLevelOneOfWhichIsAThreeYearOrLongerDuration = 22;
		int twelvethAndThreeYearsOrLongerDegreeOrDiploma = 21;

		switch (educationLevel) {
		case "1":
			System.out.println("PhD");
			educationLevelPoints = 25;
			break;
		case "2":
			System.out.println("Master’s Degree");
			educationLevelPoints = 23;
			break;
		case "3":
			System.out.println(
					"Two or more university degrees/diplomas at the bachelor’s level one of which is a three year or longer duration ");
			educationLevelPoints = 22;
			break;
		case "4":
			System.out.println("12th+ Three Years or longer Degree /Diploma");
			educationLevelPoints = 21;
			break;
		default: {
			System.out.println("invalid input:choose from the following options only");
		}
		}
		return educationLevelPoints;
	}

	// 2nd method: experience in years
	int experiencePoints(int experienceInYears) {
		int experiencePoints = 0;
		if (experienceInYears <= 3) {
			experiencePoints = 0;
		} else if (experienceInYears == 4 || experienceInYears == 5) {
			experiencePoints = 13;
		} else if (experienceInYears >= 6) {
			experiencePoints = 15;}
		else {
			System.out.println("invalid input");}

		return experiencePoints;
	}

//	/// 3rd method for age points
	int agePoints(int age) {
		int agePoints = 0;
		int maxAgeForPoints = 47;
		int minAgeForPoints = 35;
		if (age > 17 && age < 35) {
			agePoints = 12;
		} else {
			switch (age) {
			case 36: {
				agePoints = 11;
				break;
			}
			case 37: {
				agePoints = 10;
				break;
			}
			case 38: {
				agePoints = 9;
				break;
			}
			case 39: {
				agePoints = 8;
				break;
			}
			case 40: {
				agePoints = 7;
				break;
			}
			case 41: {
				agePoints = 6;
				break;
			}
			case 42: {
				agePoints = 5;
				break;
			}
			case 43: {
				agePoints = 4;
				break;
			}
			case 44: {
				agePoints = 3;
				break;
			}
			case 45: {
				agePoints = 2;
				break;
			}
			case 46: {
				agePoints = 1;
				break;
			}
			case 47: {
				agePoints = 0;
				break;
			}
			default: {
				System.out.println("invalid input: select from available age range only");
				break;
			}
			}
		}
		return agePoints;
	}

	/// method 4 for listening Points
	int listeningPoints(double listeningScore) {
		int listeningPoints = 0;

		if (listeningScore <= 7) {
			listeningPoints = 0;
		} else if (listeningScore == 7.5) {
			listeningPoints = 5;
		} else if (listeningScore >= 8) {
			listeningPoints = 6;
		} else {
			System.out.println("Invalid Input");
		}

		return listeningPoints;

	}

	/// method 5 for speaking Points
	int speakingPoints(double speakingScore) {
		int speakingPoints = 0;

		if (speakingScore <= 6) {
			speakingPoints = 0;
		} else if (speakingScore == 6.5) {
			speakingPoints = 5;
		} else if (speakingScore >= 7) {
			speakingPoints = 6;
		} else {
			System.out.println("Invalid Input");
		}

		return speakingPoints;
	}

//method 6 for reading points
	int readingPoints(double readingScore) {
		int readingPoints = 0;

		if (readingScore <= 6) {
			readingPoints = 0;
		} else if (readingScore == 6.5) {
			readingPoints = 5;
		} else if (readingScore >= 7) {
			readingPoints = 6;
		} else {
			System.out.println("Invalid Input");
		}

		return readingPoints;
	}

	// method 7 for writing points
	int writingPoints(double writingScore) {
		int writingPoints = 0;

		if (writingScore <= 6) {
			writingPoints = 0;
		} else if (writingScore == 6.5) {
			writingPoints = 5;
		} else if (writingScore >= 7) {
			writingPoints = 6;
		} else {
			System.out.println("Invalid Input");
		}

		return writingPoints;
	}

	// method 8 for adaptability points
	int relativesInCanadaPoints(char relativesInCanada) {
		int relativesInCanadaPoints = 0;
		switch (relativesInCanada) {
		case 'Y': {
			relativesInCanadaPoints = 5;
			break;
		}
		case 'N': {
			relativesInCanadaPoints = 0;
			break;
		}
		default: {
			System.out.println("invalid input");
			break;
		}

		}
		return relativesInCanadaPoints;

	}

	// method 9 for adaptability points

	int studyInCanadaPoints(char StudyInFor2YearsCanada) {
		int studyInCanadaPoints = 0;
		switch (StudyInFor2YearsCanada) {
		case 'Y': {
			studyInCanadaPoints = 5;
			break;
		}
		case 'N': {
			studyInCanadaPoints = 0;
			break;
		}
		default: {
			System.out.println("invalid input");
			break;
		}
		}
		return studyInCanadaPoints;

	}
//// method 10 for adaptability points
	
	int workInCanadaPoints(char workExperience1YearAtNocCanada) {
		int workInCanadaPoints = 0;
		switch (workExperience1YearAtNocCanada) {
		case 'Y': {
			workInCanadaPoints = 10;
			break;
		}
		case 'N': {
			workInCanadaPoints = 0;
			break;
		}
		default: {
			System.out.println("invalid input");
			break;
		}
		}
		return workInCanadaPoints;

	}
	int requiredPoints(int TotalPoints){
		int requiredPoints = 67;
		if(TotalPoints>=requiredPoints) {
			System.out.println("You qualify to submit an Expression of Interest (EOI) to Immigration Canada");
		}
		else {
			System.out.println("You does not qualify to submit an Expression of Interest (EOI) to Immigration Canada");
		}
		return requiredPoints;
	}
}

