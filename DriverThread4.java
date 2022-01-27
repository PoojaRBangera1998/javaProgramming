package file;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


class Write  extends Thread{
	public void run()
	{
		DriverThread4.write();
		System.out.println("Write thread completed");
	}
}


class Read  extends Thread{
	public void run()
	{
		DriverThread4.read();
		System.out.println("Read thread completed");
	}
}


public class DriverThread4{
	public synchronized static void read()
	{
		try{
		FileInputStream n=new FileInputStream("C:\\PoojaJava\\example1.txt");
			int a=n.read();
			while(a!=-1)
			{
				Thread.sleep(2000);
				System.out.println((char)a);
				a=n.read();
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception is handled");
		}
	}



	public synchronized static void write()
	{
		try
		{
			FileOutputStream n=new FileOutputStream("C:\\PoojaJava\\example1.txt");
			String str="hello";
			for(int i=0;i<str.length();i++)
			{
				n.write(str.charAt(i));
				Thread.sleep(2000);
			}
		}
			
		catch(Exception e)
		{
			System.out.println("Exception is handled");
		}
	}

		

	public static void main(String []args){
	Read r=new Read();
	Write w=new Write();
	
	r.start();
	w.start();
	
	}
}