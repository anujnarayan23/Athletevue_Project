package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Country  {

	
	public WebDriver driver;
	
	
	
	//By nevigate_menu=By.xpath("//*[@id=\"side-menu\"]/li[2]/a/i[2]");

	
	By Country_click_menu=By.xpath("//*[@id=\"side-menu\"]/li[2]/ul/li[1]/a/span");
	
	By nevigate_menu=By.xpath("//*[@id='side-menu']/li[2]/a/i");
			//*[@id="side-menu"]/li[2]/ul/li[1]/a/span
	
	By Add_Button=By.xpath("//*[text()='Add']");
	//*[@id="side-menu"]/li[2]/a/i[2]
	
	public Country(WebDriver driver2) {
		this.driver=driver2;
		// TODO Auto-generated constructor stub
	}
	
	By SortName=By.xpath("//*[@formcontrolname='sortName']");
	By Name=By.xpath("//*[@formcontrolname='name']");
	By PhoneCode=By.xpath("//*[@formcontrolname='phoneCode']");
	By btn_Save=By.xpath("//*[text()='Submit']");
	

	By Edit_button=By.xpath("//table[contains(@class,'table-bordered')]/tbody/tr[1]/td[5]/i[1]");
	
	By Delete_button=By.xpath("//table[contains(@class,'table-bordered')]/tbody/tr[1]/td[5]/i[2]");
	
	
	   By ClickonDropDown=By.xpath("//*[contains(@class,'custom-select ')]");
	
	   
	  
	public WebElement Click_on_Delete_Button()
	{
		return driver.findElement(Delete_button);
	}
	
	public WebElement Click_on_DropDown()
	{
		return driver.findElement(ClickonDropDown);
	}
	
	   
	public WebElement Click_On_Edit_Button()
	{
		return driver.findElement(Edit_button);
	}
	
	public WebElement click_menu_Country()
	{
		return driver.findElement(Country_click_menu);
	}
	
	public WebElement getName()
	{
		
		return driver.findElement(Name);
	}
	
	public WebElement getSortName()
	{
		
		return driver.findElement(SortName);
	}
	
	public WebElement getPhoneCode()
	{
		
		return driver.findElement(PhoneCode);
	}
	
	public WebElement click_Save()
	{
		
		return driver.findElement(btn_Save);
	}
	

	
	public WebElement click_Nevigate()
	{
		
		return driver.findElement(nevigate_menu);
	}
	
	
	public WebElement click_Add_Country()
	{
		
		return driver.findElement(Add_Button);
	}
	
	
	
}
