class Parent20{
	public void property() {
		System.out.println("Cash+Land+Gold");
	}
	public void marry() {
		System.out.println("surbhi");
	}
}
class Child extends Parent20{
	public void marry() {
		System.out.println("tara");
	}
}
public class Test32 {
	public static void main(String args[]) {
		Parent20 p = new Parent20();
		Child c= new Child();
		p.marry();
		c.marry();
		Parent20 p1=new Child();
		p1.marry();
	}

}
