package Testing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		m.put(4, "string1");
		m.put(5, "string2");
		m.put(6, "string3");
		System.out.println(m);
		System.out.println(m.get(4));
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.entrySet());
		
		
		Set s1= m.entrySet();
		
		Iterator itr = s1.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry<Integer, String> m1 = (Map.Entry<Integer, String>)itr.next();
			
			System.out.println(m1.getKey()+ " " + m1.getValue());
			
		}
		
		
		
		
		

	}

}
