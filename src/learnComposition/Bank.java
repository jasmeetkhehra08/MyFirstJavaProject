package learnComposition;

public class Bank {

	
	String bankName;
	Employee[] employee = new Employee[10];
	
	
	public void addEmployees(Employee employee) {
		for (int i = 0; i < this.employee.length; i++) {
			if (this.employee[i] == null) {
				this.employee[i] = employee;
				break;
			}
}
}
	public boolean isEmployeePresent(String enteredName) {
		boolean isEmployeePresent=false;
		for (int i=0; i<employee.length;i++) {
			if(employee[i].getEmployeeName().equalsIgnoreCase(enteredName)) {
				System.out.println("employee is present");
			System.out.println(employee[i].getEmployeeId());
			System.out.println(employee[i].getDesignation());
				isEmployeePresent=true;
			}
			}
		if (!isEmployeePresent) {
			System.out.println("employee is not in the list");
		}
		return isEmployeePresent;
	}
}