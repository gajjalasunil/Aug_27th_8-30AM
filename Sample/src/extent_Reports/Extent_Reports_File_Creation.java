package extent_Reports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extent_Reports_File_Creation 
{

	public static void main(String[] args) 
	{
		
		String filepath="D:\\sunill\\27th_Aug_8-30AM\\Reports\\MyReports.html";
		ExtentReports reports=new ExtentReports(filepath, true);
		
		ExtentTest test=reports.startTest("Login_invalid", "login with Invalid email");

		test.log(LogStatus.INFO, "Browser launched");
		test.log(LogStatus.SKIP, "Skip maximize browser");
		test.log(LogStatus.PASS, "Test verfied");
		test.log(LogStatus.FAIL, "Data not verifed");
		test.log(LogStatus.FATAL, "Total test fail no workarround");
		
		reports.endTest(test);
		
		reports.flush();
	}

}
