package com.validatePDF.project;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) 
	{
		File f = new File("C:\\Users\\Mr.Singh\\Desktop\\pdfvalidation2.pdf");
		if(f.exists())
		{
			f.delete();
			System.out.println("File Deleted");
		}
		else
		{
			System.out.println("File is not present");
		}
	}
}
