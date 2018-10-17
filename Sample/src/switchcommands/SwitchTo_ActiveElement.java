package switchcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_ActiveElement 
{

	public static void main(String[] args) throws Exception 
	{
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/jobs-internship");
		driver.manage().window().maximize();
		
		
		//Identify Course Listbox
		WebElement Course=driver.findElement(By.name("course"));
		Course.click();
		Thread.sleep(5000);
		
		driver.switchTo().activeElement().sendKeys("MCA",Keys.TAB);
		
		
		

	}

}
