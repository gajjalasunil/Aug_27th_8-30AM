package org.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Link {

	public static void main(String[] args) 
	{
		
		//launch browser and load webpage
		WebDriver driver=new ChromeDriver();
		driver.get("http://cleartrip.com");
		
		//Under footer_navigation link click Aboutus link
		driver.findElement(By.linkText("About Us")).click();
		
		//Click jobs click at aboutus page
		driver.findElement(By.linkText("Jobs")).click();
		
		//click job openings links at webpage
		driver.findElement(By.linkText("Job Openings")).click();
		
		//Click link using partial name
		driver.findElement(By.partialLinkText("Writer and Editor – Activities")).click();
		
		//click Apply link
		driver.findElement(By.linkText("Apply now")).click();

	}

}
