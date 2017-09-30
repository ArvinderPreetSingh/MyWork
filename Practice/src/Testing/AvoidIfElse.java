package Testing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AvoidIfElse 
{
	private static final Map<String, Class<?>> city = new HashMap<String, Class<?>>();
	static {
	city.put("A", Amritsar.class);
	city.put("J", Jallandhar.class);
	city.put("L", Ludhiana.class); }	
	public static Object  getConcreteCity(String type) 
	{
	    Class<?> clazz = city.get(type);
	    if (clazz == null) 
	    {
	        throw new IllegalStateException("No city of type " + type);
	    }
	    try 
	    {
	         return clazz.newInstance();
	    } catch (Exception e) 
	    {
	        throw new IllegalStateException("Unable to instantiate city of type " + clazz.getSimpleName(), e);
	    }
	}	
	public static void main(String[] args) 
	{
	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the input");
		String S1= s.nextLine();		
		getConcreteCity(S1);
		}
	}


