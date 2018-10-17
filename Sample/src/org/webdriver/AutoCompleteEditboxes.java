package org.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoCompleteEditboxes
{

	public static void main(String[] args) throws Exception
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("FromTag")).clear();
		driver.findElement(By.id("FromTag")).sendKeys("HYD");
		Thread.sleep(4000);
		driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
		
		driver.findElement(By.id("ToTag")).clear();
		driver.findElement(By.id("ToTag")).sendKeys("DEL");
		Thread.sleep(4000);
		driver.findElement(By.linkText("New Delhi, IN - Indira Gandhi Airport (DEL)")).click();

		//select data from datepicker
		driver.findElement(By.linkText("19")).click();
		
		//Type Date into departure editbox..
		driver.findElement(By.id("DepartDate")).clear();
		driver.findElement(By.id("DepartDate")).sendKeys("Wed, 12 Dec, 2018");
		
		
		//Select Dropdown option
		new Select(driver.findElement(By.name("adults")))
		.selectByVisibleText("5");
		
		
		//Click link with partial linkname
		driver.findElement(By.partialLinkText("Class of travel, Airline preference")).click();
		
		//Click search button
		driver.findElement(By.id("SearchBtn")).click();
		
		
		
	}

}
