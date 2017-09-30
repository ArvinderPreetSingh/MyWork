package com.testing.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Globalutil 

{	
	private static WebDriver driver;
	
	private static Globalutil global = new Globalutil();
	

	private Globalutil()
	{
		
	}
	
	public static Globalutil getInstance()
	{
		return global;
	}
	
	public  void loadDriver()
	{
		String[] strOptions = new String[] {"disable-extensions","--start-maximized"};
		ChromeOptions o = new ChromeOptions();    
		o.addArguments(strOptions);
		System.setProperty("webdriver.chrome.driver", "E://chromedriver_win32//chromedriver.exe");

		driver = new ChromeDriver();
	}
	public  WebDriver getDriver()
	{	
		return driver;
	}

	public  void input(By WebElement, String keys)
	{
		getDriver().findElement(WebElement).sendKeys(keys);
	}

	public  void quitDriver()
	{	
		driver.quit();
	}
}
