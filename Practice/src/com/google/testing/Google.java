package com.google.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;

import com.google.repositoy.GoogleRepository;
import com.testing.util.Globalutil;

public class Google 
{
	 public  static Globalutil global = Globalutil.getInstance();
public static void main(String args[])

{
	
	/*Vector v = new Vector();
	v.add("gh");
	
	System.out.println(v);
	*/
	
	GoogleRepository repo = new GoogleRepository();
			
	global.loadDriver();
	global.getDriver().get("https://www.google.co.in");
	global.getDriver().manage().window().setPosition(new Point(-2000, 0));
	//global.getDriver().manage().window().maximize();
	global.getDriver().manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	repo.inputSearch("Arvinder Preet Singh");
	global.quitDriver();
	
}


}
