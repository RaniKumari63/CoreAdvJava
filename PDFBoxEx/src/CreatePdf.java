import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

public class CreatePdf {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		PDDocument pdfdoc=new PDDocument();
		pdfdoc.addPage(new PDPage());
		
		pdfdoc.save("C:\\Driver1\\JavaPDF\\Sample.pdf");
		
		System.out.println("PDFCreated");
		pdfdoc.close();
		
	}

}
