package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage {
	
	static WebElement element = null;
	
	public static WebElement homepageurl(WebDriver driver) throws Exception {
		Thread.sleep(3000);
		System.out.println("get xpath");
				
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
		driver.findElement(By.linkText("https://www.phptravels.net/")).sendKeys(selectLinkOpeninNewTab);
		return element;
				
	}
	public static WebElement Myaccountdrpdwn(WebDriver driver) {	
		element = driver.findElement(By.xpath("//div[@class='dropdown dropdown-login dropdown-tab']//a[@id='dropdownCurrency']"));
	    return element;
	}
	
	public static WebElement Loginlink(WebDriver driver) {	
		element = driver.findElement(By.xpath("//a[@class='dropdown-item active tr']"));
	    return element;
	}
	
	public static WebElement username(WebDriver driver) {		
		element = driver.findElement(By.xpath("//input[@placeholder='Email']"));
		return element;
				
	}
		
	public static WebElement password(WebDriver driver) {		
		element = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		return element;
				
	}
	
	public static WebElement login(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block loginbtn']"));
		return element;
	}
	
	
	public static WebElement Hometab(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		return element;
	}
	public static WebElement flighttab(WebDriver driver) {		
		element = driver.findElement(By.xpath("//a[@href='#flights']"));
		return element;
				
	}
	
	public static WebElement Roundtripradio(WebDriver driver) {
		element = driver.findElement(By.xpath("//label[contains(text(),'Round Trip')]"));
		return element;
	}
	
	public static WebElement FromCity(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='s2id_location_from']"));
		return element;
	}
	
	public static WebElement ToCity(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='s2id_location_to']"));
		return element;
	}
	
	public static WebElement StartDate(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='FlightsDateStart']"));
		return element;
	}
	public static WebElement ReturnDate(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='FlightsDateEnd']"));
		return element;
	}
	public static WebElement PaxA(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='flights']//div[contains(@class,'row gap-5')]//div[1]//div[1]//div[2]//div[1]//input[1]"));
		return element;
	}
	public static WebElement PaxC(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='flights']//div[contains(@class,'row gap-5')]//div[1]//div[1]//div[2]//div[1]//span[1]//button[1]"));
		return element;
	}
	
	public static WebElement PaxI(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[contains(@class,'row gap-10 mb-15 align-items-end row-reverse')]//div[2]//div[1]//div[2]//div[1]//span[1]//button[1]"));
		return element;
	}
	
	public static WebElement Search(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[contains(@class,'col-md-3 col-xs-12')]//div[3]//div[1]//div[2]//div[1]//span[1]//button[1]"));
		return element;
	}
	
	
		//div[@id='select2-drop']//input[contains(@class,'select2-input')]
	//div[@id='select2-drop']//input[contains(@class,'select2-input')]
	
	
}
