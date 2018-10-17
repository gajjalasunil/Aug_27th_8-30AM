package validationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsDisplayed_For_Static_Elements 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com/");
		driver.manage().window().maximize();
		
		
		//Identify Email Editbox
		WebElement Email_eb=driver.findElement(By.id("identifierId"));
		if(Email_eb.isDisplayed() && Email_eb.isEnabled())
		{
			Email_eb.clear();
			Email_eb.sendKeys("qadarshan@gmail.com");
		}
		else
			System.out.println("Element not displayed or enabled");
		
		
		/*
		 * Exceptions:-->
		 * 			InvalidElemnetstateException  ----> On Disable elements
		 * 			ElementNotvisible             ----> On hidden elements
		 */
		
		
		
		
		//click Next button
		WebElement Next_btn=driver.findElement(By.xpath("//span[contains(.,'Next')]"));
		if(Next_btn.isDisplayed() &&  Next_btn.isEnabled())
		{
			Next_btn.click();
		}
		else
			System.out.println("Element not visible or enabled");
		
		
		
		
		

	}

}
