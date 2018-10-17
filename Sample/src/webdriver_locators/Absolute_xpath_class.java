package webdriver_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Absolute_xpath_class {

	public static void main(String[] args)
	{
		WebDriver  driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("html/body/section[2]/div/div/ul/li/div[1]/div[2]/div/div/form/div[3]/section/div[1]/dl/dd/span/input[1]")).sendKeys("Hyderabad, IN - Rajiv Gandhi International (HYD)");
		driver.findElement(By.xpath("html/body/section[2]/div/div/ul/li/div[1]/div[2]/div/div/form/div[3]/section/div[3]/dl/dd/span/input[1]")).sendKeys("London, GB - All airports (LON)");
		driver.findElement(By.xpath("html/body/section[2]/div/div/ul/li/div[1]/div[2]/div/div/form/div[3]/section[2]/div[1]/dl/dd/div/input[1]")).click();
		
		driver.findElement(By.xpath("html/body/div[1]/div[1]/table/tbody/tr[5]/td[6]/a")).click();
		
		new Select(driver.findElement(By.xpath("html/body/section[2]/div/div/ul/li/div[1]/div[2]/div/div/form/section/div[1]/dl/dd/select"))).selectByIndex(3);
		
		new Select(driver.findElement(By.xpath("html/body/section[2]/div/div/ul/li/div[1]/div[2]/div/div/form/section/div[2]/dl/dd/select"))).selectByValue("2");
		
		new Select(driver.findElement(By.xpath("html/body/section[2]/div/div/ul/li/div[1]/div[2]/div/div/form/section/div[3]/dl/dd/select"))).selectByVisibleText("1");
		
		
		
		

	}

}
