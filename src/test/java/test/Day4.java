package test;

import org.testng.annotations.Test;

public class Day4 {

	@Test
	public void WebloginHomeLoan() {
		System.out.println("weblogInHome");
	}
	
	@Test (groups = {"Smoke"})
	public void MobileLogInHomeLoan() {
		System.out.println("MobileLogInHome");
	}
	
	@Test
	public void LoginAPIHomeLoan() {
		System.out.println("LoginAPIHome");
	}
}
