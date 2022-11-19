package assignmentWeek11;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {
	public static ArrayList<Item> loadItems() throws IOException {
		ArrayList<Item> items = new ArrayList<Item>(); // custom Arraylist for more than 1 type of data
		Scanner sc = new Scanner(Paths.get("C:\\Users\\JK\\OneDrive\\Desktop\\phase-1.txt"),
				StandardCharsets.UTF_8.name());
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			String[] phase1 = line.split("=");
			Item item = new Item();// instantiating a class
			item.name = phase1[0];
			item.weight = Integer.valueOf(phase1[1]);
			items.add(item);
		}
		return items;
	}

	public ArrayList<Rocket> loadU1(ArrayList<Item> items) {
		ArrayList<Rocket> r1Rockets = new ArrayList<Rocket>();
		Rocket rocket = new R1();
		for (int i = 0; i < items.size(); i++) {
				if(rocket.canCarry(items.get(i))) {
				rocket.carry(items.get(i));
				items.remove(items.get(i));
			} else {
				rocket = new R1();
				r1Rockets.add(rocket);
				rocket.carry(items.get(i));
				items.remove(items.get(i));
			}
		}
		return r1Rockets;
	}

	public ArrayList<Rocket> loadU2(ArrayList<Item> items) {
		ArrayList<Rocket> r2Rockets = new ArrayList<Rocket>();
		Rocket rocket = new R2();
		for (int i = 0; i < items.size(); i++) {
				if(rocket.canCarry(items.get(i))) {
				rocket.carry(items.get(i));
			} else {
				rocket= new R2();
				r2Rockets.add(rocket);
				rocket.carry(items.get(i));
				items.remove(items.get(i));
			}
		}
		return r2Rockets;
	}

		public int runSimulation(ArrayList<Rocket> rockets) {
			int totalCost = 0;
			for (int i = 0; i < rockets.size(); i++) {
				if(rockets.get(i).launch()) {
				}
				else if(rockets.get(i).land()) {
				}
				while (!rockets.get(i).launch() || !rockets.get(i).land()) {
					totalCost += rockets.get(i).cost;
					break;
				}
			}
		
			System.out.println("Total cost of mission: " + totalCost+" million");
			return totalCost;
		}
	
	}
