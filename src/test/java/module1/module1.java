package module1;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.Listeners;

import listeners.RealGuru99TimeReport;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;


@Listeners(RealGuru99TimeReport.class)
public class module1 {

public String baseUrl = "https://www.freecrm.com/index.html";
 
public String chromeDriverPath = "E:\\chromedriver.exe";	
	
	
@BeforeTest
public void setupConfiguration()
{
    System.setProperty("webdriver.chrome.driver", chromeDriverPath);	
}
	
	
	@Test
	public void abc()
	{
	WebDriver driver = new ChromeDriver();
	driver.get(baseUrl);
	String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals(title, "#1 Free CRM software in the cloud for sales and service");
	}
}
