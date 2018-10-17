package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_ExpectedConditonClass {

	public static void main(String[] args)
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		//Create object for Explicitwait
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleIs("Facebook – log in or sign up"));
		System.out.println("title verified at webpage");
		
		
		//Click link
		driver.findElement(By.linkText("Messenger")).click();
		
		
		//Manage timeout until expected url presented
		wait.until(ExpectedConditions.urlContains("https://www.messenger.com/"));
		System.out.println("Url verified fo messenger page");
		
	}

}
