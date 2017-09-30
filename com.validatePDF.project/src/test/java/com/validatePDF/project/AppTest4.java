package com.validatePDF.project;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

public class AppTest4 {



	public static void main(String[] args) throws  IOException 

	{
		String text = "This document has been created to validate the pdf.  var1 The main objective of this scenario is to read the pdf valued and compare with the expected valued. To validate this, we are using pdf box jar file or ITTest and downloading PDF File.";
		try (PDDocument document = PDDocument.load(new File("C:\\Users\\Mr.Singh\\Desktop\\pdfvalidation3.pdf"))) {

			document.getClass();

			if (!document.isEncrypted()) {

				PDFTextStripperByArea stripper = new PDFTextStripperByArea();
				stripper.setSortByPosition(true);

				PDFTextStripper tStripper = new PDFTextStripper();

				String pdfFileInText = tStripper.getText(document);


				String actualText = pdfFileInText.replaceAll("[\r\n]+", "");
				System.out.println(actualText);
				text=text.replace("var1", "Arvinder Preet Singh.");
				System.out.println(text);
				if(actualText.contains(text))
				{
					System.out.println("Passed");
				}
				else
				{
					System.out.println("Failed");
				}
			}
		}		
	}
}
