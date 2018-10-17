package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFor_Input_text_Presented_At_TextBox {

	public static void main(String[] args) 
	{
		/*
		 * Testcase:-->
		 * 		Verify Operatorname and Locationname autogenarated During
		 * 		mobile reacharge functionality
		 * Steps:-->
		 * 		Launch and load patym application
		 * 		Make sure Prepaid radio button selected
		 * 		Enter mobile number
		 * 
		 * Expected:-->
		 * 		System should autogenarate Operator and location
		 */
		

		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();

	
		
		//target location
		WebElement Mobilenum=driver.findElement(By.xpath("//label[text()='Mobile Number']/preceding-sibling::input"));
		Mobilenum.clear();
		Mobilenum.sendKeys("9030248855");
		
			
		By operator_locator=By.xpath("//label[text()='Operator']/preceding-sibling::input");
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.textToBePresentInElementValue(operator_locator, "Airtel"));
		System.out.println("Expected operator displayed");
		

	}

}
