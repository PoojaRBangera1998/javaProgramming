//Java Prgm to print thre factorial of all the digit in given num
class fact1
{
	public static void main(String[] args)
	{
	
	int num=123;
	while(num>0)
	{
		int temp=num%10;
		int fact=1;
		for(int i=1;i<=temp;i++)
		{
			fact=fact*i;	

		}
		System.out.println(temp+"Fact="+fact);
		num=num/10;
		
		
	}
}
}