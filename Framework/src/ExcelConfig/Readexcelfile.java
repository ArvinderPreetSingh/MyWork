package ExcelConfig;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexcelfile {
Workbook wb;
public Sheet readexcel(String filepath, String filename, String Sheetname) throws Exception

{	File f = new File(filepath+"\\"+filename);
	FileInputStream fis = new FileInputStream(f);
	
	String filenameextension= filename.substring(filename.indexOf("."));
	if (filenameextension.equals(".xlsx"))
	{	wb = new XSSFWorkbook(fis);
	
	}
	else if(filenameextension.equals(".xls"))
	{ wb = new HSSFWorkbook(fis); }	
	
   Sheet sh = wb.getSheet(Sheetname);
	
	return sh;
	
}
}
