import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling1
{
	public static void main(String[] args)throws IOException{
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter  the sentence");
	String str=sc.nextLine();
	FileOutputStream n=null;
	try
	{
		n=new FileOutputStream("C:\\sample\\file.txt");
		System.out.println("File Is Successfully created");
	}
	catch(FileNotFoundException f)
	{
		System.out.println("The Specificed path not available or operating system is not given");
	}

		
	for(int i=0;i<str.length();i++)
	{ 
		try{
		n.write(str.charAt(i));
		}
	
	catch(IOException e)
		{
		System.out.println("IOException is handled");
		}
	}
	
	try
	{
		n.close();
		System.out.println("File is Sucessfully closed");
	}
	catch(IOException e)
	{
		System.out.println("IOexception is handled");
	}
}
}