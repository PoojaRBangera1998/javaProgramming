package file;

public class Read  extends Thread{
	public void run()
	{
		Drive.read();
		System.out.println("Read thread completed");
	}
}