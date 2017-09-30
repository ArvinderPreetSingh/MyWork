import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1_2 {

	public static void main(String[] args) {
		try {
			WebDriver driver= new FirefoxDriver();
			driver.get("http://www.makemytrip.com");
			driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			Thread.sleep(4000);
			driver.findElement(By.xpath("//ul[@class='tabs_list clearfix']/descendant::li[2]")).click();
			Thread.sleep(4000);
			
			driver.findElement(By.xpath("//div/a[@id='one_way_button1']")).click();
			driver.findElement(By.xpath("//div[@id='myCarousel']/descendant::li[3]")).click();
			
			System.out.println("clicked");
//			driver.findElement(By.id("from_typeahead1")).clear();
//			driver.findElement(By.id("from_typeahead1")).sendKeys("ATQ");
//			driver.findElement(By.id("from_typeahead1")).sendKeys(Keys.ENTER);
//			driver.findElement(By.id("to_typeahead1")).clear();			
//			driver.findElement(By.id("to_typeahead1")).sendKeys("BOM");
//			driver.findElement(By.id("to_typeahead1")).sendKeys(Keys.ENTER);
		
		}
		
		catch(Exception e){
			System.out.println(e);
		}

	}

}
