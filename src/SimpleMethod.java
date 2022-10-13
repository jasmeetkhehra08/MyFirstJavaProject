
public class SimpleMethod {

	int a = 10;
	int b = 10;
	int c = 2;

	//created methods with return type void
	void addThreeNumbers() {
		//adding values and storing the values to variable total
		int total = a + b + c;
		System.out.println("sum of three numbers: " + total);
	}

	void subtractThreeNumbers() {
		int total = a - b - c;
		System.out.println("subtraction of three numbers: " + total);
	}

	void multiplyThreeNumbers() {
		int total = a * b * c;
		System.out.println("multiplication of three numbers: " + total);
	}
}
