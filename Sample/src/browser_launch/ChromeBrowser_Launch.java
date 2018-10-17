package browser_launch;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser_Launch 
{

	public static void main(String[] args) 
	{
		
		/*
		 * To launch chrome browser using webdriver scripting
		 * we need to downlaod chromedriver.exe file.
		 * 
		 * 	URl:--> https://chromedriver.storage.googleapis.com/index.html?path=2.41/
		 * 	Download Zip file for windows [32 bit suppports both hotspot sizes]
		 * 	After download unzip file to project folder.
		 */
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver chrome=new ChromeDriver();
		chrome.get("http://fb.com");
		
		
		

	}

}
