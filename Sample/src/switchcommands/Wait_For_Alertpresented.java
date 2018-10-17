package switchcommands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_For_Alertpresented {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/jobs-internship");
		driver.manage().window().maximize();
		
		//Identify search button location
		WebElement Search_btn=driver.findElement(By.cssSelector("input[value='Search']"));
		//Search_btn.click();
		
		try {
			//Create object for explicit wait
			WebDriverWait wait=new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.alertIsPresent());
			
			//Switch to Alert
			Alert alert=driver.switchTo().alert();
			
			//Get text on alert window
			String Alert_msg=alert.getText();
			System.out.println(Alert_msg);
			
			//Close Alert window
			alert.accept();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
			
			
			
	
		System.out.println("Run Continued ");

	}

}
