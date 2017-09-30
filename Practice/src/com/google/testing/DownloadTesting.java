package com.google.testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DownloadTesting {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{		
		
		/*Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory",  System.getProperty("user.dir")+ File.separator + "externalFiles" + File.separator + "downloadFiles");
		prefs.put("pdfjs.disabled", true);
		prefs.put("download.prompt_for_download", false);
		prefs.put( "download.directory_upgrade", true);
		prefs.put("plugins.always_open_pdf_externally", true);	
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		System.setProperty("webdriver.chrome.driver", "E://chromedriver_win32//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(options);*/
		

		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.download.folderlist",2);
		profile.setPreference("browser.download.dir", System.getProperty("user.dir")+ File.separator + "externalFiles" + File.separator + "downloadFiles");
		profile.setPreference("pdfjs.disabled", true);
		profile.setPreference("plugin.scan.Acrobat", "99.0");
		profile.setPreference("plugin.scan.plid.all", false);
		profile.setPreference("plugin.disable_full_page_plugin_for_types", "application/pdf");
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf");
		profile.setPreference("browser.helperApps.neverAsk.openFile",	"application/pdf");
		
		
	/*	
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.download.folderList",2);
		profile.setPreference("browser.download.manager.showWhenStarting",false);
		profile.setPreference("browser.download.dir","E://Java");
		profile.setPreference("browser.helperApps.neverAsk.openFile","application/pdf,application/zip, text/csv");

		DesiredCapabilities dc = DesiredCapabilities.firefox(); 
		dc.setCapability(FirefoxDriver.PROFILE, profile);

		WebDriver driver = new FirefoxDriver(dc);*/
		
		
		/*profile.setPreference("browser.download.folderList",2);
		profile.setPreference("browser.download.dir", System.getProperty("user.dir")+ File.separator + "externalFiles" + File.separator + "downloadFiles");
		profile.setPreference("browser.download.manager.alertOnEXEOpen", false);
		//profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/msword, application/csv, application/ris, text/csv, image/png, application/pdf, text/html, text/plain, application/zip, application/x-zip, application/x-zip-compressed, application/download, application/octet-stream");
		profile.setPreference("browser.download.manager.showWhenStarting", false);
		profile.setPreference("browser.download.manager.focusWhenStarting", false);  
		profile.setPreference("browser.download.useDownloadDir", true);
		profile.setPreference("browser.helperApps.alwaysAsk.force", false);
		profile.setPreference("browser.download.manager.alertOnEXEOpen", false);
		profile.setPreference("browser.download.manager.closeWhenDone", true);
		profile.setPreference("browser.download.manager.showAlertOnComplete", false);
		profile.setPreference("browser.download.manager.useWindow", false);
		profile.setPreference("services.sync.prefs.sync.browser.download.manager.showWhenStarting", false);
		profile.setPreference("pdfjs.disabled", false);
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf,application/zip,text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml");
		profile.setPreference("browser.helperApps.neverAsk.openFile",	"application/pdf,application/zip,text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml");*/
		
        
        WebDriver  driver = new FirefoxDriver(profile);
		
		
		
		
		
		
		/*
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_S);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);*/
		
		
		driver.get("https://www.tutorialspoint.com/selenium/selenium_pdf_version.htm");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.xpath("//a[@title='Selenium Tutorial in PDF']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
        
        
        
        
       /* driver.get("http://only-testing-blog.blogspot.in/2014/05/login.html");
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(.,'Download PDF File')]")).click();
		Thread.sleep(5000);*/
		
		/*File source = new File("E:\\Practice\\externalFiles\\downloadFiles");
		File dest = new File("C:\\Users\\Mr.Singh\\Desktop");
		try {
		    FileUtils.copyDirectory(source, dest);
		} catch (IOException e) {
		    e.printStackTrace();
		}
		*/
        
        /*driver.get("http://docs.seleniumhq.org/download/");
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.xpath("//*[@id='mainContent']/table[1]/tbody/tr[1]/td[4]/a"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);*/
		
        //driver.findElement(By.xpath("//*[@id='mainContent']/table[1]/tbody/tr[1]/td[4]/a")).click();
        
        
	
		//driver.findElement(By.linkText("Test File to Download")).click();
 
		
		//Thread.sleep(5000);
        
		  
	
	
		

	}

}
