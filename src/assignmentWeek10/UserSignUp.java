/*•	Create a separate class for user with the separate variables and methods for user credentials like username, password, name, phone number, email address and a methods for the registration of the user and validation. The user class can be the parent of cruise and hotel class. Keep the methods that should not be accessed by its child as private.*/

package assignmentWeek10;

import java.util.Scanner;

public class UserSignUp {

	private String username = "";
	private String password = "";
	String Name = "";
	String phoneNumber = "";
	String email = "";

	Scanner sc = new Scanner(System.in);


	void signUp() {
		System.out.println("Please signup to book a service");
		this.username(username);
		this.setPassword(password);
		this.name(Name);
		this.setPhoneNumber(phoneNumber);
		this.setEmail(email);
		System.out.println("Thank you for registering!");
	}

	private void username(String enteredUsername) {
		do {
			System.out.println("Enter the username.username should be between 8-24 characters.");
			enteredUsername = sc.next();
			if (enteredUsername.length() > 7 && enteredUsername.length() > 24) {
				this.username = enteredUsername;
			}
		} while (!(enteredUsername.length() > 7 && enteredUsername.length() < 24));
	}

	private void setPassword(String enteredPassword) {
		do {
			System.out.println(
					"Enter the password that you want to use.Password length should be between 8-16 characters");
			enteredPassword = sc.next();
			if (enteredPassword.length() > 7 && enteredPassword.length() < 17) {

				this.password = enteredPassword;
			}
		} while (!(enteredPassword.length() >= 8 && enteredPassword.length() <= 16));
	}

	String name(String enteredName) {
		System.out.println("Enter your full name");
		enteredName = sc.next();
		return this.Name = enteredName;
	}

	void setPhoneNumber(String enteredPhoneNumber) {
		do {
			System.out.println("Enter your phone number");
			enteredPhoneNumber = sc.next();
			if (enteredPhoneNumber.length() == 10 && enteredPhoneNumber.contains("0")|| enteredPhoneNumber.contains("1")||enteredPhoneNumber.contains("2") || enteredPhoneNumber.contains("3")|| enteredPhoneNumber.contains("4")|| enteredPhoneNumber.contains("5")|| enteredPhoneNumber.contains("6")|| enteredPhoneNumber.contains("7")|| enteredPhoneNumber.contains("8")|| enteredPhoneNumber.contains("9")) {
				this.phoneNumber = enteredPhoneNumber;
			} else {
				System.out.println("Please enter a valid phone number");
			}
		} while (!(this.phoneNumber == enteredPhoneNumber));
	}

	private void setEmail(String enteredEmail) {
		do {
			System.out.println("Enter your email");
			enteredEmail = sc.next();
			if (enteredEmail.contains("@") && (enteredEmail.contains(".com") || enteredEmail.contains(".ca"))) {
				this.email = enteredEmail;
			} else {
				System.out.println("Please enter a valid email");
			}
		} while (!(this.email == enteredEmail));
	}
}
