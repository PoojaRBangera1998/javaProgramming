class Demo7 implements Runnable
{
	Demo7(String s)
	{
			
	}
	
	public void run()
	{
		System.out.println("Run Method is Executed");
	}
}

class DriverThread
{
	public static void main(String[] args)
	{
		Thread d=new Thread(new Demo7("Thread 0" ));
		
		d.start();
		System.out.println(d.getName());
		System.out.println(d.getId());
		System.out.println(d.getPriority());
	}
}


