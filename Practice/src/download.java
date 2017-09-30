
 
import java.io.IOException;
 
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class download {
 
public static void main(String[] args) throws InterruptedException {
String baseUrl = "http://www.google.co.in/intl/en/chrome/browser/desktop/index.html";
WebDriver driver = new FirefoxDriver();
 
driver.get(baseUrl);
Thread.sleep(10000);
WebElement downloadButton = driver.findElement(By.xpath("//a[@class='button eula-download-button download-button desktop-only hide-cros']"));

String sourceLocation = downloadButton.getAttribute("href");
downloadButton.click();
Thread.sleep(4000);
driver.findElement(By.id("stats-cb")).click();
driver.findElement(By.name("accept")).click();
String wget_command = "cmd /c wget -P c: --no-check-certificate " + sourceLocation;
 
try {
Process exec = Runtime.getRuntime().exec(wget_command);
int exitVal = exec.waitFor();
System.out.println("Exit value: " + exitVal);
} catch (InterruptedException | IOException ex) {
System.out.println(ex.toString());
}

}
}