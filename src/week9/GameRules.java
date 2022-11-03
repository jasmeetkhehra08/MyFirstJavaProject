package week9;

import java.util.Scanner;

public class GameRules {

	void guessedLetter(String name, String nameMasked) {
		Scanner sc1= new Scanner(System.in);
		int counter=0;
		nameMasked="";
		do {
		System.out.println("You are guessing:" +nameMasked);
		System.out.println("You have guessed ("+counter+ ") wrong letters");
		System.out.println("Guess a letter:");
		String letter = sc1.next();
		char[] nameToCharArray = name.toCharArray();
		
		for (int i = 0; i < nameToCharArray.length; i++) {
			if (nameToCharArray[i] == letter.charAt(0)) {
				
				nameMasked=nameMasked +letter;
				
			}	
			else {
				nameMasked=nameMasked + "_";
			}	
}
		System.out.println(nameMasked);
		if(nameMasked=="_") {counter++;
		}
	
}while(counter<6);
}
}