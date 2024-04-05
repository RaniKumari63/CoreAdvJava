package exceloperations;

import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;

public class Sheet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HSSFWorkbook wb=new  HSSFWorkbook();
		HSSFSheet sheet1=wb.createSheet("Sheet");
		Row row=sheet1.createRow(1);
		Cell cell=row.createCell(1);
		cell.setCellValue(101);
		CellStyle style=wb.createCellStyle();
		style.setBorderBottom(BorderStyle.THIN);
		 style.setBottomBorderColor(IndexedColors.BLACK.getIndex());  
         style.setBorderRight(BorderStyle.THIN);  
         style.setRightBorderColor(IndexedColors.BLUE.getIndex());  
         style.setBorderTop(BorderStyle.MEDIUM_DASHED);  
         style.setTopBorderColor(IndexedColors.BLACK.getIndex());  
         cell.setCellStyle(style);  
         try (OutputStream fileOut = new FileOutputStream(".\\datafiles\\Javatpoint1.xls")) {  
             wb.write(fileOut);  
         }catch(Exception e) {  
             System.out.println(e.getMessage());  
         }  
	}

}
