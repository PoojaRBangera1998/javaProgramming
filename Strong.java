//PRINT STRONG
import java.util.Scanner;

class Strong
{
	public static void main(String[] args)
	{
	//Scanner sc=new Scanner(System.in);
	//System.out.println("Enter The Number");	
	//int num=sc.nextInt();
	//int num=100;
	//int sum=0;
	//int num1;
	//num1=num;

	for(int num=1;num<=1000;num++)
	{
		
			int num1=num;
			int sum=0;
			while(num1>0)
			{
				int temp=num1%10;
				sum=sum+fact(temp);
				num1=num1/10;
			}
			if(sum==num)
			{
				System.out.println("Strong Number ="+num);
			}

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
			
