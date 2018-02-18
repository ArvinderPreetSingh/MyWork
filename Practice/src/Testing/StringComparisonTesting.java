package Testing;

public class StringComparisonTesting {

	public static void StringComparison()
	{
		try{


			String s1= "abc def ghi jhk mno pqr stu";
			String s2 = "abd def ghi jhk mno pqr dtu";
			if(!s1.equals(s2))
			{
				for(int i=0;i<s1.length();i++)
				{
					if(s1.charAt(i)!=s2.charAt(i))
					{

						if((i+3)>=s1.length())
						{
							System.out.println("String "+ s1.charAt(i));
							System.out.println("String "+s2.charAt(i));
						}
						else{
							System.out.println("String "+ s1.charAt(i)+s1.charAt(i+1)+s1.charAt(i+2)+s1.charAt(i+3));
							System.out.println("String "+s2.charAt(i)+s2.charAt(i+1)+s2.charAt(i+2)+s2.charAt(i+3));
						}
					}
				}
			}
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Done");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) 
	{
		try
		{
			StringComparison();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
