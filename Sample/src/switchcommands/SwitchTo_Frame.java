package switchcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame {

	public static void main(String[] args) throws Exception 
	{
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/hotels/");
		driver.manage().window().maximize();
		
		
		//Identify Signin button
		WebElement Sign_btn=driver.findElement(By.className("login-btn"));
		Sign_btn.click();
		Thread.sleep(5000);
		
		
		//Identify frame
		WebElement modalframe=driver.findElement(By.className("modalIframe"));
		//Apply switch to modalframe
		driver.switchTo().frame(modalframe);
		
		
		//Identify Element under modalframe
		WebElement mobile_num=driver.findElement(By.id("mobileNoInp"));
		mobile_num.clear();
		mobile_num.sendKeys("9030248855");
		
		
		//Switch controls back to mainpage 
		driver.switchTo().defaultContent();
		
		//click close button
		WebElement Close_btn=driver.findElement(By.xpath("(//div[@title='close'])[3]"));
		Close_btn.click();
		
		
		System.out.println("Controls available at mainpage");
	}

}
