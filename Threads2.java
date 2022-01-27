class Threads2
{
	public static void main(String[] args)
	{
		Thread t=new Thread();
		System.out.println(Thread.currentThread().getName());
		t.start();
		System.out.println(t.getName());
	}
}