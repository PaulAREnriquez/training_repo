
public class Calculator {

	
	static {
		System.loadLibrary("calculator");
	
	}

	public native double add(double x, double y);
	public native double multiply(double x, double y);
	public native double subtract(double x, double y);
	public native double divide(double x, double y);



}