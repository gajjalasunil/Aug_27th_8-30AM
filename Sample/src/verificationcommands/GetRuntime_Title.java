package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRuntime_Title 
{

	public static void main(String[] args) 
	{
		
	
		/*
		 * Testcase:--> Verify HDFC Homepage
		 * Steps:-->
		 * 			launch chrome browser
		 * 			load hdfc webpage
		 * Expected:-->
		 * 			System should display homepage with Unique title
		 */
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		
		String Exp_title="HDFC Bank: Personal Banking Services";
		//Capture runtime title
		String Act_title=driver.getTitle();
		
		
		//Verify EqualIgnorecase comparision between two Strings
		boolean flag=Exp_title.equalsIgnoreCase(Act_title);
		System.out.println("HDFC homepage title status is  --> "+flag);
		
		
		//Write Conditional statement to execute block of code
		if(flag==true)
		{
			System.out.println("Expected HDFC homepage title verified");
			
			WebElement Nri_link=driver.findElement(By.linkText("NRI"));
			Nri_link.click();
			
			//Verify NRI page title at runtime
			if(driver.getTitle().contains("NRI Banking"))
				System.out.println("Expected NRI page Title verified");
			else
				System.err.println("NRI page title not verified");
		}
		else
		{
			System.err.println("Expected title Not presented at hdfc homepage");
		}

	}

}
