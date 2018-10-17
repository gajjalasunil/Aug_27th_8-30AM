package mouse_and_keyboard_interactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover_Actions {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://hdfcbank.com");
		driver.manage().window().maximize();
			
			
		//IDentify location
		WebElement Products_menu=driver.findElement(By.linkText("Products"));
		//create object for mouseinteractions class
		Actions action=new Actions(driver);
		action.moveToElement(Products_menu).perform();
			
			
		//Identify submenu
		WebElement Cards_sumenu=driver.findElement(By.linkText("Cards"));
		action.moveToElement(Cards_sumenu).perform();
			
		//Identify link 
		WebElement Credit_card_link=driver.findElement(By.linkText("Credit Cards"));
		Credit_card_link.click();

	}

}
