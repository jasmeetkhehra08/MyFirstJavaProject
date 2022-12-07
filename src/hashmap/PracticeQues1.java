package hashmap;

import java.util.HashMap;

public class PracticeQues1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> students = new HashMap<Integer, String>();
		students.put(1, "jasmeet");
		students.put(2, "parul");
		students.put(3, "rajbir");

//accessing a value
		System.out.println(students.get(2));

//iterating over the HashMap with for-each loop
		for (Integer i : students.keySet()) {
			System.out.println("key : " + i + " value : " + students.get(i));
		}

//remove a value
		students.remove(2);
		System.out.println(students.get(2));

	}

}
