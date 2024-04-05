package exceloperations;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
//
public class WritingExcelDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet1=workbook.createSheet("Emp Info");
		Object empdata[][]= {{"EmpId","Name","Job"},{101,"David","Engineer"},
				{102,"Smith","Manager"},{103,"Scott","Analyst"}};
		int rows=empdata.length;
		int cols=empdata[0].length;
		System.out.println(rows);
		System.out.println(cols);
		for(int r=0;r<rows;r++)
		{
			XSSFRow row=sheet1.createRow(r);
			for(int c=0;c<cols;c++) {
				XSSFCell cell=row.createCell(c);
				Object value=empdata[r][c];
				if(value instanceof String)
				cell.setCellValue((String)value);
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);
				if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);
				
				
			}
			 
		}
		String filePath=".\\datafiles\\employee.xlsx";
		FileOutputStream outstream=new FileOutputStream(filePath);
		workbook.write(outstream);
		outstream.close();
		System.out.println("employee is created");
		
	}

}
