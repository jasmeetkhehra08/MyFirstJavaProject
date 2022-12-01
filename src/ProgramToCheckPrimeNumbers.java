
public class ProgramToCheckPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//check if number is prime or not

		int primeNumber = 85;
		while (primeNumber >= 2)

			if (primeNumber % 2 == 0 || primeNumber % 3 == 0) {
				System.out.println("It is not a prime number");

				break;
			}

			else {
				System.out.println("It is a prime number");
				break;
			}
	}
}
