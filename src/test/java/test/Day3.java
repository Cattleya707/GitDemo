package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	
	@BeforeClass
	public void beforeclas() {
		System.out.println("before executing any method in the class");
	}
	
	@Parameters({"URL", "APIKEY", })
    @Test
    public void WebloginCarLoan(String urlname, String key) {
        System.out.println("weblogIncar");
        System.out.println(urlname);
        System.out.println(key);
    }
	
	@BeforeMethod
	public void beforeEvery() {
		System.out.println("I appear first everytime in each method day 3 class!");
	}
	
	@AfterMethod
	public void afterEvery() {
		System.out.println("I appear last everytime in each method day 3 class!");
	}
	
	@AfterClass
	public void afterclas() {
		System.out.println("after executing any method in the java.class");
	}
	
	@Test (groups = {"Smoke"})
	public void MobileLogIncarLoan() {
		System.out.println("MobileLogIncarLoan");
	}
	
	@BeforeSuite
	public void Bfsuite() {
		System.out.println("I am no 1");
	}
	
	@Test(enabled=false) //skip the method. You can use this when bugs has reported
	public void MobileSignIncarLoan() {
		System.out.println("MobileLogIncarssLoan");
	}
		
	@Test (dataProvider="getData") //(timeOut=4000) //wait before the results throw an error
	public void MobileLogOutcarLoan(String username, String password) {
		System.out.println("MobileSignoutLoan");
		System.out.println(username);
		System.out.println(password);
	}
	
	
	
	@Test //(dependsOnMethods={"WebloginCarLoan", "MobileLogOutcarLoan"}) //test this method first before proceeding
	public void LoginAPIcarLoan() {
		System.out.println("LoginAPIcarLoan");
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2]; //3 rows, 2 columns 
		data[0][0] ="firstsetusername";
		data[0][1]="firstpassword";
		
		data[1][0] = "secondsetusername";
		data[1][1] = "secondsetpassword";
		
		data[2][0] = "thirdsetusername";
		data[2][1] = "thirdsetpassword";
		
		return data; 
		
	}
}
