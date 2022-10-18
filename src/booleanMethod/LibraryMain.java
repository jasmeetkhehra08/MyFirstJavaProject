package booleanMethod;

import java.util.Scanner;

public class LibraryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookDetails romeoAndJuliet = new BookDetails("Romeo and Juliet", "Shakespere");
		BookDetails peaceOfMind = new BookDetails("Peace of Mind", "Allen");
		BookDetails homeBody = new BookDetails("Home Body", "Rupi Kaur");
		BookDetails twoStates = new BookDetails("Two States", "Chetan Bhagat");
		BookDetails halfGirlfriend = new BookDetails("Half Girlfriend", "Chetan Bhagat");
		BookDetails oliverTwist = new BookDetails("Oliver Twist", "Charles Dickens");
		BookDetails macbeth = new BookDetails("Macbeth", "Shakespere");
		BookDetails harrypotter1 = new BookDetails("Harry Potter and the Sorcere's Stone", "J K Rowling");
		BookDetails malgudyDays = new BookDetails("Malgudy Days", "R K Narayan");
		BookDetails alchemist = new BookDetails("Alchemist", "Paulo Coehlo");

		// Array of Objects
		BookDetails[] bookDetails = { romeoAndJuliet, peaceOfMind, homeBody, twoStates, halfGirlfriend, oliverTwist,
				macbeth, harrypotter1, malgudyDays, alchemist };
		Scanner sc = new Scanner(System.in);
		int bookCount = 0;
		String bookIssued = null;
		do {
			System.out.println("Which book you want to be issued");
			String requiredBookName = sc.nextLine();
			System.out.println("Who is the author");
			String bookAuthor = sc.nextLine();

			// iterating over the array

			for (int i = 0; i < bookDetails.length; i++ ){
			
				if (requiredBookName.equals(bookDetails[i].bookName) && bookAuthor.equals(bookDetails[i].authorName)
						&& !bookDetails[i].isBookIssued ) {
					bookDetails[i].isBookIssued = false;
					
					System.out.println(bookDetails[i].bookName+ " is issued");
					bookIssued = bookDetails[i].bookName;
					bookCount++;
					break;
					}
				
				else if
					(requiredBookName.equals(bookIssued)) 
				 {
					System.out.println("This book is already issued");
					break;
				}
				else			
			{System.out.println("book is not available");}
				break;
			}
			
			

		} while (bookCount < 3);
	}
	
}
