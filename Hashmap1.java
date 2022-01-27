

import java.util.HashMap;

public class Hashmap1{
	public static void main(String[] args)
	{
		HashMap map =new HashMap();
		
		map.put(1,500);
		map.put(2,"Hello");
		map.put('b',"Hi");
		map.put(null,null);
		map.put(3,null);
		map.put('*',"$&&&");

		System.out.println(map);
	}
}
