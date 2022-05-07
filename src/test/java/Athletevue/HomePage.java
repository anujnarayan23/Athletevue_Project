package Athletevue;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.Country;
import PageObject.LoginPage;


public class HomePage extends Base {
	
public static WebDriver driver;
	



   
	public void Lounvh_Browser() throws IOException
	{
		
    	System.out.println("Lounvh_Browser Method calling");
        driver=InitializeDriver();
        driver.get(prop.getProperty("AppUrl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
	

	@Test(dataProvider="getData")
	public void Login(String UserName,String Password) throws IOException, InterruptedException
	{
		
		
    	Lounvh_Browser();
		
		LoginPage login= new LoginPage(driver);
		login.getEmailId().sendKeys(UserName);		
		login.GetPassword().sendKeys(Password);	
		login.btn_Login_Click().click();	
		
		Thread.sleep(5000);
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		
//		Object[][] data=new Object[2][2];
//		
//		data[0][0]="devganiyasantosh@gmail.com";
//		data[0][1]="santosh";
//	
//        data[1][0]="admin@mailinator.com";
//	    data[1][1]="admin@123";
//		
//	   return data;
	 return new Object[][]  {{"admin@mailinator.com","admin@123"}};
	}
	 



	
	

	

	
	
	
	

}
