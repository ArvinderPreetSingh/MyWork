package Testing;

public class Test3 {

	public static void main(String[] args) {
		sum();
	}
public static void sum()
{
	try{
	int a = 10/0;
	System.out.println(a);}
	catch( ArithmeticException e)
	{
		try{
		System.out.println("a");
		int[] arr1 = new int[5];
		System.out.println(arr1[6]);}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("b");
		}
		
	}

	
}


}
