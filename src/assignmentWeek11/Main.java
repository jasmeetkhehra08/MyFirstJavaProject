package assignmentWeek11;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		Simulation simulation = new Simulation();
		ArrayList<Item> items = new ArrayList<Item>();
		items = Simulation.loadItems();
		
		System.out.println("---------------------");
		System.out.println("U1 Rocket Simulation");
		System.out.println("---------------------");
		simulation.runSimulation(simulation.loadU1(items));
		System.out.println("---------------------");
		System.out.println("U2 Rocket Simulation");
		System.out.println("---------------------");
		simulation.runSimulation(simulation.loadU2(items));
	}
}


		
		
	


