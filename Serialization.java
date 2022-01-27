import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
class Employee implements Serializable{
	
		int eid;
		String name;
	
		Employee(int eid,String name)
		{
			this.eid=eid;
			this.name=name;
		}
}

public class Serialization
{
	public static void main(String[] args)throws Exception 
	{
	Employee e=new Employee(1,"Pooja");	
	FileOutputStream f=new FileInputStream("C:\\sample\\serial.txt");
	ObjectOutputStream o=new ObjectOutputStream(f);
	o.writeObject(e);
	
	o.close();
	System.out.println("Done");
	}
}