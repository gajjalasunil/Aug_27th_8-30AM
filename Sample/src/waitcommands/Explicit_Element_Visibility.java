package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Explicit_Element_Visibility {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		
		
		//Create object for explicit wait
		WebDriverWait wait=new WebDriverWait(driver, 50);
		
		//IDentity multicity tab
		WebElement Multicity=driver.findElement(By.xpath("//label[text()='multi-city']"));
		//Multicity.click();
		
		
		//Wait for Elementto be visible
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("js-multiCitySearchFrom_1")));
		System.out.println("element visible at webpage");
		
		//ElementTobe clickable
		wait.until(ExpectedConditions.elementToBeClickable(By.id("addModifyBtn"))).click();
		
		

	}

}
