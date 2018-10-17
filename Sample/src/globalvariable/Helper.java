package globalvariable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helper 
{
	WebDriver driver=null;
	String url=null;
	String uid=null;
	String pwd=null;
	
	public void launchBrowser()
	{
		driver=new ChromeDriver();
	
	}
	
	public void loadApp()
	{
		driver.get(url);
	}
	
	
	public void Signin()
	{
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(uid);
		
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(pwd);
		
	}

}
