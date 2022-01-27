

import java.util.*;

public class Hashmap2{
	public static void main(String[] args)
	{
		HashMap map =new HashMap();
		
		map.put(1,500);
		map.put(1,900);
		map.put(2,"Hello");
		map.put('b',"Hi");
		map.put(null,null);
		map.put(3,null);
		map.put('*',"$&&&");

		System.out.println(map);

		//Only Keys
		Set s=map.keySet();
		System.out.println(s);


		//Only values
		Collection c=map.values();
		System.out.println(c);
		
	}
}
