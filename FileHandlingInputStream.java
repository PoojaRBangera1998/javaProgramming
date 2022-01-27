import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingInputStream
{
	public static void main(String[] args)throws IOException,FileNotFoundException {
		
	FileInputStream n=new FileInputStream("C:\\sample\\file.txt");
	System.out.println((char)n.read());//h
	System.out.println((char)n.read());//e
	System.out.println((char)n.read());//l
	System.out.println((char)n.read());//l
	System.out.println((char)n.read());//o
	
	int a=n.read();	//Intialization
	while((a)!=-1)	//condition
	{
		System.out.println((char)a);
		//update the varisble a
		a=n.read();
	}

	n.close();
	System.out.println();
	System.out.println("Done");
	}
}