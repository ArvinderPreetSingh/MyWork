package captcha;

import java.awt.Image;
import java.awt.image.RenderedImage;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import com.asprise.util.ocr.OCR;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutomatingCaptcha 

{
	public static void main(String args[]) throws IOException
	{

		String[] strOptions = new String[] {"disable-extensions","--start-maximized"};
		ChromeOptions o = new ChromeOptions();    
		o.addArguments(strOptions);
		System.setProperty("webdriver.chrome.driver", "E://chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		/*driver.get("https://www.irctc.co.in/");

	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

	driver.findElement(By.xpath(""));

	driver.findElement(By.xpath(""));*/


		driver.get("http://www.mythoughts.co.in/2013/10/extract-and-verify-text-from-image.html");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		String imageUrl=driver.findElement(By.xpath("//*[@id='post-body-5614451749129773593']/div[1]/div[1]/div/a/img")).getAttribute("src");
		System.out.println("Image source path : \n"+ imageUrl);

		URL url = new URL(imageUrl);
		Image image = ImageIO.read(url);
		String s = new OCR().recognizeCharacters((RenderedImage) image);
		System.out.println("Text From Image : \n"+ s);
		System.out.println("Length of total text : \n"+ s.length());


	}
}
