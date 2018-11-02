package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tc002 {
	
	public WebDriver driver;
	@Test
	public  void Testcase()
	{

		System.setProperty("webdriver.chrome.driver","D:\\selenium files\\chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    String url = "http://automationpractice.com";
	    driver.get(url);

		   WebElement sighin= driver.findElement(By.className("login"));
		   sighin.click();
		   WebElement email= driver.findElement(By.id("email_create"));
		   email.sendKeys("Raghurawat111111111@gmail.com");
		
	}

}
