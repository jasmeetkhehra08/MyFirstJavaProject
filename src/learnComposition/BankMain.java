package learnComposition;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
		Bank bank=new Bank();
		
		Employee employee1= new Employee("jasmeet", "11111", "Bank clerk");
		Employee employee2= new Employee("parul", "11112", "Bank clerk");
		Employee employee3= new Employee("harinder", "11113", "Bankruptcy specialist");
		Employee employee4= new Employee("lekshmi", "11114", "Personal banking manager");
		Employee employee5= new Employee("neethu", "11115", "Associate broker");
		Employee employee6= new Employee("rajbir", "11116", "Senior banker");
		Employee employee7= new Employee("daman", "11117", "Personal banking manager");
		Employee employee8= new Employee("sahib", "11118", "Financial Risk Manager");
		Employee employee9= new Employee("aman", "11119", "financial advisor");
		Employee employee10= new Employee("sanil", "11110", "bank manager");
		
		bank.addEmployees(employee1);
		bank.addEmployees(employee2);
		bank.addEmployees(employee3);
		bank.addEmployees(employee4);
		bank.addEmployees(employee5);
		bank.addEmployees(employee6);
		bank.addEmployees(employee7);
		bank.addEmployees(employee8);
		bank.addEmployees(employee9);
		bank.addEmployees(employee10);
		
		System.out.println("enter employee name");
		String enteredName= sc.nextLine();
		
		bank.isEmployeePresent(enteredName);
		
		
}
}
