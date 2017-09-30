package testcase;

import java.io.FileOutputStream;
import java.util.ArrayList;

import java.util.List;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import ExcelConfig.Readexcelfile;

public class findingduplicates {
	private static XSSFSheet ExcelWSheet;

	private static XSSFWorkbook ExcelWBook;

	private static XSSFCell Cell;

	private static XSSFRow Row;
int k;
	@Test
	public void test2() throws Exception {

		Readexcelfile f = new Readexcelfile();
		Sheet sh2 = f.readexcel(System.getProperty("user.dir") + "\\", "DriverScript.xlsx", "Sheet2");
		int rowNum = sh2.getLastRowNum() - sh2.getFirstRowNum();
		int sum = 0;
		List<String> list = new ArrayList<String>();
		List<String> list1 = new ArrayList<String>();
		for (int rowcount = 0; rowcount < rowNum + 1; rowcount++) {
			list.add(sh2.getRow(rowcount).getCell(0).toString());
		}
		 for (int j = 0; j < list.size(); j++) {
		String search = list.get(j);
		if(!list1.contains(search) ){
			list1.add(search);
		List<Integer> results = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (search.equals(list.get(i))) {
				results.add(i);
			}
		}
		for ( k = 0; k < results.size(); k++) {
			//System.out.println(search + " " + results.get(k));
			sum = sum + Integer.parseInt(sh2.getRow(results.get(k)).getCell(2).toString());
		}
		System.out.println(search + sum);
		sum=0;

}}}}