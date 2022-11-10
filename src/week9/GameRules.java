package week9;

import java.util.Scanner;

public class GameRules {
	Scanner sc1 = new Scanner(System.in);

	void guessedLetter(String name, String nameMasked) {

		int counter = 0;
		name = name.toLowerCase();
		String wrongLetters = "";
		do {
			System.out.println("You are guessing:" + nameMasked);

			System.out.println("You have guessed (" + counter + ") wrong letters: " + wrongLetters.replace("", " "));
			if (counter == 5) {
				System.out.println("You have lost! \n Game Over");
				System.exit(0);
			}
			System.out.println("Guess a letter:");
			String letter = sc1.next();
			char[] nameToCharArray = name.toCharArray();
			int letterIndex = name.indexOf(letter.toLowerCase());
			if (letterIndex == -1) {

				counter++;
				if (counter > 0)
					wrongLetters += letter;
			}

			for (int i = 0; i < nameToCharArray.length; i++) {
				if (nameToCharArray[i] == letter.charAt(0)) {

					nameMasked = nameMasked.substring(0, i) + letter + nameMasked.substring(i + 1);

					if (name.equals(nameMasked)) {
						System.out.println("congratulations you have guessed the name: " + name);
						break;
					}
				}
			}
		} while (!(counter == 5 || name.equals(nameMasked)));
	}
}
