import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FlightLocator {
	
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		try {
			driver.get("http://www.tam.com.br");
			
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.switchTo().defaultContent();
			driver.switchTo().frame("lojinha");
			driver.findElement(By.id("search_from")).click();
			driver.findElement(By.id("search_from")).clear();
			driver.findElement(By.id("search_from")).sendKeys("RIO");
			
			driver.findElement(By.id("search_to")).click();
			driver.findElement(By.id("search_to")).clear();
			driver.findElement(By.id("search_to")).sendKeys("BSB");
			
			driver.findElement(By.id("search_outbound_date")).sendKeys("25/06/2013");
			driver.findElement(By.id("search_inbound_date")).sendKeys("29/06/2013");
			
			driver.findElement(By.id("onlineSearchSubmitButton")).click();
			
		} finally {
			driver.quit();
		}
	}
}
