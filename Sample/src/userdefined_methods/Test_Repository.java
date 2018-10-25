package userdefined_methods;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_Repository extends Repository
{

	  @Test(priority=0)
	  public void Verify_facebook_Page_title() 
	  {
		  Assert.assertTrue(Istitle_Presented("Facebook"));
		  Reporter.log("Title verified for facebook homepage");
	  }
	  
	  @Test(priority=1)
	  public void verify_Signup_page()
	  {
		  driver.findElement(By.linkText("Sign Up")).click();
		  Assert.assertTrue(Istitle_Presented("Sign up for Facebook | Facebook"));
		  Reporter.log("title verified for Signup navigation link");
	  }
	  
	  @Test(priority=2)
	  public void verify_login_page()
	  {
		  driver.findElement(By.linkText("Log In")).click();
		  Assert.assertTrue(isurl_Presented("/login/"));
		  Reporter.log("title verified for Signup navigation link");
	  }
	  
	  
	  @Test(priority=3)
	  public void Verify_text_presented()
	  {
		  String Exp_text="Facebook helps you connect and share with the people in your life.";
		  Assert.assertTrue(is_textVisible_Atpage(Exp_text));
		  Reporter.log(Exp_text+ "=> text visible at webpage");
	  }
	  
	  @Test(priority=4)
	  public void Verify_Signup_Account_Create_header()
	  {
		  Assert.assertTrue(is_text_visible_AtElement(By.xpath("//span[contains(.,'Create an account')]"), "Create an account"));
		  Reporter.log("Expected text presented at Location");
	  }
	  
	 
	  @BeforeMethod
	  public void before_method()
	  {
		 LoadApp("http://facebook.com");
	  }
	  
	  @BeforeClass
	  public void precondition()
	  {
		  browserlaunch("chrome");
	  }

}
