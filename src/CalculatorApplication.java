import java.util.Scanner;

public class CalculatorApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Double num1, n5um2, output;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the First Operand : ");
		double num1 = sc.nextDouble();

		System.out.println("Enter the Operator (+,-,*,/) : ");
		char operator = sc.next().charAt(0);

		System.out.println("Enter the Second Operand : ");
		double num2 = sc.nextDouble();
		double output = 0;

		switch (operator) {
		case '+':
			output = num1 + num2; {
			System.out.println(num1 + " + " + num2 + " = " + output);
			break;
		}
		case '-':
			output = num1 - num2; {
			System.out.println(num1 + " - " + num2 + " = " + output);
			break;
		}

		case '*':
			output = num1 * num2; {
			System.out.println(num1 + " * " + num2 + " = " + output);
			break;
		}

		case '/':
			output = num1 / num2; {
			System.out.println(num1 + " / " + num2 + " = " + output);
			break;
		}

		default:
			System.out.println("You have entered wrong operator");
			break;

		}
	}
}
