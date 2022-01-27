// wajp to remove(key), clear(), get(key), Isempty(),values(), 
import java.util.*;

class Demo
{
	public static void main(String[] args) 
	{
		HashMap hm=new HashMap();
		hm.put(0,"Hello World");
		hm.put(1,"Hi World");
		hm.put(null,null);
		hm.put(2,"Hey Hi");
		hm.put(2,"How r u");
		hm.put(3,null);
		System.out.println(hm);// {0=Hello World, null=null, 1=Hi, 2=How r u, 3=null}
		System.out.println(hm.remove(1));// Hi
		System.out.println(hm.get(3));// null
		System.out.println(hm.values());// [Hello World, null, How r u, null]
		System.out.println(hm.keySet());// [0, null, 2, 3]
		System.out.println(hm.entrySet());// [0=Hello World, null=null, 2=How r u, 3=null]
		System.out.println(hm.size());// 4
		hm.clear();
		System.out.println(hm);// {}
		System.out.println(hm.isEmpty());// true
		
	}
}