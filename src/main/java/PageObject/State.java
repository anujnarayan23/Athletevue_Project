package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class State {
	
	
	
	public WebDriver driver;
	

	
	
	By nevigate_menu=By.xpath("//*[@id='side-menu']/li[2]/a/i");
	By State_click_menu=By.xpath("//*[@id='side-menu']/li[2]/ul/li[2]/a/span");
	
	By Add_Button=By.xpath("//*[text()='Add']");

	
    By StateName=By.xpath("//*[@formcontrolname='name']");
	
	By btn_Save=By.xpath("//*[text()='Submit']");

	
	By SelectCountry = By.xpath("//*[@id='countryId']");
//	By SelectCountryvalue = By.xpath("//*[@id=\"countryId\"]/div/div/div[3]/input");
	
	By SelectCountryvalue = By.cssSelector("div[class='ng-input'] > input");
	
	
	//*[@id="countryId"]/div/div/div[3]/input
	
	
	
	public State(WebDriver driver2) {
		this.driver=driver2;
		// TODO Auto-generated constructor stub
	}
	
	public WebElement click_Save()
	{
		
		return driver.findElement(btn_Save);
	}
	
	public WebElement getStateName()
	{
		return driver.findElement(StateName);
	}
	
	public WebElement selectValueFromCountry()
	{
		return driver.findElement(SelectCountryvalue);
	}

    public WebElement selectCountry()
    {
    	return driver.findElement(SelectCountry);
    }
    
    public void selectCountryValueFromDropdown(String text) throws Exception
    {
    	selectValueFromCountry().sendKeys(text);
    	Thread.sleep(3000);
    	selectValueFromCountry().sendKeys(Keys.DOWN);
    	selectValueFromCountry().sendKeys(Keys.ENTER);
    }
    
    public void selectCountryValue(String text)
    {   	
    	driver.findElement(By.xpath("(//span[text()='"+text+"'])[2]")).click();
    }

	
	
	public WebElement click_nevigate_Menu()
	{
		return driver.findElement(nevigate_menu);
	}
	
	public WebElement click_State_click_menu()
	{
		return driver.findElement(State_click_menu);
	}
	
	

	public WebElement click_Add_Button()
	{
		System.out.println("State click_Add_Button ");
		return driver.findElement(Add_Button);
		
	}
	
	

	
}
