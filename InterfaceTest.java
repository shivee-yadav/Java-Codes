class Circle implements Area{
	public float compute(float a, float b) {
		return pi*a*a;
	}
	
}


class Rectangle implements Area{
	public float compute(float a,float b) {
		return a*b;
	}
}


public class InterfaceTest {
	public static void main(String args[]) {
		Circle c=new Circle();
		Rectangle r= new Rectangle();
		System.out.println("Area of Circle = "+c.compute(10, 0));
		System.out.println("Area of Rectangle ="+r.compute(10, 20));
		
	}

}
