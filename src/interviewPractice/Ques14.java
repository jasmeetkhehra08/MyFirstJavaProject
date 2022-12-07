//Write a program to write Rock, Paper, Scissors game in java.
package interviewPractice;

import java.util.Scanner;

public class Ques14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("What is your choice? (Rock, Paper, Scissors): ");
        
        // Get user input
        String userChoice = sc.nextLine().toLowerCase();
        System.out.println("You chose: " + userChoice);
        
        // Get computer choice
        int computerChoice = (int) (Math.random() * 3);
        String computerString = "";
        if (computerChoice == 0) {
            computerString = "rock";
        } else if (computerChoice == 1) {
            computerString = "paper";
        } else {
            computerString = "scissors";
        }
        System.out.println("Computer chose: " + computerString);
        
        // Compare choices and print out the result
        if (userChoice.equals(computerString)) {
            System.out.println("It's a tie!");
        } else if (userChoice.equals("rock")) {
            if (computerString.equals("paper")) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("You win!");
            }
        } else if (userChoice.equals("paper")) {
            if (computerString.equals("scissors")) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("You win!");
            }
        } else if (userChoice.equals("scissors")) {
            if (computerString.equals("rock")) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("You win!");
            }
        } else {
            System.out.println("Invalid input!");
        }
    }
	}
