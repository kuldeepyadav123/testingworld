package testcases;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import base.instantiatedriver;
import listener.driverupdate;
import pages.Register;
import listener.driverupdate;
public class TC001 extends instantiatedriver
{
	@Test
	public void registration()
	{
	Register  reg = PageFactory.initElements(driver,Register.class); 
	
	
	

	
reg.clickonregistration();
	reg.entername();
	reg.enterusername();
	reg.enterpassword();
	reg.enterconfirmpassword();
	reg.enteremailaddress();
	driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	reg.enterconfirmemailaddress();
	reg.clickonregister();

	
	
	
	}
	

}
