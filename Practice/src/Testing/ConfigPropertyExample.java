package Testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.Properties;

public class ConfigPropertyExample {

	public static void main(String[] args) throws IOException 
	{
		
		File file = new File("C:\\Users\\Mr.Singh\\Desktop\\LocalRepository\\Practice\\config.properties");
		  
		FileInputStream fileInput = new FileInputStream(file);
		
		
		
		Properties prop = new Properties();
		prop.load(fileInput);
		
		/*String s1= "This string is created to test the config properties " + ConfigPropertyExample2.x+" " +ConfigPropertyExample2.y+" " +ConfigPropertyExample2.z;
		
		System.out.println(s1);
		
		
		
		String s4= prop.getProperty("s3");
		String s5 =MessageFormat.format(s4, ConfigPropertyExample2.x, ConfigPropertyExample2.y, ConfigPropertyExample2.z);
		System.out.println(s5);*/
		
		
		String s6 = prop.getProperty("MIR");
		System.out.println(s6);
		System.out.println(s6.equals("abc def (terms and conditions apply)"));
		

	}

}
