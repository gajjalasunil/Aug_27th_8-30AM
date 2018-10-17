package framework_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Method_Assert_StateMents 
{
	public WebDriver driver;
	public String url="http://facebook.com";
	
	@Test(priority=0)
	public void load_webpage()
	{
		driver.get(url);
		boolean flag=driver.getTitle().contains("Facebook1");
		Assert.assertTrue(flag);
		Reporter.log("Expected Element visible at webpage");
	}
	
	
	@Test(priority=1)
	public void Messenger_link()
	{
		driver.findElement(By.linkText("Messenger")).click();
		Assert.assertEquals(driver.getTitle(), "Messenger");
		Reporter.log("Messenger title displayed at webpage");
	}
	
	
	
	@BeforeClass
	public void launch_browser()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
}
