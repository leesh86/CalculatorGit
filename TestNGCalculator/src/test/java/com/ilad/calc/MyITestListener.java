package com.ilad.calc;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyITestListener implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+ "--Test method starting\n");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+ "--Test method succeeded\n");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName()+ "--Test method failed\n");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName()+ "--Test method skipped\n");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		
	}
   /*
	private int m_count = 0;
	 
    public void onTestFailure(ITestResult tr) {
        log(tr.getName()+ "--Test method failed\n");
    }
	 
    public void onTestSkipped(ITestResult tr) {
        log(tr.getName()+ "--Test method skipped\n");
    }
	 
    public void onTestSuccess(ITestResult tr) {
        log(tr.getName()+ "--Test method success\n");
    }
    
    public void onTestStart(ITestResult tr) {
        log(tr.getName()+ "--Test method starting\n");
    }
	 
    private void log(String string) {
        System.out.print(string);
        if (++m_count % 40 == 0) {
	    System.out.println("");
        }
    }
*/
}
