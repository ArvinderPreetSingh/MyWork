import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Zscalar
{
	public static void main(String[] args)
	{    	
		Scanner s = new Scanner(System.in);

		System.out.print("Enter how many names: ");
		
		int numOfNames = Integer.parseInt(s.nextLine());
		
		String arrayOfNames[] = new String[numOfNames];
		
		for (int i = 0; i < arrayOfNames.length; i++) 
		{
			System.out.print("Enter the name of friend " + (i+1) + " : ");
			
			arrayOfNames[i] = s.nextLine();
		}

		ArrayList<String> a = new ArrayList<String>();
		
		for(int j=0; j<arrayOfNames.length; j++)
		{
			a.add((arrayOfNames[j]));
		}
		
		Collections.sort(a);
				
		System.out.println(a);

		HashMap<Character, List<String>> m = new HashMap<Character, List<String>>();

		char[] keys = new char[arrayOfNames.length];

		for(int j=0; j<keys.length; j++)
		{
			keys[j]= a.get(j).toString().charAt(0);
		}	    

		for (char c : keys)
		{	
			if(m.containsKey(c))
			{

			}
			else
			{
				ArrayList<String> al = new ArrayList<String>();

				for(int j=0; j<arrayOfNames.length; j++)
				{	
					if(arrayOfNames[j].toString().charAt(0)==c)
					{
						al.add(arrayOfNames[j].toString());
					}
				}
				m.put(c, al);	
			}
		}
		System.out.println(m);
		
	}
}	
