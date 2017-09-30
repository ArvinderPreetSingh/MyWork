package ExcelConfig;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;

import java.io.FileOutputStream;
 
public class ExcelReaderUtil
{
   public FileInputStream fis = null;
   public FileOutputStream fos = null;
   public XSSFWorkbook workbook = null;
   public XSSFSheet sheet = null;
   public XSSFRow row = null;
   public XSSFCell cell = null;
   String xlFilePath;
 
   /**
    * This method is used to set the excel file path
    * @param xlFilePath
    * @throws Exception
    */
   public ExcelReaderUtil(String xlFilePath) throws Exception
   {
       this.xlFilePath = xlFilePath;
       fis = new FileInputStream(xlFilePath);
       workbook = new XSSFWorkbook(fis);
       fis.close();
   }
 
   /**
    * This method is used to get no of rows
    * @param sheetName
    * @return
    */
   public int getRowCount(String sheetName)
   {
       sheet = workbook.getSheet(sheetName);
       int rowCount = sheet.getLastRowNum()+1;
       return rowCount;
   }
 
   /**
    * This method is used to get no of columns
    * @param sheetName
    * @return
    */
   public int getColumnCount(String sheetName)
   {
       sheet = workbook.getSheet(sheetName);
       row = sheet.getRow(0);
       int colCount = row.getLastCellNum();
       return colCount;
   }
   
   /**
    * This method is used to set cell data using column name and row number
    * @param sheetName
    * @param colName
    * @param rowNum
    * @param value
    * @return
    */
   public boolean setCellData(String sheetName, String colName, int rowNum, String value)
   {
       try
       {
           int col_Num = -1;
           sheet = workbook.getSheet(sheetName);

           row = sheet.getRow(0);
           for (int i = 0; i < row.getLastCellNum(); i++) 
           {
               if (row.getCell(i).getStringCellValue().trim().equals(colName))
               {
                   col_Num = i;
                   break;
               }
           }

           sheet.autoSizeColumn(col_Num);
           row = sheet.getRow(rowNum - 1);
           if(row==null)
               row = sheet.createRow(rowNum - 1);

           cell = row.getCell(col_Num);
           if(cell == null)
               cell = row.createCell(col_Num);

           cell.setCellValue(value);

           fos = new FileOutputStream(xlFilePath);
           workbook.write(fos);
           fos.close();
       }
       catch (Exception ex)
       {
           ex.printStackTrace();
           return  false;
       }
       return true;
   }
   
   /**
    * This method is used to cell data using column number and row number
    * @param sheetName
    * @param colNumber
    * @param rowNum
    * @param value
    * @return
    */
   public boolean setCellData(String sheetName, int colNumber, int rowNum, String value)
   {
       try
       {
           sheet = workbook.getSheet(sheetName);
           row = sheet.getRow(rowNum-1);
           if(row==null)
               row = sheet.createRow(rowNum-1);

           cell = row.getCell(colNumber);
           if(cell == null)
               cell = row.createCell(colNumber);

           cell.setCellValue(value);

           fos = new FileOutputStream(xlFilePath);
           workbook.write(fos);
           fos.close();
       }
       catch (Exception ex)
       {
           ex.printStackTrace();
           return  false;
       }
       return true;
   }
   
   
   /**
    * This method is used to get cell data using Column Name
    * @param sheetName
    * @param colName
    * @param rowNum
    * @return
    */
public String getCellData(String sheetName, String colName, int rowNum)
{
	try
	{
		int col_Num = -1;
		sheet = workbook.getSheet(sheetName);
		row = sheet.getRow(0);
		for(int i = 0; i < row.getLastCellNum(); i++)
		{
			if(row.getCell(i).getStringCellValue().trim().equals(colName.trim()))
			{
				col_Num = i;
				break;
			}
		}

           row = sheet.getRow(rowNum - 1);
           cell = row.getCell(col_Num);

           if(cell.getCellType() == Cell.CELL_TYPE_STRING)
               return cell.getStringCellValue();
           else if(cell.getCellType() == Cell.CELL_TYPE_NUMERIC || cell.getCellType() == Cell.CELL_TYPE_FORMULA)
           {
               String cellValue = String.valueOf(cell.getNumericCellValue());
               if(HSSFDateUtil.isCellDateFormatted(cell))
               {
                   DateFormat df = new SimpleDateFormat("dd/MM/yy");
                   Date date = cell.getDateCellValue();
                   cellValue = df.format(date);
               }
               else{
            	   DataFormatter fmt = new DataFormatter();
            	   cellValue = fmt.formatCellValue(cell);
               }
              
               return cellValue;
           }else if(cell.getCellType() == Cell.CELL_TYPE_BLANK)
               return "";
           else
               return String.valueOf(cell.getBooleanCellValue());
       }
       catch(Exception e)
       {
           e.printStackTrace();
           return "row "+rowNum+" or column "+colName +" does not exist  in Excel";
       }
   }

   /**
    * This method is used to get cell data using column number and row number
    * @param sheetName
    * @param colNum
    * @param rowNum
    * @return
    */
   public String getCellData(String sheetName,int colNum,int rowNum)
   {
       try
       {
           sheet = workbook.getSheet(sheetName);
           row = sheet.getRow(rowNum);
           cell = row.getCell(colNum);
           if(cell.getCellType() ==Cell.CELL_TYPE_STRING)
               return cell.getStringCellValue();
           else if(cell.getCellType() ==Cell.CELL_TYPE_NUMERIC || cell.getCellType() == Cell.CELL_TYPE_FORMULA)
           {
               String cellValue  = String.valueOf(cell.getNumericCellValue());
               if (HSSFDateUtil.isCellDateFormatted(cell))
               {
                   DateFormat df = new SimpleDateFormat("dd/MM/yy");
                   Date date = cell.getDateCellValue();
                   cellValue = df.format(date);
               }
               else{
            	   DataFormatter fmt = new DataFormatter();
            	   cellValue = fmt.formatCellValue(cell);
               }
               return cellValue;
           }else if(cell.getCellType() == Cell.CELL_TYPE_BLANK)
               return "";
           else
               return String.valueOf(cell.getBooleanCellValue());
       }
       catch(Exception e)
       {
           e.printStackTrace();
           return "row "+rowNum+" or column "+colNum +" does not exist  in Excel";
       }
   }
   
}