package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRuntime_Cssvalue {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		//click on triptype multiciy tab selection.
		WebElement Multicity=driver.findElement(By.xpath("//label[text()='multi-city']"));
		
		
		//Before selection background-color
		String Before_color=Multicity.getCssValue("background-color");
		System.out.println("Before selection background color is ==> "+Before_color);
		
		
		//Select Multicity 
		Multicity.click();
		Thread.sleep(3000);
		
		//After selection background-color
		String After_color=Multicity.getCssValue("background-color");
		System.out.println("After selection background color is ==> "+After_color);
				

	}

}
