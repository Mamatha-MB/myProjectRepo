package testFrames;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utilities.pageUtils;

public class ListenerClass implements ITestListener{
	public void onTestFailure(ITestResult arg0) {
	  // TODO Auto-generated method stub
		
		 TakesScreenshot ts = (TakesScreenshot)pageUtils.driver;
		  
		  File srcFile = ts.getScreenshotAs(OutputType.FILE);
		  System.out.println("new screenshots are created");
		  
		  try {
		   FileUtils.copyFile(srcFile, new File("M://test.png"));
		  } catch (IOException e) {
		   e.printStackTrace();
		  }
	  
	 }

	 public void onTestSkipped(ITestResult arg0) {
	  // TODO Auto-generated method stub
	  
	 }

	 public void onTestStart(ITestResult arg0) {
	  // TODO Auto-generated method stub
	  
	 }

	 public void onTestSuccess(ITestResult arg0) {
	  // TODO Auto-generated method stub
		 
		 TakesScreenshot ts = (TakesScreenshot)pageUtils.driver;
		  
		  File srcFile = ts.getScreenshotAs(OutputType.FILE);
		  System.out.println("new screenshots are created for success");
		  try {
		   FileUtils.copyFile(srcFile, new File("M://test.png"));
		  } catch (IOException e) {
		   e.printStackTrace();
		  }
	  
	  
	 }
	
}
