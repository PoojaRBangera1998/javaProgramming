import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class Demo1
{
	public void readFile()throws Exception{
	FileInputStream f1=new FileInputStream("C:\\PoojaJava\\example1.txt");
		int a=f1.available();
		System.out.println(a);
		for(int i=0;i<a;i++)
		{
          		int b = f1.read();
          		System.out.print((char)b);
		  	try
			    {
		  		Thread.sleep(1000);
		  	   }
		  	catch(Exception e)
			{
			  System.out.println("Error");
		 	}
		}
		f1.close();
		System.out.println();
		System.out.println("read is Sucessful");
	
}
	
public void writeFile(String s)throws Exception{

	FileOutputStream f2=new FileOutputStream("C:\\PoojaJava\\example.txt");
	for (int i=0;i<s.length();i++ )
	{
		f2.write(s.charAt(i));
		try
		{
		  Thread.sleep(1000);
		 }
		  catch(Exception e){
			  System.out.println("Error");
		  }
		
	}
	System.out.println("write is Done");

	}
}

class TryThread1 extends Thread
{
	TryThread1(String s){
		super(s);
	}
	public void run() {
	Demo1 d=new Demo1();
	try{
	d.writeFile("Happyyyyyyy");
	}
	catch(Exception e){
	}
	}

}

class TryThread extends Thread
{
	TryThread(String s){
		super(s);
	}
	public void run() {
	Demo1 d=new Demo1();
	try{
	d.readFile();
	}
	catch(Exception e){
	}
	}

}
class DriverThread3
{
	public static void main(String []args)throws Exception{
	Thread t=new Thread(new TryThread("Archana"));
	Thread t1=new Thread(new TryThread1("Pooja"));
	
	t1.start();
	t.start();
	
	}
}