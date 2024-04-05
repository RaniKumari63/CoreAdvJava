import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class GenerateProjectedPdf {

	
	private static String USER_PASSWORD = "1234567";  
	private static String OWNER_PASSWORD = "javatpoint";  
	public static void main(String[] args) throws DocumentException, IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("C:\\Driver1\\JavaPDF\\Details.pdf");  
		System.out.println("Password Protected File Generated.");  
		Document doc=new Document();
		PdfWriter writer=PdfWriter.getInstance(doc, fos);
		writer.setEncryption(USER_PASSWORD.getBytes(), OWNER_PASSWORD.getBytes(), PdfWriter.ALLOW_PRINTING, PdfWriter.ENCRYPTION_AES_128); 
		doc.open();
		doc.add(new Paragraph("                        HSBC Bank (USA)"));  
		doc.add(new Paragraph("                                       "));  
		doc.add(new Paragraph("Account Holder Name: Rachel Weisz"));  
		doc.add(new Paragraph("Account Number: xxx-xxx-xxx-234"));  
		doc.add(new Paragraph("Branch:  Los Angeles"));  
		doc.add(new Paragraph("Branch Code: 18743"));  
		doc.add(new Paragraph("Mobile Number: +1 (xxxx)-xxx-456"));  
		doc.add(new Paragraph("Address: P.O. Box 1421, PC 111, CPO, New York (USA)"));  
		doc.add(new Paragraph("Debit Card Number: xxxx-xxxx-xxxx-0987"));  
		doc.add(new Paragraph("e-mail: rachel@gmial.com"));  
		doc.add(new Paragraph("Toll Free Number: 18000xxxxx"));  
		//closes the document  
		doc.close();  
		//closes the output stream  
		fos.close();  
		
	}

}
