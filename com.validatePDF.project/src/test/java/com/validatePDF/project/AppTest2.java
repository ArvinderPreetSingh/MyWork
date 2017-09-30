package com.validatePDF.project;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

public class AppTest2 {

	public static void main(String[] args) throws IOException 
	{
		
		 try (PDDocument document = PDDocument.load(new File("C:\\Users\\Mr.Singh\\Desktop\\pdfvalidation.pdf"))) {

	            document.getClass();

	            if (!document.isEncrypted()) {

	                PDFTextStripperByArea stripper = new PDFTextStripperByArea();
	                stripper.setSortByPosition(true);

	                PDFTextStripper tStripper = new PDFTextStripper();

	                String pdfFileInText = tStripper.getText(document);
	                System.out.println(pdfFileInText);
	                
	                String s = pdfFileInText.replaceAll("[\r\n]+", "");
	    			System.out.println(s);
	                
	                if(s.contains("ITTest and"))
	    			{
	    				System.out.println("Passed");
	    			}
	    			else
	    			{
	    				System.out.println("Failed");
	    			}
	    			

					/*// split by whitespace
	                String lines[] = pdfFileInText.split("\\r?\\n");
	                for (String line : lines) {
	                    System.out.println(line);
	                }*/

	            }

	        }
		
	}

}
