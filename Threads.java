class Threads
{
	public static void main(String[]  args) throws InterruptedException
	{
		String name=Thread.currentThread().getName();
		System.out.println("Thread Name ="+name);
		System.out.println("ID ="+Thread.currentThread().getId());
		System.out.println("Priority ="+Thread.currentThread().getPriority());
		System.out.println("State ="+Thread.currentThread().getState());
		System.out.println("Daemon ="+Thread.currentThread().isDaemon());

		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			Thread.sleep(3000);		//Waits for 3 sec for each value
		}

	}
}
	
	
	
	