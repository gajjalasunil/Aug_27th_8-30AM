package browser_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_launch_With_Webdriver 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Webdriver is a common interface class it can manipulate
		 * all browser instances supported by selenium-webdriver;
		 * 
		 * 	Note:--> Webdriver interface contains set of methods
		 * 			to run diff browsers..
		 */
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		
		/*
		 * Step1:-->   Enter Email 
		 * Step2:-->   Enter password
		 * Step3:-->   click Login button
		 */
		
		//Identify location and enter text into email editbox
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("9030248855");
	
		//Identif location and enter text into password editbox
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys("Hello12345");
		
		//Identify location and click on login button
		driver.findElement(By.id("u_0_2")).click();
	}

}
