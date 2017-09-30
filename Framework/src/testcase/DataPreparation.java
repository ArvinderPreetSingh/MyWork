package testcase;

import java.util.HashMap;

import ExcelConfig.ExcelReaderUtil;

public class DataPreparation 
{
	HashMap<String, String > m = new HashMap<String, String>();
	public HashMap<String, String> prepareData(String DMI) throws Exception
	{
		m.clear();
		ExcelReaderUtil excelObj = new ExcelReaderUtil("C:\\Users\\Mr.Singh\\Desktop\\testdata.xlsx");
		int rowCount= excelObj.getRowCount("Sheet1");
		int rowNum = 0;
		String pCode = null;
		for(int i=2; i<=rowCount;i++)
		{
			if(excelObj.getCellData("Sheet1", "DMI", i).equals(DMI))
			{			pCode= excelObj.getCellData("Sheet1", "PC", i);
			break;
			}
		}	
		int rowCount1= excelObj.getRowCount("Sheet2");
		for(int j=2;j<=rowCount1;j++ )
		{
			if(excelObj.getCellData("Sheet2", "PC", j).equals(pCode))
			{			rowNum= j;
			break;
			}	
		}
		m.put("First Name", "Arvinder");
		m.put("Second Name", "Singh");	
		for( int i=0; i<3; i++)
		{
			m.put(excelObj.getCellData("Sheet2", i, 0).replace("-", "_"), excelObj.getCellData("Sheet2",i, (rowNum-1)));
		}
		System.out.println(m);
		return m;	
	}
	public String data(String key)
	{
		
		
		return m.get(key);
		
	}
}
