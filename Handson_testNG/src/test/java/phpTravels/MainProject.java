package phpTravels;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjectModel.HomePage;

public class MainProject {
	
	WebDriver driver = null;
	WebDriver element = null;
	
	
	@BeforeTest
public void HomePage() throws IOException, InterruptedException {
		
		FileInputStream file = new FileInputStream(new File("C:\\Users\\Tamilselvi\\eclipse-workspace\\Handson_testNG\\src\\test\\java\\TestData.properties"));
		Properties prop = new Properties();
		prop.load(file);
		String url = prop.getProperty("URL");
		String url1 = prop.getProperty("URL1");
		
		System.out.println(url);
		
		System.setProperty("webdriver.chrome.driver", "F:\\Chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url1);
		Thread.sleep(3000);
		driver.manage().window().maximize();	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='#flights']")).click();
		//HomePage.homepage(element).click();
		
			
		
	}
	
	@Test
	public void Other() {
	}
	
	@AfterTest
	public void logout() {
	}
	

}
