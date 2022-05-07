package Athletevue;



import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObject.Country;
import PageObject.State;


public class StateTest extends HomePage {


	@Test
	public void State_Page() throws Exception
	{
		
		State st= new State(driver);
		
		st.click_nevigate_Menu().click();
		Thread.sleep(3000);
		
		st.click_State_click_menu().click();
		Thread.sleep(3000);
		
		st.click_Add_Button().click();
		Thread.sleep(2000);
		
		st.getStateName().sendKeys("IND");

		st.selectCountry().click();
		Thread.sleep(3000);
		st.selectCountryValueFromDropdown("Albania");
		Thread.sleep(3000);
 		st.click_Save().click();
		
	}
	
	
	@Test(priority=1,enabled=false)
	public void handlingPagination() throws InterruptedException
	{
		
		
	    State st= new State(driver);
		
		st.click_nevigate_Menu().click();
		Thread.sleep(3000);
		
		st.click_State_click_menu().click();
		Thread.sleep(3000);

		List<WebElement> TotalNumberofRecords= driver.findElements(By.cssSelector(".table-bordered > tbody >tr >td:nth-child(2)"));
		
		List<String> Skills_Name= new ArrayList<String>();
		
		for(WebElement web: TotalNumberofRecords)
		{
			Skills_Name.add(web.getText());
		}
		
		
		
		String nextButtonClass=driver.findElement(By.cssSelector("#example1_paginate >ul > li:nth-child(8)")).getAttribute("class");
		
		
		int Totalcountsum=0;
		int i=2;
		while(!nextButtonClass.contains("disabled"))
		{
			
			Totalcountsum=0;
			driver.findElement(By.cssSelector("#example1_paginate >ul > li:nth-child(8)")).click();
			
			Thread.sleep(3000);
			
			TotalNumberofRecords= driver.findElements(By.cssSelector(".table-bordered > tbody >tr >td:nth-child(2)"));

			for(WebElement web: TotalNumberofRecords)
			{
				Skills_Name.add(web.getText());
			}
			
			 nextButtonClass=driver.findElement(By.cssSelector("#example1_paginate >ul > li:nth-child(8)")).getAttribute("class");
			 Totalcountsum=Totalcountsum+Skills_Name.size();
				
		}	
		
		
		System.out.println(Skills_Name.size());
		
		int totalSkillName=Skills_Name.size();
       
		Assert.assertEquals(totalSkillName, Totalcountsum);
		
	}

	
	
}
