package Week6;

import java.lang.reflect.Array;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;




import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicPrmtzn extends Static_Paramtztn_HW

{
//	@Parameters({"url", "username", "password"})
//    @BeforeMethod
//    public void preCond(String site, String uname, String pwd)
//	{
//        PreCondition(site, uname, pwd);  // Call method from base class
//    }  	

//	@DataProvider(name="giveValues")
//	public Object[][] DynamicParam()
//	{
//		Object[][] a=new Object[1][1];
//		a[0][0]="Vardhani";
//	
//		return a;
//	}
	
	@Test(dataProvider="giveValues")
	public void DynamicTesting (String name)
	
	{
		
		//Click on the toggle menu button from the left corner 
		
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				WebElement appLauncher =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@title='App Launcher']")));
				appLauncher.click();
		     
		//Click view all
				WebElement viewAll=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'View All')]")));
		       viewAll.click();

		//Click Legal entity
		       WebElement legalEntity=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[.//p[normalize-space(text())='Legal Entities']]")));
		       legalEntity.click();
		       
		 //Click Dropdown
		       WebElement dd=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[.//div[normalize-space(text())='New']]")));
		       dd.click();
		       
		  //Enter name
				WebElement inputField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='Name']")));
				inputField.sendKeys(name);
		  //Click save
		        WebElement saveButton =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[.//button[normalize-space(text())='Save']]")));
		        saveButton.click();
		        
		     
				
				}


	}


