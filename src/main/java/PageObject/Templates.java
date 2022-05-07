package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Templates {
	public WebDriver driver;
	
	
	@FindBy(id="images")
	WebElement UploadFile;
	

	@FindBy(xpath="//span[text()='Templates']")
	WebElement Nevigate_Menu;
	
     @FindBy(xpath="//*[text()='Add']")
     WebElement Add_Button;
     
    @FindBy(xpath="//*[text()='Submit']")
    WebElement btn_Save;
 	
	
	
	public Templates(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		
		// TODO Auto-generated constructor stub
	}
	
	public WebElement Click_On_Save_Button()
	{
		return btn_Save;
	}
	
	public WebElement click_Nevigate()
	{
		return Nevigate_Menu;
	}
	
	public WebElement Click_On_Add_Button()
	{
		return Add_Button;
	}
	
	public WebElement File_Upload()
	{
		return UploadFile;
	}

}
