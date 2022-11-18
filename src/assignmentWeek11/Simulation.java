package assignmentWeek11;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {
	public static ArrayList<Item> loadItems(String phase1) throws IOException  {
		ArrayList<Item> itemsList =new ArrayList<Item>(); // custom Arraylist for more than 1 type of data
		Scanner sc = new Scanner(Paths.get("C:\\Users\\JK\\OneDrive\\Desktop\\phase-1.txt"), StandardCharsets.UTF_8.name());
		 phase1 = sc.useDelimiter("\\A").next();
		String[]items=phase1.replace("\r", "").split("\n"); //splitting into an array of strings
		Item item= new Item(); //instantiating a class
		for(int i=0;i<items.length;i++) {
			String[] divideInParts=items[i].split("=");
			item.name=divideInParts[0];
			item.weight=Integer.valueOf(divideInParts[1]);
			
			itemsList.add(item);
			}
		return itemsList;
	}	
		  public ArrayList<Rocket> loadU1(ArrayList<Item> items) {
		ArrayList<Rocket> U1=new ArrayList<Rocket>(); 
		int weight=10000;
		int maxWeight=18000;
		int cost=100;
	     R1 r1=new R1();
	      for(int i=0;i<items.size();i++) {
	    	if(weight<=maxWeight) {
	    		weight+=items.get(i).weight;
	    	}else {
	    		U1.add(r1);
	    		weight=items.get(i).weight;
	    	}
	      }
	      return U1;
			}
       
public ArrayList<Rocket> loadU2(ArrayList<Item> items) {
	ArrayList<Rocket> U2=new ArrayList<Rocket>(); 
  int weight=0;
  R2 r2=new R2();
  for(int i=0;i<items.size();i++) {
	if(weight<=18000) {
		weight+=items.get(i).weight;
		
	}else {
		U2.add(r2);
		weight=items.get(i).weight;
	}
  }
  return U2;
	}

}