import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;



//import com.gargoylesoftware.htmlunit.javascript.host.file.File;
//import com.sun.xml.internal.fastinfoset.sax.Properties;


	public class demo {
		
		public static void fnHighlightMe(WebDriver driver,WebElement element) throws InterruptedException{
			//Creating JavaScriptExecuter Interface
			 JavascriptExecutor js = (JavascriptExecutor)driver;
			 for (int iCnt = 0; iCnt < 2; iCnt++) {
			    //Execute javascript
			       js.executeScript("arguments[0].style.border='4px groove green'", element);
			       Thread.sleep(100);
			       js.executeScript("arguments[0].style.border=''", element);
			       Thread.sleep(100);
			 }
			}
		
	public static void main(String[] args)  throws BiffException, IOException  {
		WebDriver driver =null;
		try {
		
		
		//String[] strOptions = new String[] {"disable-extensions","--start-maximized"};
		//ChromeOptions o = new ChromeOptions();
      
		//o.addArguments(strOptions);
		
		//System.setProperty("webdriver.chrome.driver", "E:/HSBC-Automation/lib/Selenium/utils/chrome/chromedriver_win.exe");
		 driver = new FirefoxDriver();
	
	 

	 
	 Properties objprop = new Properties();
	 String path = "C:\\Users\\Mr.Singh\\Desktop\\selenium.xls";
	 
	 File f = new File(path);
	 objprop.load (new FileInputStream(f));
	 System.out.println("file loaded successfully");
	 
	 Workbook q = Workbook.getWorkbook(f);
	 Sheet s =q.getSheet("Sheet1");
	 int rows = s.getRows();
	 int columns = s.getColumns();
	 for (int i=1; i<rows; i++)
	 {
		
			 
//		 String username;
//		 String pass;
		  String username= s.getCell(0,i).getContents(); 
		  String pass= s.getCell(1,i).getContents();
		 
			 
			 
		 driver.get("http://gateway.wipro.com");	

		 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
			  
		 System.out.println(driver.getTitle());
		 Thread.sleep(2000);
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 driver.findElement(By.name("username")).sendKeys(username);
	 driver.findElement(By.name("password")).sendKeys(pass);
	 //driver.findElement(By.className("search_input ui-autocomplete-input")).sendKeys("my time");
	 Thread.sleep(2000);
	 driver.findElement(By.className("credentials_input_submit")).click();
	 Thread.sleep(10000);
//	 driver.findElement(By.id(id));
	 
	 /*
	 driver.findElement(By.className("appstr_text")).click();
	 Thread.sleep(4000);
	 //driver.findElement(By.xpath("//div[@id='MYTIME_SHOW']/a/div/span")).click();
	 driver.findElement(By.id("requestApps")).click();
	 Thread.sleep(2000);
	 
	 
	 
	 
	 

	 
	 
	 driver.findElement(By.xpath("//div[@id='MYREQUESTS_SHOW']/a/div/span")).click();
	 Thread.sleep(4000);
	 
	driver.switchTo().frame("My Requests");
	

	 driver.findElement(By.xpath("//div[@id='pnlWebLink']/ul/li[3]/a")).click();
	 Thread.sleep(5000);
	 
	 driver.findElement(By.xpath("//div[@id='pnlWebLink']/ul/li[3]/ul/li/a[@id='stationary']")).click();
	 Thread.sleep(3000);
	 Select center= new Select(driver.findElement(By.xpath("//li[@class='erequest_li1']/span/select[@id='selEStationeryDevCntr']")));
	 center.selectByValue("PDC");
	 Thread.sleep(3000);
	 Select loc= new Select(driver.findElement(By.id("selEStationeryLocation")));
	 loc.selectByValue("PUN1");
	 Thread.sleep(3000);

	 Select item= new Select(driver.findElement(By.xpath("//div[@class='top_cont scnd_div']/ul/li[3]/span/select[@id='selMaterialLst']")));
	 	 
	 item.selectByVisibleText("STAPLER PINS - MAX-10");
	 
	 Thread.sleep(3000);

	 driver.findElement(By.xpath("//div[@class='top_cont scnd_div']/ul/li[4]/input[@id='txtQuantity']")).clear();
	 driver.findElement(By.xpath("//div[@class='top_cont scnd_div']/ul/li[4]/input[@id='txtQuantity']")).sendKeys("1");
	 driver.findElement(By.xpath("//div[@class='add_del_main']/span[@class='add_btnStationery']")).click();
	 Thread.sleep(3000);
	 
	 
	 Select item2= new Select(driver.findElement(By.xpath("//div[@class='top_cont scnd_div']/ul/li[5]/span/select[@id='selMaterialLst']")));
 	 
	 item2.selectByVisibleText("STAPLER HD-10");
	 
	 Thread.sleep(3000);

	 driver.findElement(By.xpath("//div[@class='top_cont scnd_div']/ul/li[6]/input[@id='txtQuantity']")).clear();
	 driver.findElement(By.xpath("//div[@class='top_cont scnd_div']/ul/li[6]/input[@id='txtQuantity']")).sendKeys("1");
	 */
	 
	 
	 
		 }
	 
	 
	 
	 
	 
	 

	 

	 
	 
	 

	}
		catch(Exception e)
		{ System.out.println(e);

} }
}