package myjava;
import java.util.Scanner;

public class arithmeticop {
 
	public static void main(String[] args) {
		int var;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int a = sc.nextInt(); 
		System.out.println("Enter the 2nd number");
		int b = sc.nextInt(); 
		System.out.println("-> Arithmetic Operators");
		System.out.println("Addition of 10 + 5 is " +(a+b));
		System.out.println("Subtration of 10 - 5 is " +(a-b));
		System.out.println("Multiplication of 10 * 5 is "+(a*b));
		System.out.println("Division of 10 / 5 is " +(a/b));
		System.out.println("Modulus of 10 % 5 is " +(a%b));
}
}
