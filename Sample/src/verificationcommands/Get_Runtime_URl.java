package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Get_Runtime_URl {

	public static void main(String[] args) 
	{
		
		/*
		 * Automation Testcase:-->
		 * 		Verify NR Forex Rates link at HDFC bank NRI page
		 * 	Steps:-->
		 * 		Launch browser window
		 * 		load hdfc bank url
		 * 		maximize window  [optional]
		 * 		click NRI link at homepage
		 * 		click NR forex link at NRI page.
		 * 		
		 * 	Expected:-->
		 * 		System should display Forex page with Expected url	
		 */
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		
		//click NRI link at hdfc homepage
		WebElement NRI_link=driver.findElement(By.xpath("//a[@href='/nri_banking/home.htm']"));
		NRI_link.click();
		
		//click NR forex rates link at NRI page
		WebElement NR_forex_rates_link=driver.findElement(By.xpath("//a[@title='NR Forex rate applicable for Inward remittances']"));
		NR_forex_rates_link.click();
		
		
		String exp_url="nri_banking/Foreign_Exchng_Rates/Foreign_Exchng_Rates.asp";
		
		
		//Capture runtime url at webpage
		String act_url=driver.getCurrentUrl();
		
		
		//Verify Actual url contains expected partial url at current window
		if(act_url.contains(exp_url))
			System.out.println("As expected foreign exchange rates page displayed");
		else
			System.err.println("Expected Foreign exchange rateds page not displayed");

	}

}
