package browser_launch;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer_Browserlaunch 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Downlaod IEDriverServer.exef file:-->
		 * 			
		 * 		URl:--> http://selenium-release.storage.googleapis.com/index.html
		 * 		select select selenium version
		 * 		download IeDrvierserver zip format file w.r.t Hotspot size
		 * 		After downloa unzip file to project folder.
		 * 
		 * 		IE browser versions :--  IE8,9,10,11
		 */
		
		String filepath="D:\\sunill\\27th_Aug_8-30AM\\Sample\\chromedriver.exe";
		System.setProperty("webdriver.ie.driver", filepath);
		InternetExplorerDriver ie=new InternetExplorerDriver();
		ie.get("http://google.com");

	}

}
