
public class Test1 {
	public static void main(String args[]) {
		System.out.println("Statement 1");
		System.out.println(10/0);//ArithemeticException
		System.out.println("Statement 3");//this will never get executed
	}

}
