import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ZScalar2 {

	public  static void main(String args[])
	{
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter  String");
		String s1= s.nextLine();
		String s2="";
		String s3="";
		
		Pattern p = Pattern.compile("[a-zA-Z]");
		Matcher m=p.matcher(s1);
		
		while(m.find())
		{
			s2=s2+s1.charAt(m.start());
		}
		System.out.println(s2);
	}
	
}
