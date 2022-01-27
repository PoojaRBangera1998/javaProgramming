//WJP to find prime num

	import java.util.*;
class PrimeRange
{
	public static void main(String[] args)
	{
	
		
		for(int i=10;i<=50;i++)
		{
			boolean b=false;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					b=true;
				}
			}
		
		if(b==false)
		{
			System.out.println(i);	
		}
	}}
}