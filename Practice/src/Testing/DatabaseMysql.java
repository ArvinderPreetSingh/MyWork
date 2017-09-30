package Testing;

import java.io.*;
import java.sql.*;
import org.apache.poi.hssf.usermodel.*;
import java.util.*;
 
public class DatabaseMysql {
 
  private Connection connection = null;
 
  public DatabaseMysql(String database, String user, String password) throws ClassNotFoundException, SQLException 
  {
 
        // Create MySQL database connection
    Class.forName("com.mysql.jdbc.Driver");
 
    String url = "jdbc:mysql://localhost:3306/" + database;
    connection = DriverManager.getConnection(url, user, password);
  }
 
  
public void generateXls(String tablename, String filename) throws SQLException, FileNotFoundException, IOException 
  {
 
    // Create new Excel workbook and sheet
    HSSFWorkbook xlsWorkbook = new HSSFWorkbook();
    HSSFSheet xlsSheet = xlsWorkbook.createSheet();
    int rowIndex = 0;
 
    // Execute SQL query
    PreparedStatement stmt = connection.prepareStatement("select * from " + tablename);
    ResultSet rs = stmt.executeQuery();
 
    // Get the list of column names and store them as the first
    // row of the spreadsheet.
    ResultSetMetaData colInfo = rs.getMetaData();
    List colNames = new ArrayList();
    HSSFRow titleRow = xlsSheet.createRow(rowIndex++);
 
    for (int i = 1; i < colInfo.getColumnCount(); i++) 
    {
      colNames.add(colInfo.getColumnName(i));
      titleRow.createCell(i-1).setCellValue(new HSSFRichTextString(colInfo.getColumnName(i)));
      
     
      //xlsSheet.setColumnWidth((short) (i-1), (short) 4000);
    }
    String[] colNames1 = (String[]) colNames.toArray();
    // Save all the data from the database table rows
    while (rs.next()) {
      HSSFRow dataRow = xlsSheet.createRow(rowIndex++);
      int colIndex = 0;
      for (String colName : colNames1) 
      {
        dataRow.createCell(colIndex++).setCellValue(new HSSFRichTextString(rs.getString(colName)));
      }
    }
 
    // Write to disk
    xlsWorkbook.write(new FileOutputStream(filename));
  }
 
  // Close database connection
  public void close() throws SQLException {
    connection.close();
  }
 
  public static void main(String[] args) {
    try {
    	DatabaseMysql mysqlToXls = new DatabaseMysql("test", "root", "");
      mysqlToXls.generateXls("person", "person.xls");
      mysqlToXls.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}