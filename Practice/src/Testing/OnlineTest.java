package Testing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class OnlineTest 
{
	static int sum;
	
	public static void main(String[] args) throws FileNotFoundException, IOException  
	{	
		try(BufferedReader br = new BufferedReader(new FileReader("C:Users\\Mr.Singh\\Desktop\\input.txt")))
		{
			String line = br.readLine();

			while (line != null) 
			{
				int k = Integer.parseInt(line);
				sum += k;

				line = br.readLine();
			}
			System.out.println(sum);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Error");
		}
		
	}

}
