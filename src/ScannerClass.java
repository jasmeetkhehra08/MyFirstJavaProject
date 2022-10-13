import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 0;
int b = 0;
int c = 0;

Scanner sc = new Scanner (System.in);

System.out.println("enter the first number");
a = sc.nextInt();

System.out.println("enter the second number");
b = sc.nextInt();

System.out.println("enter the third number");
c = sc.nextInt();

int d = a+b+c;
System.out.println("output:"+d);

		
		
	}

}
