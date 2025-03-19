package test;

import org.testng.IClassListener;
import org.testng.ITestResult;

public class Listeners implements IClassListener {
	
	//if the test pass, it will go here
	public void onTestSucess(ITestResult result) {
		System.out.println("execution sucess");
	}
	
	//if the test fails, it will go here
		public void onTestFailure(ITestResult result) {
			System.out.println("execution failed because of " + result.getName());
		}
	
	

}
