package captcha;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutomatingCaptcha2 {

	public static void main(String[] args) throws IOException {
	

		String[] strOptions = new String[] {"disable-extensions","--start-maximized"};
		ChromeOptions o = new ChromeOptions();    
		o.addArguments(strOptions);
		System.setProperty("webdriver.chrome.driver", "E://chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("http://testing-ground.scraping.pro/captcha");
		
		byte[] arrScreen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		BufferedImage imageScreen = ImageIO.read(new ByteArrayInputStream(arrScreen));
		//WebElement cap = driver.findElementById("captcha");
		WebElement cap = driver.findElement(By.id("captcha"));
		Dimension capDimension = cap.getSize();
		Point capLocation = cap.getLocation();
		BufferedImage imgCap = imageScreen.getSubimage(capLocation.x, capLocation.y, capDimension.width, capDimension.height);
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		ImageIO.write(imgCap, "png", os);
		
	
		SocketClient client = new SocketClient("user", "password");
		Captcha res = client.decode(new ByteArrayInputStream(os.toByteArray()));
		
	
		driver.findElement(By.xpath("//input[@name='captcha_code']").sendKeys(res.text));
		driver.findElement(By.xpath("//input[@name='submit']")).click();

	}

}
