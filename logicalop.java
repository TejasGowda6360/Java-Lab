package myjava;

import java.util.Scanner;

public class logicalop {

public static void main(String[] args) { 
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a value");
	int a = sc.nextInt(); 
	if(a>10||(a==10))
	{
		System.out.println("Condition satisfied");
	}else
	{
		System.out.println("Condition not met");
	}
	if(a>=10&&(a%2==0))
	{
		System.out.println("Value is Even");
	}else
	{
		System.out.println("Condition not met");
	}
	if(a!=10)
	{
		System.out.println("Condition not met");
	}
}
}
