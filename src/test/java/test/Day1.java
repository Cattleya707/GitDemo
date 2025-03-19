package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {  // ✅ Capitalized class name

    @AfterTest
    public void Lastexec() {
    	System.out.println("last");
    }
	
	@Test
    public void demo() {
        System.out.println("Hello!");
    }
	
	@AfterSuite
	public void afSyite() {
		System.out.println("I am the last Suite!");
	}
    
    @Test
    public void SecondTest() {
    	System.out.println("bye");
    }
}
