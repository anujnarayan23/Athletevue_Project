package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class City {
	
	
	
	public WebDriver driver;
	

	
	
	By nevigate_menu=By.xpath("//*[@id='side-menu']/li[2]/a/i");
	By city_click_menu=By.xpath("//*[@id='side-menu']/li[2]/ul/li[3]/a/span");
	
	
	By Add_Button=By.xpath("//*[text()='Add']");

	
    By CityName=By.xpath("//*[@formcontrolname='name']");
	
	By btn_Save=By.xpath("//*[text()='Submit']");

	
	//By SelectState = By.xpath("//*[@id='stateId']");
	By SelectState = By.xpath("//*[@id='stateId']/div/div/div[3]/input");
	
	By SelectStatevalue=By.cssSelector("div[class='ng-input'] > input");
//	div[class='ng-input'] > input
	
	public City(WebDriver driver2) {
		this.driver=driver2;
		// TODO Auto-generated constructor stub
	}
	
	public WebElement click_Save()
	{
		
		return driver.findElement(btn_Save);
	}
	
	public WebElement getCityName()
	{
		return driver.findElement(CityName);
	}
	
	public WebElement selectValueFromCity()
	{
		return driver.findElement(SelectStatevalue);
	}

    public WebElement selectState()
    {
    	return driver.findElement(SelectState);
    }
    
    public void selectCountryValueFromDropdown(String text) throws Exception
    {
    	selectValueFromCity().sendKeys(text);
    	Thread.sleep(3000);
    	selectValueFromCity().sendKeys(Keys.DOWN);
    	selectValueFromCity().sendKeys(Keys.ENTER);
    }
    
    public void selectCountryValue(String text)
    {   	
    	driver.findElement(By.xpath("(//span[text()='"+text+"'])[2]")).click();
    }

	
	
	public WebElement click_nevigate_Menu()
	{
		return driver.findElement(nevigate_menu);
	}
	
	public WebElement click_City_menu()
	{
		return driver.findElement(city_click_menu);
	}
	
	

	public WebElement click_Add_Button()
	{
		return driver.findElement(Add_Button);
		
	}
	
	

	
}
