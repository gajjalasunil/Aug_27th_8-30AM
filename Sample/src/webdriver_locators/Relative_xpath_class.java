package webdriver_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Relative_xpath_class {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://leads.hdfcbank.com/applications/new_webforms/apply/credit-card/Index.aspx?promo=P4_HP_FlipCoin_25072016_CC&_ga=2.268460785.1025226559.1537244270-1291739286.1523247784");
		driver.manage().window().maximize();
		
		//Basic Relative xpath
		driver.findElement(By.xpath("//input[@rel='Please enter your first name as it appears<br/> on your PAN Card']")).sendKeys("mindq");
		driver.findElement(By.xpath("//input[@value='Last Name']")).sendKeys("systems");
		
		//By Using Contains
		driver.findElement(By.xpath("//input[contains(@tabindex,'3')]")).click();
		new Select(driver.findElement(By.xpath("//select[contains(@data-handler,'selectMonth')]"))).selectByIndex(4);
		//with out using contains
		new Select(driver.findElement(By.xpath("//select[(@class='ui-datepicker-year')]"))).selectByVisibleText("1989");
		
		//By Using text method 
//		driver.findElement(By.xpath("//a[contains(text(),'18')]")).click();
		
//		By Using DOT method
		driver.findElement(By.xpath("//a[contains(.,'18')]")).click();
		
		
		
		

	}

}
