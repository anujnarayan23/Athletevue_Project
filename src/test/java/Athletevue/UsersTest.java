package Athletevue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObject.Templates;
import PageObject.Users;

public class UsersTest extends HomePage{

	
	@Test
	public void TestUser_Page() throws InterruptedException
	{
		 Users u=new  Users(driver);
		 
		 u.click_Nevigate().click();
		 
		 
		String AttributeName= u.getButtonAttribute().getAttribute("class").toString();
		
	
		System.out.println(AttributeName);
		
		if(AttributeName.contains("btn-success"))
		{
			u.Click_Toogle_DropDown().click();
			Thread.sleep(4000);
			u.Click_Block_User_Button().click();
		
		}
		else
		{
			u.Click_Toogle_DropDown().click();
			Thread.sleep(4000);
			u.Click_Active_User_Button().click();
		}
	}
	
	@Test(priority=1,enabled=false)
	public void handlingPagination() throws InterruptedException
	{
		
		

		Users u=new  Users(driver);
		 
		 u.click_Nevigate().click();
	     Thread.sleep(4000);

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
