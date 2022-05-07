package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Sports {

	
public WebDriver driver;
	
	By nevigate_menu=By.xpath("//*[@id='side-menu']/li[2]/a/i");
	By Sports_click_menu=By.xpath("//*[@id='side-menu']/li[2]/ul/li[4]/a/span");
	
	By Add_Button=By.xpath("//*[text()='Add']");
	By btn_Save=By.xpath("//*[text()='Submit']");
	
	public Sports(WebDriver driver2) {
		this.driver=driver2;
		// TODO Auto-generated constructor stub
	}

By SportName=By.xpath("//*[@formcontrolname='name']");	
	
	//@FindBy(xpath="//*[@formcontrolname='name']")
	//WebElement SportName;


By Edit_button=By.xpath("//table[contains(@class,'table-bordered')]/tbody/tr[1]/td[4]/i[1]");

By Delete_button=By.xpath("//table[contains(@class,'table-bordered')]/tbody/tr[1]/td[4]/i[2]");


public WebElement Click_on_Delete_Button()
{
	return driver.findElement(Delete_button);
}

public WebElement Click_On_Edit_Button()
{
	return driver.findElement(Edit_button);
}

	public WebElement click_Save()
	{
		
		return driver.findElement(btn_Save);
	}
	
	public WebElement GetSportName()
	{
		return  driver.findElement(SportName);
	}
	
	
	public WebElement click_nevigate_Menu()
	{
		return driver.findElement(nevigate_menu);
	}
	
	public WebElement click_Sports_click_menu()
	{
		return driver.findElement(Sports_click_menu);
	}
	
	

	public WebElement click_Add_Button()
	{
		
		return driver.findElement(Add_Button);
		
	}
	
	
}
