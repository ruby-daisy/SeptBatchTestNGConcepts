package ins.aiite.TestNGFails;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportClass implements ITestListener{
	
	private ExtentReports extent;
	private ExtentTest test;
	
	public void onTestStart(ITestResult result) 
	{
		
		test=extent.createTest(result.getMethod().getMethodName());
	  }
	
	public void onTestSuccess(ITestResult result) 
	{
	    test.log(Status.PASS, "Test Passed");
	  }
	
	public void onTestFailure(ITestResult result) 
	{
		 test.log(Status.FAIL, "Test Failed");
	  }
	
	public void onTestSkipped(ITestResult result) 
	{
		 test.log(Status.SKIP, "Test Skipped");
		  }
	 
	public void onStart(ITestContext context) 
	{
		extent=new ExtentReports();
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter("target/ExtentReport/TestReport.html");
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Team", "Gladiators");
		extent.setSystemInfo("Tester", "Ruby,Daisy");
		  }
	 
	public void onFinish(ITestContext context) 
	{
		    extent.flush();
		  }
	
	

}
