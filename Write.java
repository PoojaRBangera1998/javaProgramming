package file;

public class Write  extends Thread{
	public void run()
	{
		Drive.write();
		System.out.println("Write thread completed");
	}
}