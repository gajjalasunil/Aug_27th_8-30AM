package userdefined_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Run_Repository 
{
  public WebDriver driver;
  Repository obj;
 
  @Test(priority=0)
  public void Verify_facebook_Page_title() 
  {
	  Assert.assertTrue(obj.Istitle_Presented("Facebook"));
	  Reporter.log("Title verified for facebook homepage");
  }
  
  @Test(priority=1)
  public void verify_Signup_page()
  {
	  driver.findElement(By.linkText("Sign Up")).click();
	  Assert.assertTrue(obj.Istitle_Presented("Sign up for Facebook | Facebook"));
	  Reporter.log("title verified for Signup navigation link");
  }
  
  @Test(priority=2)
  public void verify_login_page()
  {
	  driver.findElement(By.linkText("Log In")).click();
	  Assert.assertTrue(obj.isurl_Presented("/login/"));
	  Reporter.log("title verified for Signup navigation link");
  }
  
  
  
  
  
  @BeforeMethod
  public void before_method()
  {
	  driver.get("http://facebook.com");
  }
  
  @BeforeClass
  public void precondition()
  {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  //Create object
	  obj=new Repository();
  }
  
}
