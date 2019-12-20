package phpTravels;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import PageObjectModel.HomePage;


public class MainProject {
	
	WebDriver driver = null;
		
			
	@BeforeTest
        public void HomePage() throws IOException, InterruptedException, InvalidFormatException {
		
		FileInputStream file = new FileInputStream(new File("C:\\Users\\Tamilselvi\\eclipse-workspace\\Handson_testNG\\src\\test\\java\\TestData.properties"));
		Properties prop = new Properties();
		prop.load(file);
		String url = prop.getProperty("URL");
		String url1 = prop.getProperty("URL1");
		
		
		// Launch chrome browser and application
		System.setProperty("webdriver.chrome.driver", "F:\\Chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url1);
		Thread.sleep(3000);
		driver.manage().window().maximize();	
		Thread.sleep(1000);
		
	}
	
	@Test
	
	public void Login() throws Exception, IOException {
		String UserName = Login.logindata(3, 0);
		String Password = Login.logindata(3, 1);
		String From = Login.logindata(3, 2);
		String To = Login.logindata(3, 3);
		System.out.println(From);
		System.out.println(To);
		String SDate = Login.logindata2(3, 4);
		System.out.println(SDate);
		String RDate = Login.logindata2(3, 5);
		System.out.println(RDate);
		String adt = Login.logindata1(3, 6);
		System.out.println(adt);
		String chd = Login.logindata1(3, 7);
		System.out.println(chd);
		String inf = Login.logindata1(3, 8);
		System.out.println(inf);
		
		
		// Goto Login page
		try {driver.findElement(By.xpath("//*[@class='1c-1mpchac']")).click();			}
		catch(Exception e) {}
				HomePage.Myaccountdrpdwn(driver).click();
				Thread.sleep(500);
				HomePage.Loginlink(driver).click();
				Thread.sleep(500);
				
		// Login
		HomePage.username(driver).sendKeys(UserName);
		HomePage.password(driver).sendKeys(Password);
		HomePage.login(driver).click();
		Thread.sleep(500);
		
		try {
			//driver.findElement(By.xpath("//*[@class='1c-1mpchac']")).click();
			driver.findElement(By.xpath("//*[@class='e1mwfyk10 lc-4rgplc e1m5b1js0']")).click();
			}
		
		catch(Exception e) {}		
				
		HomePage.Hometab(driver).click();
		Thread.sleep(500);
		
		try {driver.findElement(By.xpath("//*[@class='1c-1mpchac']")).click();			}
		catch(Exception e) {}
		
		HomePage.flighttab(driver).click();
		HomePage.Roundtripradio(driver).click();
		
		boolean s1 = HomePage.FromCity(driver).isDisplayed();
		System.out.println(s1);
		
			
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement e = HomePage.FromCity(driver);
	    WebElement FromEle = wait.until(ExpectedConditions.elementToBeClickable(e));
	    FromEle.click();
	   // FromEle.clear();
	    ((WebElement) wait.until(ExpectedConditions.elementToBeClickable(e))).sendKeys("FRA");
	    
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//HomePage.FromCity(driver).sendKeys(Keys.ENTER);
		
	//	System.out.println("tab");
		HomePage.ToCity(driver).sendKeys(To);
		System.out.println("to");
		HomePage.ToCity(driver).sendKeys(Keys.ENTER);
		System.out.println("tab");
		HomePage.StartDate(driver).sendKeys(SDate);
		System.out.println("sdate");
		HomePage.ReturnDate(driver).sendKeys(RDate);
		System.out.println("rdate");
		HomePage.PaxA(driver).click();
		HomePage.PaxC(driver).click();
		HomePage.PaxI(driver).click();
		HomePage.Search(driver).click();
			
	}
	
	@AfterTest
	public void logout() {
	}
	

}
