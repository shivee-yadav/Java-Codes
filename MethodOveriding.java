class Parent100{
	int x=88;
	static int count=0;{
		count++;
	}
}
public class MethodOveriding {
	public static void main(String args[]) {
		Parent100 p= new Parent100();
		System.out.println(Parent100.count);
	}

}
