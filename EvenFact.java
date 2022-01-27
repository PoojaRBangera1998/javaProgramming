//even factorial

import java.util.*;
class EvenFact
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int n1=reverse(n);
		
		while(n1>0)
		{
			int temp=n1%10;
			if(temp%2==0)
			{
			System.out.println(temp+"Factorrial of even digit "+Facteven(temp));
			}
			n1=n1/10;
			
		}
	}
	
	public static int Facteven(int n)
	{
			int fact=1;
		
		
			
			for(int i=1;i<=n;i++)
			{
				fact=fact*i;
			}
			return fact;	
		
		
	}



	public static int reverse(int n)
	{
		int rev=0;
		while(n>0)
		{
			int digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		return rev;
	}
}
	