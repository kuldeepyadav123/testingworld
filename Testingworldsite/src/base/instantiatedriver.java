package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import listener.driverupdate;

public class instantiatedriver 


{
	public WebDriver driver;
	
	@BeforeClass
	
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
	
	@AfterClass
	
	public void closebrowser()
	{
		
		//driver.close();
		
		
	}
	

	
	
	
	
	
	

}
