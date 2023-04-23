
public class Throw2 extends RuntimeException{
	//throw-to hand over our created exception object to the JVM manually
	//new ArithmeticException("/ byzero")->creating Arithmetic Exception object explicitly
	
	static ArithmeticException e= new ArithmeticException();
	public static void main(String args[]) {
	//System.out.println(10/0);
	//throw e;
	//System.out.println("hello");//unreachable if the above code is writtenN
	//throw new Throw2();-->can't becuz throw2 doesnt extend RuntimeException class
	throw new Throw2();
}
}
