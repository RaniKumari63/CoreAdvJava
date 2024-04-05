package exceloperations;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;

public class SheetEx1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
HSSFWorkbook wb=new HSSFWorkbook();
		OutputStream os=new FileOutputStream(".\\datafiles\\javapoint.xls");
		HSSFSheet sheet=wb.createSheet("New Sheet");
		Row row=sheet.createRow(0);
		Cell cell=row.createCell(0);
		
		cell.setCellValue("Javatpoint");
		
		CellStyle cellStyle=wb.createCellStyle();
		row=sheet.createRow(5);
		cell=row.createCell(0);
		sheet.setColumnWidth(0, 8000);
		cell.setCellValue("TopLeft");
		
		HSSFCellStyle style1=(HSSFCellStyle)wb.createCellStyle();
		cell.setCellStyle(style1);
		row=sheet.createRow(6);
		  cell = row.createCell(1);  
		  row.setHeight((short)800);
		  wb.write(os);
		
	}

}
