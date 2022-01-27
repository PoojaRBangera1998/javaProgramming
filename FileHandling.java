import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling
{
	public static void main(String[] args)throws IOException{
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter  the sentence");
	String str=sc.nextLine();
	FileOutputStream n=new FileOutputStream("C:\\sample\\file.txt");
	for(int i=0;i<str.length();i++)
	{
		n.write(str.charAt(i));
	}
	n.close();
	System.out.println("Done");
	}
}