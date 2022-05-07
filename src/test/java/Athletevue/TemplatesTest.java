package Athletevue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObject.Templates;

public class TemplatesTest extends HomePage {

	
	@Test
	public void Templates_Page() throws InterruptedException, IOException
	{
		
		
		Templates T= new Templates(driver);
		T.click_Nevigate().click();
		Thread.sleep(5000);
		T.Click_On_Add_Button().click();
		T.File_Upload().sendKeys("C:\\Users\\Santosh Devganiya\\Desktop\\sagar\\20210611_113207 (1).jpg");
		T.Click_On_Save_Button().click();
        System.out.println("File is Uploaded Successfully");
	}
	
	@Test(priority=1,enabled=false)
	public void handlingPagination() throws InterruptedException
	{
		
		

		Templates T= new Templates(driver);
		T.click_Nevigate().click();
		Thread.sleep(5000);

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
