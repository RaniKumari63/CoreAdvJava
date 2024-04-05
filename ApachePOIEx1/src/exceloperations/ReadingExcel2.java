package exceloperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		String excelFilePath=".\\datafiles\\contries.xlsx";
		
		FileInputStream inputstream=new FileInputStream(excelFilePath);
XSSFWorkbook workbook=new XSSFWorkbook(inputstream);
//XSSFSheet sheet=workbook.getSheet("Sheet1");
XSSFSheet sheet1=workbook.getSheetAt(0);
Iterator itr=sheet1.iterator();
while(itr.hasNext())
{
	XSSFRow row=(XSSFRow)itr.next();
	Iterator celliterator=row.cellIterator();
	while(celliterator.hasNext())
	{
		XSSFCell cell=(XSSFCell) celliterator.next();
		switch(cell.getCellType())
		{
		case STRING:
			System.out.print(cell.getStringCellValue());
			break;
		case NUMERIC:
			System.out.print(cell.getNumericCellValue());
			break;
		case BOOLEAN:
			System.out.print(cell.getBooleanCellValue());
			break;
		
		}
		System.out.print("|");
	}
	System.out.println();
		
		}
	}

	}


