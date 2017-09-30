package com.validatePDF.project;

import java.io.IOException;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

public class App {


	public static void main(String[] args) {

		PdfReader reader;

		try {

			reader = new PdfReader("C:\\Users\\Mr.Singh\\Desktop\\pdfvalidation.pdf");

			// pageNumber = 1
			String textFromPage = PdfTextExtractor.getTextFromPage(reader, 1);

			System.out.println(textFromPage);
			String s = textFromPage.replaceAll("[\r\n]+", " ");
			System.out.println(s);
			
			if(textFromPage.contains("ITTest and"))
			{
				System.out.println("Passed");
			}
			else
			{
				System.out.println("Failed");
			}
			reader.close();

		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}

	}
}
