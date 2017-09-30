package testcase;


import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import ExcelConfig.Readexcelfile;
import operation.UIoperation;

public class Executetest {
	WebDriver driver;

@Test

public   void test1() throws Exception{
	String[] strOptions = new String[] {"disable-extensions","--start-maximized"};
	ChromeOptions o = new ChromeOptions();    
	o.addArguments(strOptions);
	System.setProperty("webdriver.chrome.driver", "E://chromedriver_win32//chromedriver.exe");
			driver = new ChromeDriver();
	  //driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	  driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	  
Readexcelfile file = new Readexcelfile();
UIoperation operation = new UIoperation(driver);
Sheet sh2= file.readexcel(System.getProperty("user.dir")+"\\", "DriverScript.xlsx", "Sheet1");
System.out.println("file loaded");
int rownum = sh2.getLastRowNum()-sh2.getFirstRowNum();
for ( int i=1; i<rownum+1; i++)
	{
 		if(sh2.getRow(i).getCell(1).toString().equals("Yes"))
 		{
 			System.out.println("testcase " +sh2.getRow(i).getCell(0).toString() +" will start");
 		
 			
 		Readexcelfile file2 = new Readexcelfile();
		Sheet sh3= file2.readexcel(System.getProperty("user.dir")+"\\", sh2.getRow(i).getCell(0).toString()+".xlsx", "Sheet1");
		System.out.println("file loaded2");
		System.out.println(sh2.getRow(i).getCell(0).toString()+".xlsx");
			
		int rownum1 = sh3.getLastRowNum()-sh3.getFirstRowNum();
		for ( int j=1; j<rownum1+1; j++)
		{
			{
			 	if(sh3.getRow(j).getCell(0).toString().length()==0){
			 		{
			 			
			 			operation.perform(sh3.getRow(j).getCell(1).toString(),sh3.getRow(j).getCell(3).toString(),sh3.getRow(j).getCell(5).toString(),sh3.getRow(j).getCell(4).toString());
			 	
			 		
		}
		
			}}}}}}}
	
	