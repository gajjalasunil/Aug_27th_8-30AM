package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Runtime_Page_OutterText 
{

	public static void main(String[] args) throws Exception
	{
		/*
		 * Testcase:--> Verify gmail email validation with invalid domain name
		 * Steps;-->
		 * 			Launch chromebrowser
		 * 			load Gmail homepage
		 * 			Enter invalid domain name 
		 * 			click Next button
		 * Expected:-->
		 * 			System should throw appropriate error msg.
		 */
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.gmail.com/");
		driver.manage().window().maximize();
		
		//Verify Gmail Homepage
		if(driver.getTitle().equals("Gmail"))
		{
			
			System.out.println("gmail homepage verified");
			//Enter invalid email with invalid domain
			WebElement Signin_email_eb=driver.findElement(By.id("identifierId"));
			Signin_email_eb.clear();
			Signin_email_eb.sendKeys("sunilreddy.gajjala@outlook.com",Keys.ENTER);
			Thread.sleep(5000);
			
			String Exp_text="Couldn't find your Google Account";
			//Verify above text visible at webpage
			String PageVisible_Text=driver.findElement(By.tagName("body")).getText();
			
			//Verify page visible text contains expected text
			if(PageVisible_Text.contains(Exp_text))
				System.out.println("Expected text visible at webpage");
			else
				System.err.println("text not visible at webpage");
			
			
			String Exp_text1="If you've signed in to Google products like YouTube, try again with that email";
			//Verify page visible text contains expected text
			if(PageVisible_Text.contains(Exp_text1))
				System.out.println("Expected text visible at webpage");
			else
				System.err.println("expected text not visible at webpage");
			
		}
		else
			System.err.println("Wrong title displayed for gmail page");
		
		

	}

}
