package framework_testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class My_Testng_Test1 
{
  WebDriver driver;
  @Test
  public void verify_messenger_link()
  {
	  driver.findElement(By.linkText("Messenger")).click();
	  Assert.assertEquals(driver.getTitle(), "Messenger");
	  Reporter.log("Expected Title presented --> "+driver.getTitle());
  }
  
 
  @BeforeClass
  public void beforeClass() 
  {
	  driver=new ChromeDriver();
	  driver.get("http://facebook.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterClass() throws Exception
  {
	  Thread.sleep(8000);
	  driver.close();
  }

}
