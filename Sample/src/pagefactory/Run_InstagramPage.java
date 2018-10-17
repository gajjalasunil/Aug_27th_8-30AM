package pagefactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Run_InstagramPage {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://instagram.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Identify location using factory class
		Instagram_Signup signup=PageFactory.initElements(driver, Instagram_Signup.class);
		
		String mobile="9655478542";
		String fullname="Ashok raj";
		String username="Ashok";
		String password="hello1234";
		signup.user_reg(mobile, fullname, username, password);
		
		signup.Signup_button.click();
		

	}

}
