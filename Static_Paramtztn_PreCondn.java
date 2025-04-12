package Week6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Static_Paramtztn_PreCondn extends Static_Paramtztn_HW
{
	@Test
	public  void testexctn()
	
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
		inputField.sendKeys("Salesforce Automation by Vardhni");
  //Click save
        WebElement saveButton =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[.//button[normalize-space(text())='Save']]")));
        saveButton.click();
		
		}


	}


