package testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.annotations.Test;
import webdrivereventlistener.driverupdate;

public class TC001  
{
	
public WebDriver driver;
	
	@Test
	
	
	public void startbrowser()
	{

		System.setProperty("webdriver.chrome.driver","D:\\selenium files\\chromedriver.exe");
         driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		EventFiringWebDriver eventdriver = new EventFiringWebDriver(driver);
		driverupdate listener = new driverupdate();
		eventdriver.register(listener);
	     eventdriver.navigate().to("http://www.thetestingworld.com");
		
		}
	
	
	
	
	
	
	
	

}
