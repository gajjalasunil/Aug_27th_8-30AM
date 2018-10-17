package datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Locate_File_And_Workbook {

	public static void main(String[] args) throws IOException 
	{
		
		String path="TestData\\InputData.xlsx";
		//Target file location using input stream
		FileInputStream fi=new FileInputStream(path);
		System.out.println("file located successfull");
		
		//Get workbook access
		XSSFWorkbook book=new XSSFWorkbook(fi);
		System.out.println("Workbook access successfull");
		
		
	}

}
