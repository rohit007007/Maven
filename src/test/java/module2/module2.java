package module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import listeners.RealGuru99TimeReport;



@Listeners(RealGuru99TimeReport.class)
public class module2 {

	public String baseUrl = "https://www.facebook.com";
	 
	public String chromeDriverPath = "E:\\chromedriver.exe";	
		
		
	@BeforeTest
	public void setupConfiguration()
	{
	    System.setProperty("webdriver.chrome.driver", chromeDriverPath);	
	}

	
	
	
	@Test
	public void adbd()
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Facebook – log in or sign up");
	}
}
