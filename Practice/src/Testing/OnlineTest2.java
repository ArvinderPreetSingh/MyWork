package Testing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class OnlineTest2
{	
	public static void main(String[] args) throws FileNotFoundException, IOException  
	{	
		try(BufferedReader br = new BufferedReader(new FileReader("C:Users\\Mr.Singh\\Desktop\\input2.txt")))
		{
			String line = br.readLine();
			
			while (line != null) 
			{
				line =line.trim();
				if(line.length()==28)
				{
					System.out.println(line);
				}
				line = br.readLine();
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	
	}
}

