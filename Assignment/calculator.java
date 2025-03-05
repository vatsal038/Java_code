package Assignment;
import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		Scanner cal = new Scanner(System.in);
		System.out.print("Enter two numbers : ");
		int a = cal.nextInt();
		int b = cal.nextInt();
		
		System.out.println("Add" + (a+b));
		System.out.println("Subtract" + (a-b));
		System.out.println("Multiplication" + (a*b));
		System.out.println("Division" + (a/b));
		
		cal.close();
	
	}

}
 