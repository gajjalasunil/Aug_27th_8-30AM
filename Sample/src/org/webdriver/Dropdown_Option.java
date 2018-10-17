package org.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Option 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://leads.hdfcbank.com/applications/new_webforms/apply/credit-card/Index.aspx?");
		
		//Select Dropdown using visible text
		new Select(driver.findElement(By.id("ddlCity")))
		.selectByVisibleText("PUNE");
		
		
		new Select(driver.findElement(By.id("ddlAddrProof")))
		.selectByVisibleText("Passport copy");
		
		//Selectby value
		new Select(driver.findElement(By.id("ddlEmpType")))
		.selectByValue("Salaried");
		
		//select option using index number
		new Select(driver.findElement(By.id("ddlNetIncome")))
		.selectByIndex(3);
		
		
		
		//Select Radio button
		driver.findElement(By.id("accHolderN")).click();
		
		
		
		/*
		 * Write decision statement to verify checkbox selection
		 * before click.
		 */
		
		//Select Checkbox
		if(!driver.findElement(By.id("chkAuthorize")).isSelected())
		{
			driver.findElement(By.id("chkAuthorize")).click();
		}
		
		
		
	}

}
