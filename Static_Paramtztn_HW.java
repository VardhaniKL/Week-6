package Week6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Static_Paramtztn_HW 
{
	
	WebDriver driver;
	@Parameters({"url","username","password"})
	
	@BeforeMethod
	public  void PreCondition(String site,String uname, String pwd)
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		
		//Disable notifications
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-notifications");
				options.addArguments("--incognito");
				//ChromeDriver driver = new ChromeDriver(options);
				
				//Launch website
			    driver.get(site);
	   // Enter username password
				driver.findElement(By.id("username")).clear();
				driver.findElement(By.id("username")).sendKeys(uname);
				driver.findElement(By.id("password")).clear();
				driver.findElement(By.id("password")).sendKeys(pwd);
				driver.findElement(By.id("Login")).click();	 
	}		
		@AfterMethod
		public void postCondn()
		{
			driver.quit();
		}
		

		
		@DataProvider(name="giveValues")
		public String[][] DynamicParam()
		{
			String[][] a=new String[3][1];
			a[0][0]="Vardhani";
			a[1][0]="Shankar";
			a[2][0]="Adithya Bhargav";

		    return a;
		}
		

}
