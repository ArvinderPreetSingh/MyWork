package stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class StepDefination {
	
	private static WebDriver driver;
	
	@Before("@tag")
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "E://chromedriver_win32//chromedriver.exe");
		   driver = new ChromeDriver();
	}
	
	
	
	@Given("^Do Chrome testing$")
	public void do_Chrome_testing() throws Throwable {
		
		

		
		
		driver.get("https://www.google.co.in");
		
		
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
		driver.quit();
		
		
	    
	}
	
	@Given("^Do Chromes testing$")
	public void do_Chromes_testing() throws Throwable {
		
		

		
		
		driver.get("https://www.google.co.in");
		
		
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
		driver.quit();
		
		
	    
	}

	@Given("^Do IE testing$")
	public void do_IE_testing() throws Throwable {
		
		
		
		
		driver.get("https://www.google.co.in");
		
		
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.quit();
		
	   
	}
	@Given("^Do firefox testing$")
	public void do_firefox_testing() throws Throwable {
		
		
		
		driver.get("https://www.google.co.in");
		
		
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.quit();
		
	   
	}

	
}
