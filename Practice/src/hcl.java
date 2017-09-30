import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

/*class test {
	 public test ()
	 {
		 System.out.println("AA");
	 }
	 public  test(int i )
	 {
		 System.out.println("A");
	 }	
}
public class hcl extends test   {

	public hcl ()
	{
		System.out.println("B");
	}
	
	public  hcl (int i){
		this ();
		System.out.println("ABC");
		
	}
	public static void main(String[] args) {
		
		hcl h = new hcl(5);
		
		
		
		

	}

}
*/




/*public class hcl {
	 public static void main(String args[]){
		 String s= 40+50+"arvinder"+50+40;
		 System.out.println(s);
		 

	 }
}*/
/*class Arvinder {
	public int m1(int i) {
		System.out.println("A");
		return 0;
	}
	
	public void m2() {
		System.out.println("B");
	}
	
	public void m3() {
		System.out.println("C");
	}
	
//	
}*/
public class hcl  {
	/*public int m1(int i) {
		System.out.println("D");
		return 'c';
	}
	
	public void m4() {
		System.out.println("E");
	}*/

/*public static void main (String args[])
{ Arvinder  obj = new hcl ();
   obj.m1();
   obj.m2();
   obj.m3();
   //obj.m4();
}*/
	public static void main(String args[]) throws FileNotFoundException
	{
		/*System.out.println("ganja");
	}
	public static void main (String args[]){
	String s= "ganja";
	s=s.concat("singh");
	System.out.println(s);
	
	StringBuffer s1 = new StringBuffer("ganja");
	s1.append("singh");
	System.out.println(s1);
	
	String s2= 40+50+"jhotekut"+40+50;
	System.out.println(s2);
	int f= 01234567;
	int i= 0XAEB;
	//int j =0XASE;
	int k= 0XAFE;
	System.out.println(076*1);
	main();*/
	
		/*String s= "012345@!@#$";
		String s1="";
		String s2="";
		for ( int i=0; i<s.length(); i++)
		{
			if (Character.isDigit(s.charAt(i)))
			{
				s1=s1+s.charAt(i);
			}
			else
			{
				s2=s2+s.charAt(i);
			}
		}
		System.out.println(s1);
		System.out.println(s2);*/
		
		/*try{
			int b= 50/0;
			System.out.println(b);
		
		}
		catch(Exception e){
		System.out.println(e);
		int a = 50/0;
		System.out.println(a);}
		
		finally {
			System.out.println("Finally");
		}
		System.out.println("ABC");*/
		
		/* ArrayList<String> listofcountries = new ArrayList<String>();
		   listofcountries.add("India");
		   listofcountries.add("Ireland");
		   listofcountries.add("US");
		   listofcountries.add("UK");
		   listofcountries.add("China");
		   listofcountries.add("Denmark");

		   Unsorted List
		   System.out.println("Before Sorting:");
		   for(String counter: listofcountries){
				System.out.println(counter);
			}

		    Sort statement
		   Collections.sort(listofcountries);

		    Sorted List
		   System.out.println("After Sorting:");
		   for(String counter: listofcountries){
				System.out.println(counter);
			}
		int size = listofcountries.size();
		*/

		/*PrintWriter pw = new PrintWriter("C:\\Users\\Mr.Singh\\Desktop\\abc.txt");
		pw.write("Hello");
		System.out.println("abc");
		System.out.println(10/0);*/
		
		/*String s= "Arvinder.Preet.Singh";
		String[] s1 =s.split("\\.");
		
		for(String s2 : s1)
		{
			System.out.println(s2);
		}*/
		
		/*Scanner s = new Scanner(System.in);
		System.out.println("Enter fone number");
		String l = s.nextLine();
		
		Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
		Matcher m= p.matcher(l);
		
		
		
		if (m.find() && m.group().equals(l))
		{
			
			System.out.println("right");
		}
		else
		{	
			
			System.out.println("wrong");
			
		}*/
		
		/*
		Scanner s = new Scanner(System.in);
		System.out.println("Enter  number");
		String s1 = s.nextLine();
		
		Pattern p = Pattern.compile("(0*)(.*)");
		Matcher m= p.matcher(s1);
		
		
		if(m.find())
		{
			s1=m.group(2);
			System.out.println(s1);
		}*/
		
		/*Scanner s = new Scanner(System.in);
		System.out.println("Enter  number");
		String s1 = s.nextLine();

		while(s1.length()>0 && s1.charAt(0)=='0')
		{
		   s1 = s1.substring(1); 
		}
		
		System.out.println(s1);*/
	}
}
	
	
/*
class Bank{  
int getRateOfInterest(){return 0;}  
}  
  
class SBI extends Bank{  
int getRateOfInterest(){return 8;}  
}  
  
class ICICI extends Bank{  
int getRateOfInterest(){return 7;}  
}  
class AXIS extends Bank{  
int getRateOfInterest(){return 9;}  
}  
  
class hcl

{  
public static void main(String args[]){  
Bank b1=new SBI();  
Bank b2=new ICICI();  
Bank b3=new AXIS();  
System.out.println("SBI Rate of Interest: "+b1.getRateOfInterest());  
System.out.println("ICICI Rate of Interest: "+b2.getRateOfInterest());  
System.out.println("AXIS Rate of Interest: "+b3.getRateOfInterest());  
}  
}  */