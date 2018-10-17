package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Number_Converter {

	public static void main(String[] args) throws IOException 
	{
		String path="TestData\\InputData.xlsx";
		//Target file location using input stream
		FileInputStream fi=new FileInputStream(path);
		System.out.println("file located successfull");
		
		//Get workbook access
		XSSFWorkbook book=new XSSFWorkbook(fi);
		System.out.println("Workbook access successfull");
		
		//target sheet using above book
		XSSFSheet sht=book.getSheet("Sheet1");
		
		//Target row using above sheet
		XSSFRow row=sht.getRow(1);
		
		
		//Get price from excel
		Double Price=row.getCell(4).getNumericCellValue();
		System.out.println("Amount to transfer --> "+Price);
		System.out.println("Price in int format ==> "+Price.intValue());
		System.out.println("Double to String => "+NumberToTextConverter.toText(Price));

		
		//Get Mobilenumber
		Double Mnum=row.getCell(5).getNumericCellValue();
		System.out.println(Mnum);
	
		//convert number to string
		String Mobilenum=NumberToTextConverter.toText(Mnum);
		System.out.println("After conversion mobile num is ==> "+Mobilenum);
		
		
		
		
		

	}

}
