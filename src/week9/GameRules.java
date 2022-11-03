package week9;

import java.util.Scanner;

public class GameRules {

	void guessedLetter(String name, String nameMasked) {
		Scanner sc1= new Scanner(System.in);
		int counter=0;
		name=name.toLowerCase();
		nameMasked="";
		int guessCount=0;
		do {
		System.out.println("You are guessing:" +nameMasked);
		System.out.println("You have guessed ("+counter+ ") wrong letters");
		System.out.println("Guess a letter:");
		String letter = sc1.next();
		char[] nameToCharArray = name.toCharArray();
		//char[] nameMaskedToCharArray= nameMasked.toCharArray();
		int letterIndex= name.indexOf(letter.toLowerCase());
		if(letterIndex==-1) {
			counter++;
			if(counter==5)
				System.out.println("Game Over");
		}
		
	 if(guessCount>0) {
			for ( int i = 0; i < nameToCharArray.length; i++) {
				if (nameToCharArray[i] == letter.charAt(0)) {
		
				nameMasked=nameMasked.substring(0, letterIndex) +letter;
					guessCount++;
					}}}
			else {
		for ( int i = 0; i < nameToCharArray.length; i++) {
			if (nameToCharArray[i] == letter.charAt(0)) {
				
				nameMasked=nameMasked +letter;
				guessCount++;
			}	
			
			else {
				nameMasked=nameMasked+ "_";
			}	
}}	
	 
		}while(counter<6);
		
}
}