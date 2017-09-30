package Testing;

public class Test1 extends Test2 {

	public static void main(String[] args) 
	{
		Test1.sum(10l, 20l);
	}

	public static void sum(long  d , long e)
	{
		System.out.println("child");
	}
}
