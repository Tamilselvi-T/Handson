package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage {
	
	static WebElement element = null;
	
	public static WebElement homepage(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("get xpath");
		//HomePageelement = driver.findElement(By.xpath("//a[contains(@class,'text-center flights')]"));
		//element = driver.findElement(By.linkText("Flights"));
		
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
		driver.findElement(By.linkText("https://www.phptravels.net/")).sendKeys(selectLinkOpeninNewTab);
		System.out.println(element);
				return element;
				
	}

}
