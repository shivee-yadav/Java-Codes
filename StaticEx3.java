
public class StaticEx3 {
	static int cnt;//only one copy of cnt is there for different objects
	int cnt2;//different copy for different objects
	public StaticEx3() {
		cnt++;
		System.out.println(cnt);
	}

	public static void main(String args[]) {
		StaticEx3 obj1=new StaticEx3();
		StaticEx3 obj2=new StaticEx3();
		StaticEx3 obj3=new StaticEx3();

	}
}
