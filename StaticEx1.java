
public class StaticEx1 {
	int j;//can be accessed throughout the class but in static members only with the help of objects
	static int i;
	static void x() {//only static content
		StaticEx1.i=100;
		System.out.println("x");
		System.out.println(i);
		
	}
	void y() {//in non static --< static and non static can be accessed
		StaticEx1.i=200;
		j=10;
		System.out.println("y");
		System.out.println(i);
		System.out.println(j);
	}
	public static void main(String args[])//jvm calls main function first
	{
		//j and y() without the object will give an error 
		i=10;//StaticEx1.i=10;
		System.out.println("Main:");
		System.out.println(i);//-->static data member can be called directly
		x();//-->static member can be directly called
		StaticEx1.x();//another method of calling a static variable
		
		StaticEx1 obj=new StaticEx1();//no need to create the object if all the data members and functions are static
		obj.j=100;
		obj.y();
		System.out.println(obj.j);
		
	}
	
	static{//static block always comes in memory first
		i=20;
		System.out.println(i);
		int k=5;
		System.out.println(k);
		
	}
	
	static{
		
		int k1=50;
		System.out.println(k1);
		
	}

}
