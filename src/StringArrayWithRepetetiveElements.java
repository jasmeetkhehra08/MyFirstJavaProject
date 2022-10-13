/*create a string array with repetetive elements based on the count that how many times element is present
take input from scanner and check how many times its present*/

import java.util.Scanner;

public class StringArrayWithRepetetiveElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] nameList = { "jasmeet", "a", "b", "c", "jasmeet", "jasmeet", "d", "e", "jasmeet", "jasmeet" };
		Scanner sc = new Scanner(System.in);
		String name = "";
		System.out.println("Enter the name");
		name = sc.next();
int j = 0;
		for (int i = 0; i < nameList.length; i++)

		{
			if (nameList[i].equals(nameList.length)) {
				System.out.println(name + " is present at index " + i);
				
			}	
			j++;
			{
				
				System.out.println(j+"times");
			}
		}
	}

}
