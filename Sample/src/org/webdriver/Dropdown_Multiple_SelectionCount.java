package org.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Multiple_SelectionCount 
{

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Example:--> Verify Mutiple selecton dropdown count.
		 * Testcase:--> Dropdown maximum selection count is 2
		 */
		
		//Select Multiple Options under dropdown
		WebDriver driver=new ChromeDriver();
		driver.get("http://content.icicidirect.com/idirectcontent/Home/Home.aspx");
		driver.manage().window().maximize();
				
		//Convert Dropdown to multiple selection state using javascript.
		((JavascriptExecutor)driver).executeScript
		("document.getElementById('open_account').setAttribute('multiple','multiple')");
		Thread.sleep(5000);
		
		
		//Target dropdown element
		WebElement Account_open=driver.findElement(By.id("open_account"));
		//Target Element with select class
		Select Account_type=new Select(Account_open);
				
		
		//Select Multiple Options at Combobox
		Account_type.deselectAll();
		Account_type.selectByIndex(1);
		Account_type.selectByIndex(2);

		
		//verify Selection count
		if(Account_type.getAllSelectedOptions().size() == 2)
		{
			System.out.println("Testpass Allowed  maximum options as expected");
		}
		else if(Account_type.getAllSelectedOptions().size() > 2)
		{
			System.out.println("TestFail Allowed more than maximum option");
		}
				

	}

}
