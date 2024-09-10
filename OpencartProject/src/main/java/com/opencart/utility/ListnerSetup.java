package com.opencart.utility;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.opencart.tastbase.Testbase;

public class ListnerSetup extends Testbase implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		logger.info("Test case execution started="+result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		logger.info("Test case execution completed="+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info("Test case execution failed="+result.getName());
		UtilClass.captureScreenshot(result.getName());
		logger.info("capture screenshot");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info("Test case execution skipped="+result.getName());
		
	}

	

}
