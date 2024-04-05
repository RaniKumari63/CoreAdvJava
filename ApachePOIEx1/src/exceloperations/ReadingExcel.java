package exceloperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		String excelFilePath=".\\datafiles\\contries.xlsx";
		
		FileInputStream inputstream=new FileInputStream(excelFilePath);
XSSFWorkbook workbook=new XSSFWorkbook(inputstream);
//XSSFSheet sheet=workbook.getSheet("Sheet1");
XSSFSheet sheet1=workbook.getSheetAt(0);
int rows=sheet1.getLastRowNum();
int col=sheet1.getRow(1).getLastCellNum();
		for(int r=0;r<=rows;r++)
		{ XSSFRow row=sheet1.getRow(r);
			for(int c=0;c<col;c++)
			{
				XSSFCell cell=row.getCell(c);
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
