package learnComposition;

public class Employee {

	private String employeeName;
	private String employeeId;
	private String designation;

	public Employee(String employeeName, String employeeId, String designation) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.designation = designation;

		
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public String getDesignation() {
		return designation;
	}
}
