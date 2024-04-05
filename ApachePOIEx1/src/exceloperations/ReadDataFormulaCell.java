 package exceloperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFormulaCell {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream file=new FileInputStream(".\\datafiles\\information.xlsx"); 
	
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	sheet=workbook.getSheet("Sheet1");
	}

}
