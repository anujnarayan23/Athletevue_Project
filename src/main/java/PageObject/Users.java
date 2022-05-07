package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Users {


	public WebDriver driver;
	
	
	//By nevigate_menu=By.xpath("//*[@id='side-menu']/li[3]/a/span");

	@FindBy(xpath="//*[@id='side-menu']/li[3]/a/span")
	WebElement Nevigate_Menu;
	
	
	@FindBy(xpath="//*[@class='card-body']/table/tbody/tr[1]/td[12]/div/div[1]//button")
	WebElement Button_Class_Attribute;
	
	@FindBy(xpath="//*[@class='card-body']/table/tbody/tr[1]/td[12]/div/button")
	WebElement Toggle_DropDown;
	
	@FindBy(xpath="//*[@class='card-body']/table/tbody/tr[1]/td[12]/div/div[2]/a[1]")
	WebElement Active_User;
	
	
	@FindBy(xpath="//*[@class='card-body']/table/tbody/tr[1]/td[12]/div/div[2]/a[2]")
	WebElement Block_User;
	
	
	public Users(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	public WebElement click_Nevigate()
	{
		return Nevigate_Menu;
	}
	
	
	public WebElement Click_Toogle_DropDown()
	{
		return Toggle_DropDown;
	}
	
	public WebElement Click_Active_User_Button()
	{
		return Active_User;
		
	}
	

	public WebElement Click_Block_User_Button()
	{
		return Block_User;
		
	}
	
	
	public WebElement getButtonAttribute()
	{
		return Button_Class_Attribute;
	}
	
	
}

