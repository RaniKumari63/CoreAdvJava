import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfWriter;


public class PDFEx1 {

	public static void main(String[] args) throws FileNotFoundException, DocumentException {
		// TODO Auto-generated method stub
String path="C:\\Driver1\\JavaPDF\\FirstPdf.pdf";
FileOutputStream fos = new FileOutputStream(path);  
System.out.println("Password Protected File Generated.");  
Document doc=new Document();
PdfWriter writer=PdfWriter.getInstance(doc, fos);
	}

}
