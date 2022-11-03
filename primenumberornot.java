package advt;
import java.util.*;
public class primenumberornot
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int i,m=0,f=0,n;
		Scanner s = new Scanner(System.in);//Scanner class
		System.out.println("Enter the number");
		n = s.nextInt(); 
		s.close();
		m=n/2;
		if((n==0)||(n==1))//If condition is used
		{
			System.out.print(n+" is not a prime Number");
		}
		else
		{
			for(i=2;i<=m;i++)
			{
				if(n%i==0)
				{
					System.out.print(n+" is not a prime Number");
					f=1;
					break;
				}
			}
		
			if(f==0)
			{
				System.out.println(n+" is a prime no.");
			}
		}
	}

}
