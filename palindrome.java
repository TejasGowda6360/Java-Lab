package advt;

import java.util.Scanner;
public class palindrome
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int r,s=0,p,n;
		Scanner sc = new Scanner(System.in);//Scanner class
		System.out.println("Enter the number");
		n = sc.nextInt(); 
		sc.close();//Scanner class is closed
		p=n;
		while(n>0)//While Condition
		{
			r=n%10;
			s=(s*10)+r;
			n=n/10;
		}
		if(p==s)
			System.out.println(p+" is a palindrome");
		else
			System.out.println(p+" is not a palindrome");
	}

}
