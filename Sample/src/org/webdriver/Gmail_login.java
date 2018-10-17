package org.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_login {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
		
		//Email validation using sendkeys
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId")).sendKeys("qadarshan@gmail.com",Keys.ENTER);

		Thread.sleep(4000);
		
		//password validation using sendkeys
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("Hello12345"+Keys.ENTER);
		
		
	}

}
