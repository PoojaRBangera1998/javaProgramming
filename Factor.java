//perfect number in given range

import java.util.Scanner;

class Factor
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Number");	
	int num=sc.nextInt();
	
	for(int i=1;i<=num;i++)
	{
		int sum=0;
		for(int j=1;j<i;j++)
		{
			if(i%j==0)
			{
				sum=sum+j;
			}
		}
		if(sum==i)
		{
			System.out.println(i);	

		}
		
	}
}
}

		