abstract class GrandParent{
	int i=10;
	abstract String getData();
	public void print() {
		System.out.println(getData());
	}
}

class Child1 extends GrandParent{
	String getData() {
		return "child1";
		
	}
}

class Child2 extends GrandParent{
	String getData() {
		return "child2";
		
	}
}

abstract class Child3 extends GrandParent{
	abstract void x();
}

class Child4 extends Child3{
	String getData() {
		return "Child4";
	}
	void x() {
		
	}
}



public class Parent {
	public static void main(String args[]) {
		Child1 c1= new Child1();
		c1.print();
		
		Child2 c2= new Child2();
		c2.print();
		
		Child4 c4=new Child4();
		c4.print();
	}

}
