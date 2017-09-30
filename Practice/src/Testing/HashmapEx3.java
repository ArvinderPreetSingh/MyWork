package Testing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashmapEx3 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
	    map.put(1, "one");
	    map.put(2, "two");
	    map.put(3, "three");
	    map.put(4, "Four");
	    map.put(5, "Five");
	    map.put(6, "Six");
	    map.put(7, "Seven");
	    map.put(9, "Nine");
	    map.put(10, "Ten");
	    
	    Set s = map.keySet();
	    ArrayList<Integer> al = new ArrayList<Integer>();
	    
	    al.addAll(s);
	    System.out.println(al);
	    
	    
	    
	}

}
