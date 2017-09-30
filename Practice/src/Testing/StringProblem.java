package Testing;


import java.util.ArrayList;


public class StringProblem 
{
	static String s= "I am using IDE";
	static String t="using IDE";
	public static void main(String args[])
	{
		
		
		String[] a=stringdifference(s, t);
		//System.out.println(a.toString());
	}
	
	
	public static String[] stringdifference(String s , String t)
	{
		
		ArrayList<String> al = new ArrayList<>();
		ArrayList<String> al2 = new ArrayList<>();
	        
	        String[] s1 = s.split(" ");
	        
	        String[] t1 = t.split(" ");
	        
	        
	        for(String a :s1)
	        {
	        	
	        al.add(a);
	       
	        }
	for(String l :t1)
	{
		
	        al2.add(l);
	       
	        }
	al.removeAll(al2);
	System.out.println(al);
	
	String[] str = al.toArray(new String[al.size()]);
	        return str;
	    }
}
