package assignmentWeek11;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {
	public static ArrayList<Item> items(String phase1) throws IOException {
		ArrayList<Item> items = new ArrayList<Item>(); // custom Arraylist for more than 1 type of data
		Scanner sc = new Scanner(Paths.get("C:\\Users\\JK\\OneDrive\\Desktop\\phase-1.txt"),
				StandardCharsets.UTF_8.name());
		phase1 = sc.useDelimiter("\\A").next();
		String[] phase1Items = phase1.replace("\r", "").split("\n"); // splitting into an array of strings
		Item item = new Item(); // instantiating a class
		for (int i = 0; i < phase1Items.length; i++) {
			String[] divideInParts = phase1Items[i].split("=");
			item.name = divideInParts[0];
			item.weight = Integer.valueOf(divideInParts[1]);
			items.add(item);
		}
		return items;
	}

	public ArrayList<Rocket> loadU1(ArrayList<Item> items) {
		ArrayList<Rocket> U1 = new ArrayList<Rocket>();
		Rocket rocket = new R1();
		for (int i = 0; i < items.size(); i++) {
			if (rocket.weight <= rocket.maxWeight) {
				rocket.weight += items.get(i).weight;
				rocket.carry(items.get(i));
			} else {
				U1.add(rocket);
				rocket.weight = items.get(i).weight;
				rocket.carry(items.get(i));
			}
		}
		return U1;
	}

	public ArrayList<Rocket> loadU2(ArrayList<Item> items) {
		ArrayList<Rocket> U2 = new ArrayList<Rocket>();
		Rocket rocket = new R2();
		for (int i = 0; i < items.size(); i++) {
			if (rocket.weight <= rocket.maxWeight) {
				rocket.weight += items.get(i).weight;
				rocket.carry(items.get(i));
			} else {
				U2.add(rocket);
				rocket.weight = items.get(i).weight;
				rocket.carry(items.get(i));
			}
		}
		return U2;
	}

}