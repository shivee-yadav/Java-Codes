
public class Test3 {
	public static void main(String args[]) {
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e){
			e.printStackTrace();//java.lang.ArithmeticException: / by zero
			                   //at Test3.main(Test3.java:5)
			System.out.println();
			System.out.println(e);//java.lang.ArithmeticException: / by zero
			System.out.println();
			System.out.println(e.getMessage());//                  / by zero
		}
	}

}
