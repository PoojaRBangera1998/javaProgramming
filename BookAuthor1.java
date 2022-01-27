import java.util.*;
class Book implements Comparable
{
	int bid;
	String title;
	String author;
	Book(int bid,String title,String author)
	{
		this.bid=bid;
		this.title=title;
		this.author=author;
	}
	
	@Override
	public String toString()
	{
		return "Book [Book Id:  "+bid+" "+"Title: "+title+" "+"Author:  "+author+"+\n]";
	}

	@Override
	public int compareTo(Object o)
	{
		Book b1=(Book)o;
		return this.bid-b1.bid;
	}
}
class Author
{	
	String name;
	int houseNo;
	String address;
	Author(String name,int houseNo,String address)
	{
		this.name=name;
		this.houseNo=houseNo;
		this.address=address;
	}
	
	@Override
	public String toString()
	{
		return "Author [Author name  "+name+ " "+"HouseNo: "+houseNo+" "+"Address:  "+address+"+\n]";
	}
}

class BookAuthor1{

	public static void main(String[] args)
	{

		//LinkedHashMap
		LinkedHashMap<Book,Author> map=new LinkedHashMap<>();
		
		map.put(new Book(1002,"World is Magical","Anvith"),new Author("Anvith",123456,"A........."));
		map.put(new Book(1001,"World Empty","Pooja"),new Author("Pooja",1234,"P........."));
		map.put(new Book(1003,"World","Bangera"),new Author("Bangera",12340,"B........."));
		
		System.out.println("It is Stored in LinkedHashMap");
		System.out.println(map);

		//convert to Hashmap
		HashMap m=new HashMap(map);
		System.out.println("It is Stored in HashMap");
		System.out.println(m);

		//convert to treemap
		TreeMap p=new TreeMap(map);
		System.out.println("It is Stored in TreeMap");
		System.out.println(p);

		//convert to Hashtable
		System.out.println("It is Stored in Hash table");
		Hashtable h=new Hashtable(p);
		System.out.println(h);
		
	}
}

		