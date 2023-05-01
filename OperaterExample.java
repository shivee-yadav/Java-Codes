
public class OperaterExample {
	public static void main(String agrs[]) {
		int x=10,y=5,z=9;
		System.out.println(x++);
		System.out.println(++x);
		System.out.println(x--);
		System.out.println(--x);
		//
		System.out.println(y<z&&y++<z);
		System.out.println(y);
		System.out.println(y<z&&y++<z);
		System.out.println(y);
		int c=y&z;
		int d=y|z;
		System.out.println(y+" "+z);
		System.out.println(c);
		System.out.println(y+" "+z);
		System.out.println(d);
		int a=10,b=5,cc=20;
		System.out.println(a>b||a<cc);
		System.out.println(a);
		System.out.println(a>b|a<cc);
		System.out.println(a);
		System.out.println(a>b||a++<cc);
		System.out.println(a);
		System.out.println(a>b|a++<cc);
		System.out.println(a);

	}

}
