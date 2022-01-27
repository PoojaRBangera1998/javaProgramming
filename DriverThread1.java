class Demo7 implements Runnable
{
	Demo7()
	{
			
	}
	
	public void run()
	{
		System.out.println("Runnable thread is Executed");
	}
}

class Demo6 extends Thread
{
	Demo6()
	{
			
	}
	
	public void run()
	{
		System.out.println("Thread thread is Executed");
	}
}

class DriverThread1
{
	public static void main(String[] args)
	{
		Thread t1=new Thread(new Demo7());
		Demo6 t2=new Demo6();
		System.out.println(t1.getName());
		t1.start();

		System.out.println(t2.getName());
		t2.start();
	}
}


