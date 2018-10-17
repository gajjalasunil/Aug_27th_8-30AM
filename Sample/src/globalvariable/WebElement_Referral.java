package globalvariable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WebElement_Referral 
{

	public static void main(String[] args) 
	{
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		//Identfity Username location
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("Darshan@gmail.com");
		
		
		//Identify Password Location and store into referral
		WebElement password_editbox=driver.findElement(By.id("pass"));
		password_editbox.clear();
		password_editbox.sendKeys("Hello12345");
		
		
		//Identify Signin button locator
		By login_btn_locator=By.id("u_0_2");
		WebElement login_btn=driver.findElement(login_btn_locator);
		login_btn.click();
		
		
		
		

	}

}
