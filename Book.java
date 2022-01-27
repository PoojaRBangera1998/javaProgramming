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
		return "Book [Book Id:  "+bid+" "+"Title: "+title+" "+"Author:  "+author+"]";
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
		return "Author [Author name  "+name+ " "+"HouseNo: "+houseNo+" "+"Address:  "+address+"]";
	}
}

class BookAuthor{

	public static void main(String[] args)
	{
		TreeMap<Book,Author> map=new TreeMap<Book,Author>();
		
		map.put(new Book(1002,"World is Magical","Anvith"),new Author("Anvith",123456,"A........."));
		map.put(new Book(1001,"World Empty","Pooja"),new Author("Pooja",1234,"P........."));
		map.put(new Book(1003,"World","Bangera"),new Author("Bangera",12340,"B........."));


		System.out.println(map);


		
	}
}

		