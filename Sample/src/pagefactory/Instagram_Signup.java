package pagefactory;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Instagram_Signup 
{
	
	
	@FindBy(how=How.NAME,using="emailOrPhone")
	WebElement Mobile_or_email_editbox;
	
	@FindBy(name="fullName")
	WebElement fullname_editbox;
	
	@FindBy(xpath="//input[@name='username']")
	WebElement Username_editbox;
	
	@FindBy(css="input[name='password']")
	WebElement Password_editbox;
	
	@FindBy(xpath="//button[text()='Sign up']")
	WebElement Signup_button;
	
	@FindBy(how=How.CLASS_NAME,using="uxKLF")
	WebElement Navigation_footer;
	
	@FindBy(how=How.TAG_NAME,using="a")
	List<WebElement> Navigation_links;
	
	
	/*
	 * Methodname
	 * Authore
	 * CreatedOn
	 */
	public void user_reg(String mobile,String fullname,String username, String password)
	{
		Mobile_or_email_editbox.clear();
		Mobile_or_email_editbox.sendKeys(mobile);
		
		fullname_editbox.clear();
		fullname_editbox.sendKeys(fullname);
		
		Username_editbox.clear();
		Username_editbox.sendKeys(username);
		
		Password_editbox.clear();
		Password_editbox.sendKeys(password);
		
	}
	
	

}
