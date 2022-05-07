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
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import PageObject.Skills;
import PageObject.Sports;

public class SkillsTest extends HomePage {

	 

	@Test(priority=1,enabled=false)
	public void Skills_Page() throws InterruptedException, IOException
	{
		Skills sk=new Skills(driver);
	
		 sk.click_nevigate_Menu().click();
		 sk.click_Sports_click_menu().click();
		 Thread.sleep(4000);
		 sk.click_Add_Button().click();
		 Thread.sleep(4000);
		 sk.GetSkillName().sendKeys("KETAN");
		
		 sk.click_Save().click();
		 System.out.println("finally"); 
		 
		 Thread.sleep(3000);
		
	}
	
	@Test(priority=2,enabled=false)
	public void Update_Skils() throws InterruptedException
	{
		Skills sk=new Skills(driver);	 
		 sk.Click_On_Edit_Button().click();
		 Thread.sleep(3000);
		 sk.GetSkillName().clear();
		 Thread.sleep(3000);
		 sk.GetSkillName().sendKeys("RAHUL");
		 Thread.sleep(3000);
		 sk.click_Save().click();
		 System.out.println("Updated Successfully"); 	
	}
	
	
	@Test(priority=3,enabled=false)
	public void Delete_Skills() throws InterruptedException
	{
		   Skills sk=new Skills(driver);
		    sk.Click_on_Delete_Button().click();
		 	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 	Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		 	alert.accept();
		 	Alert alert_box = driver.switchTo().alert();
		 	driver.switchTo().alert().dismiss();
		 	 Thread.sleep(5000);
		 	driver.switchTo().alert().accept();
		 	alert_box.accept(); 

		   // WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(30));
		//  Alert alert1 = wait1.until(ExpectedConditions.alertIsPresent());
		 //	alert1.accept();
		 	
	}
	
	@Test
	public void handlingPagination() throws InterruptedException
	{
		
		
		Skills sk=new Skills(driver);
		
		 sk.click_nevigate_Menu().click();
		 sk.click_Sports_click_menu().click();
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
			
			Thread.sleep(5000);
			
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
