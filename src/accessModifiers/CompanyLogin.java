package accessModifiers;

public class CompanyLogin {

	private String username;
	private String passcode;
	private String clockIn;

	public CompanyLogin(String username, String passcode) {
		this.username = username;
		this.passcode = passcode;
	}

	public String getclockIn() {
		return clockIn;
	}

	 void setclockIn(String username, String Passcode) {
		if (this.username.equals(username)&& this.passcode.equals(Passcode)) {
			System.out.println("click on clock-in");}
			else {System.out.println("username/passcode incorrect \n do you want to rest username/password?\n Y/N");
		}
		
	}

	 
	void setUsername(String currentUsername, String newUsername) {
		
		if (this.username == currentUsername) {
			this.username = newUsername;
		} else {
			System.out.println("username does not match");
		}
	}

	void setPassword(String currentPassword, String newPassword) {
		if (this.passcode == currentPassword) {
			this.passcode = newPassword;
		} else {
			System.out.println("current password does not match.enter the current password");
		}

	}

}
