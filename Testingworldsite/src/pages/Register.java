package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Register

{
	
	@FindBy (xpath="//*[@id='jform_name']")  WebElement name;
	@FindBy (xpath="//*[@id='jform_username']")  WebElement username;
	@FindBy (xpath= "//*[@id='jform_password1']")  WebElement password;
	@FindBy (xpath= "//*[@id='jform_password2']")  WebElement confirmpassword;
	@FindBy (xpath="//*[@id='jform_email1']")  WebElement emailaddress;
	@FindBy(xpath="//*[@id='jform_email2']")  WebElement  confirmemailaddress;
	@FindBy (xpath="//*[@id='member-registration']/div/button") WebElement Register;
	@FindBy (xpath="//*[@id='ja-search']/ul/li[2]/a") WebElement Registeration;
	
	
	
	
	
	public void clickonregistration()
	{
		
		Registeration.click();
	}
	
	
	
	public void entername ()
	{
		
		name.sendKeys("kuldeep");
	}
	
	public void  enterusername()
	{
		username.sendKeys("kuldeep");
	}
	public void  enterpassword()
	
	{   
		password.sendKeys("puneetbhai");
		
	}
	
	public void  enterconfirmpassword()
	{
		confirmpassword.sendKeys("puneetbhai");
		
	}
	
	public void  enteremailaddress()
	{
		emailaddress.sendKeys("kuldeepyadav@gmail.com");
	}
	public void  enterconfirmemailaddress()
	
	{
		confirmemailaddress.sendKeys("kuldeepyadav@gmail.com");
		
	}
	
	public void clickonregister()
	{
		Register.click();
		
	}

}
