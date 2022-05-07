package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	
	

	public WebDriver driver;
	
	
	By emailid=By.xpath("//*[@formcontrolname='userName']");
	
	By password=By.xpath("//*[@formcontrolname='password']");
	
	By btnLogin=By.cssSelector(".btn-submit");
	
	
	public LoginPage(WebDriver driver2) {
		this.driver=driver2;
		// TODO Auto-generated constructor stub
	}


	public WebElement getEmailId()
	{
	return	driver.findElement(emailid);
		
	}
	
	
	public WebElement GetPassword()
	{
		
		return driver.findElement(password);
	}
	
	public WebElement btn_Login_Click()
	{
		
		return driver.findElement(btnLogin);
	}
}
