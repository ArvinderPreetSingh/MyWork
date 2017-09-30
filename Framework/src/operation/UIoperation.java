package operation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class UIoperation {
	WebDriver driver;
	
	public UIoperation(WebDriver driver)
	{ this.driver= driver;}
	
	
	
	public void perform(String operation,String type,String value, String value2) throws Exception{
		
	switch (operation.toUpperCase()) {
	
	case "CLICK":
		driver.findElement(this.getobject(type,value2)).click();
		break;
		
	case "CLOSE":
		driver.quit();
		break;
		
	case "WAIT":
		Thread.sleep(3000);
		break;
	case "FETCH":
		driver.findElement(this.getobject(type,value2)).getText();
		System.out.println(driver.findElement(this.getobject(type,value2)).getText());
		break;
		
	case "CLEAR":
		driver.findElement(this.getobject(type,value2)).clear();
		break;
		
	case "SETTEXT":
		
		driver.findElement(this.getobject(type,value2)).sendKeys(value);
		break;
	case "GOTOURL":
		driver.get(value);
		Thread.sleep(5000);
		break;
	case "GETTEXT":
		driver.findElement(this.getobject(type,value2)).getText();
		break;
	case "CLEAR&ENTER":
		driver.findElement(this.getobject(type,value2)).click();
		
		driver.findElement(this.getobject(type,value2)).sendKeys(Keys.chord(Keys.CONTROL,"a"));
		driver.findElement(this.getobject(type,value2)).sendKeys(value);
		break;
	default:
		break;
	} }
	
	public By  getobject( String type,String value2) throws Exception{
		
		if(type.equalsIgnoreCase("XPATH")){
			
			return By.xpath(value2);
		}
		//find by class
		else if(type.equalsIgnoreCase("CLASSNAME")){
			
			return By.className(value2);
			
		}
		//find by name
		else if(type.equalsIgnoreCase("NAME")){
			
			return By.name(value2);
			
		}
		
		//Find by css
		else if(type.equalsIgnoreCase("CSS")){
			
			return By.cssSelector(value2);
			
		}
		//find by link
		else if(type.equalsIgnoreCase("LINK")){
			
			return By.linkText(value2);
			
		}
		//find by partial link
		else if(type.equalsIgnoreCase("PARTIALLINK")){
			
			return By.partialLinkText(value2);
			
		}
		else if(type.equalsIgnoreCase("ID")){
			
			return By.id(value2);
			
		}
		else
		{
			throw new Exception("Wrong object type");
		}
	}
	


}

	
