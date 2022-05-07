package Athletevue;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import PageObject.Country;
import PageObject.Skills;

public class CountryTest extends HomePage  {

	
	 
	
	 
	@Test(priority=1,enabled=true,groups= {"Regression"})
	public void Country_Page() throws InterruptedException, IOException
	{
		Country con= new Country(driver);
		
	 
		con.click_Nevigate().click();
		Thread.sleep(3000);
		
		con.click_menu_Country().click();
		Thread.sleep(3000);
		
		con.click_Add_Country().click();
		
	    con.getSortName().sendKeys("SAN");
	    con.getName().sendKeys("SANTOSH");
    	con.getPhoneCode().sendKeys("10023");
	    con.click_Save().click();
	    
	}
	
	
	@Test(priority=2,enabled=false)
	public void Update_Country() throws InterruptedException
	{
			
		 Country con= new Country(driver);
			
		 
	    con.click_Nevigate().click();
	    Thread.sleep(3000);	
     	con.click_menu_Country().click();
		Thread.sleep(3000);
			
		con.Click_On_Edit_Button().click();	
		con.getName().clear();
	 	con.getName().sendKeys("SAN");	
	 	Thread.sleep(3000);
	 	con.click_Save().click();
	}
	
	@Test(priority=1,enabled=false)
	public void Delete_Country() throws InterruptedException
	{
		
	
		  Country con= new Country(driver);
		
			
		   con.click_Nevigate().click();
			Thread.sleep(3000);

			con.click_menu_Country().click();
		   Thread.sleep(3000);

		
		 	con.Click_on_Delete_Button().click();
		 	Thread.sleep(5000);
	    
		
		 	
		 	
		// 	driver.switchTo().alert().accept();		
		 
		 driver.switchTo().alert().dismiss();
		 	//alert_box.accept(); 

			System.out.println("call the Delete_Country");
		
	}
	
	
	@Test(priority=1,enabled=false)
	public void handlingPagination() throws InterruptedException
	{
		
		
		Country con= new Country(driver);
		
		  con.click_Nevigate().click();
			Thread.sleep(3000);
			
			con.click_menu_Country().click();
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

	@Test(enabled=true,groups= {"Regression"})
	public void ItemPerPage() throws InterruptedException
	{
		
		
		 Country con= new Country(driver);
		
		  con.click_Nevigate().click();
			Thread.sleep(3000);
			
			con.click_menu_Country().click();
			   Thread.sleep(3000);
 
				Select ItemPerPage=new Select(driver.findElement(By.xpath("//*[contains(@class,'custom-select')]")));
			
				
				List<WebElement> TotalNumberofRecords= driver.findElements(By.cssSelector(".table-bordered > tbody >tr >td:nth-child(2)"));
				
				if(TotalNumberofRecords.size()==10)
				{
					ItemPerPage.selectByValue("25");
				}
				else if(TotalNumberofRecords.size()==25)
				{
					ItemPerPage.selectByValue("50");
				}
				else 	
				{
					ItemPerPage.selectByValue("100");
				}
			   
	}
	
	
}
