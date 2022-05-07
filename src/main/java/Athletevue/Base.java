package Athletevue;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//import io.github.bonigarcia.wdm.WebDriverManager;


public class Base {

public WebDriver driver;
public Properties prop;
	
	public WebDriver InitializeDriver() throws IOException
	{
		
		 prop=new Properties();
		 String filePath = System.getProperty("user.dir")+"/src/main/java/Athletevue/data.properties";
		
		FileInputStream files= new FileInputStream(filePath);
		
		prop.load(files);
		
		
		String BrowserName=prop.getProperty("Browser");
		
		if(BrowserName.equals("Chrome"))
		{
			
			WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver", "../santosh/ChromeDriver/chromedriver.exe");
			 driver=new ChromeDriver();
			 
			// WebDriverManager.chromedriver().setup();
			
		}
		return driver;
		
		
	}
}
