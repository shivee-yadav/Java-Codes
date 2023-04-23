
public class Test30 {
	public void methodOne(int i) {
		
		System.out.println("int-arg method");
	}
	public void methodOne(float f) {
		System.out.println("float arg method");
	}
	
	public static void main(String args[]) {
		Test30 t= new Test30();
		 t.methodOne('a');//it will promote one level further if it can't find the desired method
		 t.methodOne(10.5f);//if you will not put "f" , it will assume that 10.5 is double which will be a compile time error
	}
}
