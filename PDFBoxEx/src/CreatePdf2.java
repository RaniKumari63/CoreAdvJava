import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class CreatePdf2 {

	public static void main(String[] args) throws IOException, DocumentException {
		// TODO Auto-generated method stub

	Document doc=new Document();
		
		PdfWriter writer=PdfWriter.getInstance(doc, new FileOutputStream("C:\\Driver1\\JavaPDF\\Motivation.pdf"));
	doc.open();
	doc.add(new Paragraph("If you're offered a seat on a rocket ship, don't ask what seat! Just get on."));
		doc.addAuthor("rani");
		doc.addCreationDate();
		doc.addCreator("javatpoint.com");
		doc.addTitle("setting attribute");
		doc.addSubject("setting attributes to the pdffiles.");
		System.out.println("PDFCreated");
		
		doc.close();
		writer.close();
		
	}

}
