class threads1
{
	public static void main(String[] args)
	{
		Thread t=new Thread();
		System.out.println(Thread.currentThread().getName());
		System.out.println(t.getName());
	}
}