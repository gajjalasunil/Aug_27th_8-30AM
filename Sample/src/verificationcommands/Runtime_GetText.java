package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Runtime_GetText {

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
				System.out.println("gmail Homepage title verified");
				//Enter invalid email with invalid domain
				WebElement Signin_email_eb=driver.findElement(By.id("identifierId"));
				Signin_email_eb.clear();
				Signin_email_eb.sendKeys("sunilreddy.gajjala@outlook.com",Keys.ENTER);
				Thread.sleep(5000);
				
				//IDentify eroor location
				WebElement Error_location=driver.findElement(By.cssSelector("div[class='dEOOab RxsGPe'] > div"));
				//Get Element text at runtime
				String Element_text=Error_location.getText();
				
				//Verify Element visible at webapge
				if(!Element_text.isEmpty())
				{
					System.out.println("element visible at webpage");
					String Exp_text="Couldn't find your Google Account";
					
					//Verify Expected and Actual text
					if(Element_text.equals(Exp_text))
						System.out.println("text verifed on invalid domain Error displayed");
					else
						System.err.println("text mismatch on invalid domain address");
					
				}
				else
					System.err.println("text not visible at webapge");
		}
		else
			System.err.println("title mismatch expected page not displayed");
		

	}

}
