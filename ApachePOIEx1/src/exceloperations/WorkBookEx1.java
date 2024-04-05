package exceloperations;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;

public class WorkBookEx1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
HSSFWorkbook wb=new HSSFWorkbook();
CreationHelper createHelper=wb.getCreationHelper();
FileOutputStream fileout=new FileOutputStream(".\\datafiles\\Javatpoint.xls");
HSSFSheet sheet1= wb.createSheet("FirstSheet");
HSSFSheet sheet2= wb.createSheet("Second Sheet");
Row row=sheet1.createRow(2);
Cell cell=row.createCell(5);
cell.setCellValue("javapoint");
CellStyle cellStyle=wb.createCellStyle();
cellStyle.setDataFormat(createHelper.createDataFormat().getFormat("d/m/yy h:mm"));
Row row1=sheet2.createRow(2);
Cell cell1=row1.createCell(5);
cell1.setCellValue(new Date());
cell1.setCellStyle(cellStyle);

wb.write(fileout);

	System.out.println("File created successfully");
	}

}
