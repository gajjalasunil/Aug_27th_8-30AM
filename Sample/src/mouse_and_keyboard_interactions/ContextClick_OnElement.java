package mouse_and_keyboard_interactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick_OnElement {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Identify Element
		WebElement Element=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		
		//Enable mouse and keyboard action at webpage
		Actions action=new Actions(driver);
		//Perform context menu option on Selected element
		action.contextClick(Element).perform();
		Thread.sleep(5000);
		
		
		//click delete button at context menu
		WebElement btn_delete=driver.findElement(By.xpath("/html/body/ul/li[5]/span"));
		action.click(btn_delete).perform();
		Thread.sleep(5000);
		
		
		//Close popup window
		driver.switchTo().alert().dismiss();
		
		
		
		
		
		

	}

}
