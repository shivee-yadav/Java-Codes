
public class ThreadTest {

	public static void main(String[] args) throws Exception {
		Thread obj=Thread.currentThread();
		System.out.println("Current Thread name: "+obj.getName());
		obj.setName("My thread");
		System.out.println("Current Thread Name :"+obj.getName());
		String w="Welcome to my Project";
		char c[]=w.toCharArray();
		for(char val:c) {
			System.out.println(val);
			obj.sleep(500);
		}

	}

}
