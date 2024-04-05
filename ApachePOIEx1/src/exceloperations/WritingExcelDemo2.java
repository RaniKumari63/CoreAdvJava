package exceloperations;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
//
public class WritingExcelDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet1=workbook.createSheet("Emp Info");

		
		ArrayList<Object[]>empdata=new ArrayList<Object[]>();
		empdata.add(new Object[] {"EmpId","Name","Job"});
		empdata.add(new Object[] {101,"David","Engineer"});
		empdata.add(new Object[] {102,"Smith","Manager"});
		empdata.add(new Object[] {103,"Scott","Analyst"});
		
		
		int rowCount=0;
		for(Object emp[]:empdata)
		{
			XSSFRow row=sheet1.createRow(rowCount++);
			int columnCount=0;
			for(Object value:emp ) {
				XSSFCell cell=row.createCell(columnCount++);
				
				if(value instanceof String)
				cell.setCellValue((String)value);
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);
				if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);
				
				
			}
			 
		}
		
		
		
		
		
		
		String filePath=".\\datafiles\\employee1.xlsx";
		FileOutputStream outstream=new FileOutputStream(filePath);
		workbook.write(outstream);
		outstream.close();
		System.out.println("employee is created");
		
	}

}
