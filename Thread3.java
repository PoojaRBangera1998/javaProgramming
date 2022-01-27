class Demo7 extends Thread
{
	Demo7(String s)
	{
		super(s);
	}
	public void run()
	{
		System.out.println("Run Method is Executed");
	}
}

class Thread3
{
	public static void main(String[] args)
	{
		Demo7 d=new Demo7("Thread 0");
		d.start();
		System.out.println(d.getName());
		System.out.println(d.getId());
		System.out.println(d.getPriority());
	}
}