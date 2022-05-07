package Athletevue;



import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObject.City;
import PageObject.State;


public class CityTest extends HomePage {


	@Test
	public void City_Page() throws Exception,InterruptedException, IOException
	{
		City ct= new City(driver);
		
		ct.click_nevigate_Menu().click();
		Thread.sleep(5000);
		
		ct.click_City_menu().click();
		Thread.sleep(5000);
		
		ct.click_Add_Button().click();
		Thread.sleep(5000);
		

		
		ct.getCityName().sendKeys("IND");

		ct.selectState().click();
		Thread.sleep(5000);
		ct.selectCountryValueFromDropdown("Oromia Region");
	    Thread.sleep(5000);
	    ct.click_Save().click();
		
	}
	
	
	
}
