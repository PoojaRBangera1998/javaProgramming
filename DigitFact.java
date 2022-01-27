import java.util.Scanner;
class DigitFact
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		
		while(n>0)
		{
			int digit=n%10;
			System.out.println(digit+"Factorial"+fact(digit));
			n=n/10;
		}
	
	}


	public static int fact(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}

	


}
	