package switchcommands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Alert 
{

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Testcase:-->
		 * 			Verify Job search functionality without enter proper Data
		 * Steps:-->
		 * 			Launch and load webpage
		 * 			click Search button Without Enter Data
		 * Expected:-->
		 * 			System should prompt  appropriate error msg.
		 */
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/jobs-internship");
		driver.manage().window().maximize();
		
		//Identify search button location
		WebElement Search_btn=driver.findElement(By.cssSelector("input[value='Search']"));
		Search_btn.click();
		Thread.sleep(5000);
		
		//Switch to Alert
		Alert alert=driver.switchTo().alert();
		
		//Get text on alert window
		String Alert_msg=alert.getText();
		System.out.println(Alert_msg);
		
		//Close Alert window
		alert.accept();
		
		
		/*
		 * gettext on alert window
		 * 		driver.switchTo().alert().getText();
		 * 
		 * Accept Alert    [It's close alert window]
		 * 		driver.switchTo().alert().accept();
		 * 
		 * dismiss Alert   [it's close alert window]
		 * 		driver.switchTo().alert().dismiss();
		 * 
		 * Send text on Alert window  [on prompt windows]
		 * 		driver.switchTo().alert().Sendkeys();
		 */
		
		
		
		/*
		 * Alert Exception:-->
		 * 		1. NoAlertPresentedException
		 * 		2. UnhandledalertException
		 */
		
		/*
		 * Note:--> WebDriver support partial handling on alerts.
		 * 			Same code we can use for all alerts at webpages.
		 */
		
		
		
		
		
		
	}

}
