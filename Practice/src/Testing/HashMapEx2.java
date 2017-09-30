package Testing;

import java.util.HashMap;

public class HashMapEx2 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm= new HashMap<Integer, String>();  

	     hm.put(1, "one");
	     hm.put(2, "two");
	     hm.put(3, "three");
	 
	     hm.put(1, "ONE");
	     hm.put(null,null);
	 
	     Integer i=null;
	     String str="java programming basics Interview questions";
	 
	     hm.put(i, str);
	 
	    System.out.println(hm.size()); 
	 
	for (Integer name: hm.keySet()){
	 
	   System.out.println(name + " " + hm.get(name)); 
	  
	}
	  
	}
	}


