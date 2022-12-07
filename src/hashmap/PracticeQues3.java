package hashmap;

import java.util.HashMap;

public class PracticeQues3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<String, Integer> alphaNum = new HashMap<>();
        
        // Adding elements to the hashmap
        alphaNum.put("A", 1);
        alphaNum.put("B", 2);
        alphaNum.put("C", 3);
        alphaNum.put("D", 4);
        
        // Print out the contents of the hashmap
        System.out.println("Contents of the hashmap:");
        for(String i: alphaNum.keySet()){
            System.out.println(i + ": " + alphaNum.get(i));
        }
        
        // Get the value associated with the key "B"
        int value = alphaNum.get("B");
        System.out.println("The value associated with the key 'B' is " + value);
        
        // Check if the hashmap contains the key "E"
        if(alphaNum.containsKey("E")){
            System.out.println("The hashmap contains the key 'E'");
        }
        else{
            System.out.println("The hashmap does not contain the key 'E'");
        }
        
        // Remove the key "A"
        alphaNum.remove("A");
        
        // Print out the elements of the hashmap
        System.out.println("elements of the hashmap after removing the key 'A':");
        for(String i: alphaNum.keySet()){
            System.out.println(i + ": " + alphaNum.get(i));
        }
	}

}
