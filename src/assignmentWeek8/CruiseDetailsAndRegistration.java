package assignmentWeek8;

import java.util.Scanner;

public class CruiseDetailsAndRegistration {

	private String username;
	private String password;
	private String fullName;
	private String phoneNumber;
	Scanner sc = new Scanner(System.in);

	public CruiseDetailsAndRegistration(String username, String password, String fullname, String phoneNumber) {
		this.username = username;
		this.password = password;
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
	}

	void setUsername(String enteredUsername) {
		do {System.out.println("Enter your username.username should be between 8-24 characters.");
			enteredUsername = sc.next();
			if (username.length() > 7 && username.length() < 25) {
				this.username = enteredUsername;
		}
		}
		while (!(enteredUsername.length() > 7 && enteredUsername.length() < 25));
	}

	void setPassword(String enteredPassword) {
do {
	System.out.println("Enter the password that you want to use.Password length should be between 8-16 characters");
	enteredPassword = sc.next();
		if (enteredPassword.length() > 7 && enteredPassword.length() < 17) {
//			if (enteredPassword.matches("@") || enteredPassword.matches("#") || enteredPassword.matches("!")
//					|| enteredPassword.matches("$") || enteredPassword.matches("%") || enteredPassword.matches("^")
//					|| enteredPassword.matches("&") || enteredPassword.matches("|")) {
			this.password = enteredPassword;
		} 
		}
	while (!(enteredPassword.length() >= 8 && enteredPassword.length() <= 16));
	}

	public String getPassword() {
		return password;
	}

	void setPhoneNumber(String enteredPhoneNumber) {
		do {
			System.out.println("Enter your phone number");
			enteredPhoneNumber = sc.next();
		if (enteredPhoneNumber.length() == 10) {
			this.phoneNumber = enteredPhoneNumber;
		} else {
			System.out.println("Please enter a valid phone number");
		}
		} while (!(enteredPhoneNumber.length() == 10));
	}

	void signUp(String userInput) {
		if (!(userInput.equalsIgnoreCase("Y"))) {
			System.out.println("Please start over to sign up");
			System.exit(0);
		}
	}

	void userResponse(String infoChange) {
		if (infoChange.equalsIgnoreCase("Y")) {
			System.out.println("Please enter the information you want to change.\r\n" + "1.	Password\r\n"
					+ "2.	Phone number\r\n" + "3.	username\r\n" + "");
		} else {
			System.out.println("Thank you for using the service!");
			System.exit(0);
		}

	}

	void updatePassword(String currentPassword, String newPassword) {
		do {
			System.out.println("Enter your existing password ");
			currentPassword = sc.next();
			if (this.password.equalsIgnoreCase(currentPassword)) {
				System.out.println("Enter your new password");
				newPassword = sc.next();
				this.password = newPassword;
				System.out.println("Your password has been changed!");
			} else {
				System.out.println("current password does not match.enter the current password");
			}
		} while (!(this.password.equalsIgnoreCase(newPassword)));
	}

	void updateUsername(String currentUsername, String newUsername) {
		do {
			System.out.println("Enter your existing username ");
			currentUsername = sc.next();
			if (this.username.equalsIgnoreCase(currentUsername)) {
				System.out.println("Enter your new username");
				newUsername = sc.next();
				this.username = newUsername;
				System.out.println("Your username has been changed!");
			} else {
				System.out.println("username does not match");
			}
		} while (!(this.username.equalsIgnoreCase(newUsername)));
	}
 
	void updatePhoneNumber(String currentPhoneNumber, String newPhoneNumber) {
		do {
			System.out.println("Enter your existing phone number ");
			currentPhoneNumber = sc.next();
			if (this.phoneNumber.equalsIgnoreCase(currentPhoneNumber)) {
				System.out.println("Enter your new phone number");
				newPhoneNumber = sc.next();
				this.phoneNumber = newPhoneNumber;
				System.out.println("Your phone number has been changed!");
			} else {
				System.out.println("phone number does not match");
			}
		} while (!(this.phoneNumber.equalsIgnoreCase(newPhoneNumber)));
	}
	}

