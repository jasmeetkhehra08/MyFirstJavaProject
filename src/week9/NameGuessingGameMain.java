//how to read a file from computer-google it.
//file input string
//how to pick a random name.

package week9;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;;
public class NameGuessingGameMain {	 
	public static void main(String[] args) throws IOException {

	Scanner sc = new Scanner(Paths.get("C:\\Users\\JK\\OneDrive\\Desktop\\NameList.txt"), StandardCharsets.UTF_8.name());
	String nameList = sc.useDelimiter("\\A").next();
	Scanner scanner= new Scanner(System.in);
	 String userResponse="";
do {	
	String[] names = nameList.split("\n"); //splitting into an array of strings
	Random random = new Random();
	int nameIndex = random.nextInt(names.length);
	String name = names[nameIndex].replace("\r","");
	String nameMasked=name.replaceAll("\\w", "_");
	GameRules gameRules = new GameRules();
	gameRules.guessedLetter(name, nameMasked);
	
	System.out.println("do you want to play again:\n press y to play again or press any other key to exit");
	userResponse= scanner.next();
	if(!(userResponse.equals("y"))) {
		System.exit(0);
	}
}while(userResponse.equals("y"));
}
}