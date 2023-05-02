
public interface MyInterface {
	void x();

}

interface MyInterface1{
	void y();
}

interface MyInterface2{
	void z();
}

class Test21 implements MyInterface,MyInterface1,MyInterface2{//one class can "implements" multiple interfaces
	public void x() {
		
	}
	public void y() {
		
	}
	public void z() {
		
	}
}

interface MyInterface3 extends MyInterface,MyInterface1,MyInterface2{//one interface can "extends" multiple interfaces
	//but a class can only extend one class
	
	
}

abstract class Test22 implements MyInterface3{//it gives error when the previous interfaces' functions are not declared hence it has been declared abstract
	
	
	
	
	
}


class Test23 extends Test22{
	public void x() {}
	public void y() {}
	public void z() {}
}






















