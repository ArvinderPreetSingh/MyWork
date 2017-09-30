package Testing;

import java.util.ArrayList;

public class Test4 {
	static int [] x ;
	static int [] y = new int [3];
	static String [] z = new String [3];
	

	static void  m()
	{
		int i=10;
		String s = Integer.toString(i);
		Integer I = i;
		
		int w = I;
		
		ArrayList al = new ArrayList();
		al.add(1);
		al.add("ag");
		System.out.println(al);
		
	}
	
	

	public static void main(String[] args) {

		 m();
System.out.println(x);
System.out.println(y);

for(int y1 : y)
{
	System.out.println(y1);
}
for(String z1 : z)
{
	System.out.println(z1);
}

	}

}
