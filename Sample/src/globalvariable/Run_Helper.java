package globalvariable;

public class Run_Helper {

	public static void main(String[] args) throws Exception 
	{
		//Create object for Helper
		Helper obj=new Helper();
		obj.launchBrowser();
		
		//Change Global url at runtime
		obj.url="http://facebook.com";
		obj.loadApp();
		
		
		//login Facebook
		obj.uid="Darshan@gmail.com";
		obj.pwd="Hello12345";
		obj.Signin();
		
		//Close Browser
		Thread.sleep(4000);
		obj.driver.close();

	}

}
