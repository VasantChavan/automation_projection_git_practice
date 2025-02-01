package com.automation_projection_git_practice.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {

	public void onStart(ITestContext context) {
		    System.out.println("Test Execution is started.....");
		  }
	public void onTestStart(ITestResult result) {
	    System.out.println("Test Started....");
	  }
	 public void onTestSuccess(ITestResult result) {
		    System.out.println("Test Passed....");
		  }
	 public void onTestFailure(ITestResult result) {
		    System.out.println("Test Failed....");
		  }
	 public void onTestSkipped(ITestResult result) {
		    System.out.println("Test Skipped....");
		  }
	 public void onFinish(ITestContext context) {
		    System.out.println("Test execution is completed....");
		  }
	 
	
}
