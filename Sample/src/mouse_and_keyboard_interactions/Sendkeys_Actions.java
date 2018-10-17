package mouse_and_keyboard_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sendkeys_Actions {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/jobs-internship");
		driver.manage().window().maximize();
		
		WebElement Course=driver.findElement(By.id("cValue"));
		Course.click();
		Thread.sleep(5000);
		
		//driver.findElement(By.cssSelector("select[id='eo'] > optgroup[label='Popular Courses'] > option[value='37']")).click();

		//Enable mouse and keyboard controls at automation browser
		Actions action=new Actions(driver);
		
		action.sendKeys(Keys.chord("MCA")).perform();
		Thread.sleep(5000);
		
		action.sendKeys(Keys.TAB).perform();
		
		
		//Send characters in Location Editbox
		action.sendKeys("HYD").perform();
		Thread.sleep(3000);
		action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		
		
		
		
	}

}
