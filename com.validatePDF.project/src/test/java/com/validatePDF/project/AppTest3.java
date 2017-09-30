package com.validatePDF.project;

import java.io.IOException;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

public class AppTest3 {

	public static void main(String[] args) {
		PdfReader reader;

		try {

			reader = new PdfReader("C:\\Users\\Mr.Singh\\Desktop\\pdfvalidation2.pdf");

			for(int i=1; i<3;i++)
			{
				String textFromPage = PdfTextExtractor.getTextFromPage(reader, i);

				System.out.println(textFromPage);

				if(textFromPage.contains("pdf value and compare with the expected value. To validate this, we are using pdf box jar file or IText " +"\n"+ "and downloading PDF File."))
				{
					System.out.println("Passed");
				}
				else
				{
					System.out.println("Failed");
				}
				

			} 
			reader.close();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}


	}

}
