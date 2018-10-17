package globalvariable.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Global_locators 
{
	
	WebDriver driver=null;
	String url=null;
	String uid=null;
	String pwd=null;
	
	By uid_locator=By.id("email");
	By pwd_locator=By.id("pass");
	By login_btn_locator=By.id("loginbutton");
	
	WebElement Uid_element=null;
	WebElement pwd_element=null;
	WebElement login_btn_element=null;
	
	
	public void User_signin()
	{
		Uid_element=driver.findElement(uid_locator);
		Uid_element.clear();
		Uid_element.sendKeys(uid);
		
		pwd_element=driver.findElement(pwd_locator);
		pwd_element.clear();
		pwd_element.sendKeys(pwd);
		
		login_btn_element=driver.findElement(login_btn_locator);
		//login_btn_element.click();
	}
	
	
	

}
