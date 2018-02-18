package testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testing 
{

	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("beforemethod");
	}
	
	@BeforeTest
	public void beforeclass()
	{
		System.out.println("beforeclass");
	}
	
	
	/*@Test
	public void test1()
	{
		System.out.println("test1");
	}*/
	
	
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("aftermethod");
	}
	
	@AfterTest
	public void afterclass()
	{
		System.out.println("afterclass");
	}
}
