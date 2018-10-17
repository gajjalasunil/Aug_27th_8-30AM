package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write_Data {

	public static void main(String[] args) throws IOException 
	{
		
		
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		//Connect to Workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		//Target sheet
		XSSFSheet sht=book.getSheetAt(0);
		
		
		//Modifiy existing row and Cell Data
		sht.getRow(1).getCell(2).setCellValue("NewpwdHdf@123");
		
		//Create Output at existing row and new cell.
		sht.getRow(1).createCell(6).setCellValue("Testpass");
		
		//write data at newrow and netcell
		sht.createRow(2).createCell(0).setCellValue("http://facebook.com");
		
		
		//Create output file
		book.write(new FileOutputStream("TestData\\Op.xlsx"));
		book.close();

	}

}
