package Reporting;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.nio.channels.FileChannel;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Dictionary;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.log4testng.Logger;

public class HtmlReporter 
{

static final String PROJECTNAME = "MYPROJECT";
static SimpleDateFormat sdfDate = new SimpleDateFormat("dd-MM-yyyy");
static Date now = new Date();
static String folderDate = sdfDate.format(now);
private static DecimalFormat df2= new DecimalFormat(".##");

static final String CONSTANTREPORTPATH = "E:\\Reports\\" + folderDate + "\\";
static final String CONSTANTIMGFOLDERPATH="images_";
static String reportFileName="MyProject Automation Report";
static String regressionReportFileName="Regression Automation Report";
static final String TESTNGTEST = ReadPropertiesFile.getInstance().getTestNGtestval();

static String reportPath =CONSTANTREPORTPATH;
static String imageFolderPath= CONSTANTIMGFOLDERPATH;
static Boolean Status = true;

static Date stTime = new Date();
static Date enTime = new Date();

static int nPass= 0;
static int nFail =0;

public static int IterationCount = 1;
public static int PassedIterationCount =1;
public Dictionary<String, String> settings = null;

//static Scenario scenario;

private static final Logger LOGGER = Logger.getLogger(HtmlReporter.class);
private static String td = "<td>";
private static String tr = "</tr>";
private static String tD = "</TD>";
private static String tds = "</td>";

static WebDriver driver;

public void HtmlReporter1()
{
	nPass=0;
	nFail =0;
	LOGGER.info("I am in Reporter class method...........");
	
	SimpleDateFormat sdf = new SimpleDateFormat ("ddMM_HHmmss");
	String strDate = sdf.format(new Date());
	LOGGER.info("Current date in String Format: "+ strDate);
	
	File reportFolderdir = new File(reportPath);
	
	if(!reportFolderdir.exists())
	{
		reportFolderdir.mkdir();
	}
	
	String rpath= reportPath;
	if("Y".equals(TESTNGTEST))
	{
		StepDef.scenarioName="End-To-End-Test-Execution-Report";
		
	}
	
	if(!(reportPath.contains(Stepdef.scenarioName)))
	{
		rpath = reportPath;
		imageFolderPath= CONSTANTIMGFOLDERPATH;
		reportPath= rpath + StepDef.scenarioName + strDate;
	}
	
	File reportdir= new File(reportPath);
	if(!reportdir.exists())
		reportdir.mkdir();
	
	if(("images_").equals(imageFolderPath))
	{
		imageFolderPath= imageFolderPath + StepDef.scenarioName + strDate;	
	
	}
	
}
	public void BeginScenario(String scenarioName)
	{
		
		LOGGER.info("I am in begin Scenario");
		HtmlReporter1();
		PrepareNewReport();
		ReportStep("<b>Application Page</b>", " <b>Scenario: " + scenarioName + "</b> ", true, false);
		
		stTime = new Date();
		
	}
	
	static String captureScreenShot(String uploadPath)
	{
		String fileName= null;
		fileName= (new Date()).toString().replace("//","").replace(":", "")+".png";
		
		File theDir = new File(uploadPath + "\\" + imageFolderPath);
		
		if(!theDir.exists())
		{
			theDir.mkdir();
		}
		
		File srcFile= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			
			FileUtils.copyFile(srcFile, new File(uploadPath + "\\" + imageFolderPath + "\\" + fileName));
		}
		
		catch (Exception e)
		{
			
			LOGGER.equals("Error occured during copying sreenshot: " + e);
		}
		
		return ".\\" + imageFolderPath + "\\" + fileName;
	}
	
	
public void copyFile(File srcFile , File destFile)
{
	if(!destFile.exists())
	{
		destFile.createNewFile();
	}
	
	FileChannel source = null;
	FileChannel destination = null;
	
	try
	{
	source= new FileInputStream(srcFile).getChannel();
	destination = new FileInputStream(destFile).getChannel();
	destination.transferFrom(source, 0, source.size());
		
	}
	finally
	{
		if(source!=null)
		{
			source.close();
			
		}
		if(destination!=null)
		{
			destination.close();
		}
	}
}
	
public static void closeReport()
{
	FileWriter fstream = null;
	String newDirName ;
	
	try 
	{
		fstream = new FileWriter(reportFileName, true);
	}
	
catch (Exception e)
	{
	LOGGER.error("Error occurred in closing report: " + e);
	}
	BufferedWriter out = new BufferedWriter(fstream);
	
	try 
	{
	out.write("</table>");
	out.write("<h2>" + PROJECTNAME + " Automation Test Results Summary</h2>");
	out.write("<table id=\"subtable\">");
	out.write("<col></col>");
	out.write("<col></col>");
	out.write("<tr>");
	out.write("<th>The Total Number of Steps Executed</th>");
	int nScenarios = nPass + nFail;
	out.write(td + nScenarios + tds);
	out.write(tr);
	out.write("<th>The Total Number of Steps Passed</th>");
	out.write(td + nPass + tds);
	out.write("<tr>");
	out.write("<th>The Total Number of Steps Failed</th>");
	out.write(td + nFail + tds);
	out.write(tr);
	out.write("</tr>");
	out.write("<th>Start Time</th>");
	out.write(td + stTime + " " + tds);
	out.write(tr);
	out.write("<tr>");
	out.write("<th>End Time</th>");
	out.write(td + enTime + tds);
	out.write(tr);
	out.write("<tr>");
	out.write("<th>Execution Time</th>");
	Long execTime = (enTime.getTime() - stTime.getTime())/1000;
	out.write(td + Long.toString(execTime) + " Seconds" + tds);
	out.write(td + tds);
	
		
		
		
		
		
		
		
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}






