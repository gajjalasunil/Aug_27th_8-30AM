package org.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelect_Option_From_Multiple_Selection {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Example:--> Verify deselecting option from combobox
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
		
		
		//Select Multiple Option  [Max 3]
		Account_type.deselectAll();
		Account_type.selectByIndex(1);
		Account_type.selectByIndex(2);
		Account_type.selectByIndex(3);
		Thread.sleep(2000);
		
		System.out.println("Option Count before "
			+ "Deselection--> "+Account_type.getAllSelectedOptions().size());
		
		
		//Deselect Options
		Account_type.deselectByIndex(2);
		Thread.sleep(2000);
		
		System.out.println("Option Count After "
				+ "Deselection--> "+Account_type.getAllSelectedOptions().size());
			
		if(Account_type.getAllSelectedOptions().size()==2)
		{
			System.out.println("As expected Deseletion working on Multiple Selection");
		}
			
		else if(Account_type.getAllSelectedOptions().size()==3)
		{
			System.out.println("Testfail:--> Fail to deselect option");
		}
			
	}

}
