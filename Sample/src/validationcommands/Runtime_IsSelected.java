package validationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_IsSelected {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://cleartrip.com");
		driver.manage().window().maximize();
		
		
		//Identify Roundtrip radio button
		WebElement Roundtrip=driver.findElement(By.id("RoundTrip"));
		Roundtrip.click();
		
		//Accept Conditon on Roundtrip selection
		if(Roundtrip.isSelected())
		{
			//Verify Element Visible at webpage
			WebElement ReturnDate=driver.findElement(By.id("ReturnDate"));
			//Accept condition on ReturnDate visible
			if(ReturnDate.isDisplayed())
				System.out.println("As expected return date visible on roundtrip selection");
			else
				System.err.println("TestFail:--> Return date visible on roundtrip selection");
		}
		else
			System.out.println("Roundtrip is not selected");
		

	}

}
