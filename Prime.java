//WJP to find prime num

	import java.util.*;
class Prime
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The number");
		int num=sc.nextInt();
		System.out.println(PrimeNum(num));
	}
	
	public static int PrimeNum(int num)
	{
		
		int flag=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
			flag=1;
			}
			
		}
		if(flag==1)
		{
			System.out.println("Not a Prime number");	
		}
		else
		
			
			System.out.println("This is  Prime number");	
		
		return num;
	}
}