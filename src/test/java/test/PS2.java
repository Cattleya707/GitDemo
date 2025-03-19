package test;

import org.testng.annotations.Test;

//CHILD
public class PS2 extends PS1 {	
	
	
	@Test
	public void testRun() {
		int a =3;
		doThis();
		
		//others to call another.java class is to create an object asides from inheritance
		PSreusable psr = new PSreusable(3);
		System.out.println(psr.increment());
		System.out.println(psr.decrement());
		System.out.println(psr.multiplyThree());
		
	}
	
}
