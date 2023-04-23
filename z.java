
public class z extends test.x{//package name with class to be extended
	
	public void test() {
		super.i=109;
		super.a1();
		super.l=5;
		
		test.x obj=new test.x();
		obj.i=5;
		obj.a1();
		//obj.a4();-->can't do this 
		
	}

}
