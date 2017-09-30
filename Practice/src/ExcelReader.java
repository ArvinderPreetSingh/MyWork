import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader 
{

	private static XSSFSheet sh;

	private static XSSFWorkbook workbook;

	private static XSSFCell Cell;

	private static XSSFRow Row;

	
	public static void main(String args[]) throws IOException
	{
		createExel();	
	}
	/**
	 * This methos is used to create blank excel
	 * @throws IOException
	 */
	public static void createExel() throws IOException	
	{
	//Create Blank workbook
	 workbook = new XSSFWorkbook();
	 sh = workbook.createSheet("Sheet1");
	//Create file system using specific name
	FileOutputStream out = new FileOutputStream(new File("C:\\Users\\Mr.Singh\\Desktop\\abcd.xlsx"));
	//write operation workbook using file out object
	workbook.write(out);
	out.close();
	System.out.println("createworkbook.xlsx written successfully");
	}
	
	/**
	 * This method is used to get no of rows and column
	 */
	public void getTotalRows()
	{
		int rowNum = sh.getLastRowNum() + 1;
        int colNum = sh.getRow(0).getLastCellNum();
	}
	
	//This method is to read the test data from the Excel cell, in this we are passing parameters as Row num and Col num

	public static String getCellData(int RowNum, int ColNum) throws Exception{

	   try{

		   Cell = sh.getRow(RowNum).getCell(ColNum);

		  String CellData = Cell.getStringCellValue();

		  return CellData;

		  }catch (Exception e){

			return"";

			}

		}








}
