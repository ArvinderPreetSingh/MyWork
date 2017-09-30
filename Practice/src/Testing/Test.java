package Testing;

public class Test {

	public static void main(String[] args) {
		int a=0;
		try{
			a=5/0;
			System.out.println(a);
			
		}
catch(ArithmeticException e)
		{System.out.println("abc");
}
	System.out.println(a);
	
	}
}