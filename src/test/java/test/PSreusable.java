package test;

public class PSreusable extends PS3 {

	int a ;
	public PSreusable(int a) {
		
		super(a);
		this.a=a;
	}

	public int increment() {
		a= a+1;
		return a;
		
	}
	
	public int decrement() {
		a= a-1;
		return a;
		
	}
}
