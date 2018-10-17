package browser_launch;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser_Launch {

	public static void main(String[] args) 
	{
		
		/*
		 * launch Fireof Browser using geckodriver;-->
		 * Download gecko driver:-->
		 * 		URl:--> https://github.com/mozilla/geckodriver/releases
		 * 		Above 57+ browsers  --> v0.21.0  [geckodriver version]
		 * 		Downlaod w.r.t  OS and hotspot size.
		 * 		After download unzip file location and Save geckodriver.exe
		 * 				file under selenium project.
		 */
		
		
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		FirefoxDriver firefox=new FirefoxDriver();
		firefox.get("http://google.com");

	}

}
