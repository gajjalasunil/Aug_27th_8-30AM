package org.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Multiple_Selection 
{

	public static void main(String[] args) throws Exception 
	{
		/*;
		 * verify dropdown Multiple Selection State.
		 */
			
		//Select Multiple Options under dropdown
		WebDriver driver=new ChromeDriver();
		driver.get("http://content.icicidirect.com/idirectcontent/Home/Home.aspx");
		driver.manage().window().maximize();
		
		
		//Target File location
		WebElement Open_Account=driver.findElement(By.id("open_account"));
		boolean flag=new Select(Open_Account).isMultiple();
		System.out.println("Multiple selection state is  ==> "+flag);
		
		Thread.sleep(5000);
		
		
		//Convert Single option dropdown to multiple option dropdown using javascript
		((JavascriptExecutor)driver)
		.executeScript("document.getElementById('open_account').setAttribute('multiple','multiple')");
		Thread.sleep(5000);
		
		
		boolean flag1=new Select(Open_Account).isMultiple();
		System.out.println("Multiple selection state is  ==> "+flag1);
		
		
		//Select Multiple Options in Dropdown
		if(flag1==true)
		{
			Select OpenAccount_Selector=new Select(Open_Account);
			OpenAccount_Selector.deselectAll();
			
			//Select multiple options
			OpenAccount_Selector.selectByIndex(1);
			OpenAccount_Selector.selectByIndex(2);
		}
		

	}

}
