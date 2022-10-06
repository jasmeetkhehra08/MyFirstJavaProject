
public class PizzaShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		c.	For additional pepperoni topping: Pepperoni for Small Pizza: +$2, Pepperoni for Medium or Large Pizza: +$3
//		d.	Extra cheese for any size pizza: + $1
	//	For eg: If the Pizza is medium, pepperoni with extra cheese the program should calculate the final bill as 20+3+1 = $24 and print as
	//	“Your final bill is $24”
		
String pizzaSize = "10";
		int smallCheesePizza = 15;
		int mediumCheesePizza = 20;
		int largeCheesePizza = 25;
		int pepperoniOnSmallPizza = 2;
		int pepperoniOnMediumPizza = 3;
		int pepperoniOnLargePizza = 3;
		int extraCheese = 1;
		switch(pizzaSize ) 
		{
		case "1" :
			{ System.out.println("Total bill will be :" + "$"+ smallCheesePizza);
			break;}
			
		case "2":
			{ System.out.println("Total bill will be :" + "$"+mediumCheesePizza);
			break;}
		case "3":
			{ System.out.println("Total bill will be :" + "$"+largeCheesePizza);
			break;}
		case "4":
			pepperoniOnSmallPizza = smallCheesePizza+pepperoniOnSmallPizza;
			{ System.out.println("Total bill will be :" + "$"+pepperoniOnSmallPizza );
			break; }
		case "5":
			pepperoniOnMediumPizza = (mediumCheesePizza+ pepperoniOnMediumPizza);
			{ System.out.println("Total bill will be :" +"$"+ (pepperoniOnMediumPizza));
			break; }
		case "6":
			pepperoniOnLargePizza = largeCheesePizza+pepperoniOnLargePizza;
			{ System.out.println("Total bill will be :" +"$"+ (pepperoniOnLargePizza));
			break; }
		case "7":
			extraCheese=smallCheesePizza+pepperoniOnSmallPizza +extraCheese;
			{ System.out.println("Total bill will be :" +"$"+ (extraCheese));
			break;}
		case "8":
			extraCheese=mediumCheesePizza+pepperoniOnMediumPizza +extraCheese;
			{ System.out.println("Total bill will be :" +"$"+ (extraCheese));
			break;}
		case "9":
			extraCheese=largeCheesePizza+pepperoniOnLargePizza +extraCheese;
			{ System.out.println("Total bill will be :" +"$"+ (extraCheese));
			break; }
		case "10":
			extraCheese=smallCheesePizza +extraCheese;
			{ System.out.println("Total bill will be :" +"$"+ (extraCheese));
			break; }
		case "11":
			extraCheese=mediumCheesePizza +extraCheese;
			{ System.out.println("Total bill will be :" +"$"+ (extraCheese));
			break; }
		case "12":
			extraCheese=largeCheesePizza +extraCheese;
			{ System.out.println("Total bill will be :" +"$"+ (extraCheese));
			break; }
			
			default:
			System.out.println("Item is not in the menu");
			break;
		
		}
		
	}

}
