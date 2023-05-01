
public class ObjectClassArray {

	public static void main(String[] args) {
		Object d[]=new Object[10];//-->any object
		d[0]=new Integer(10);
		d[1]=new Object();
		d[2]=new String("Hello");
		d[3]=new Double(5.5d);
		
		Number arr1[]=new Number[5];//->number object
		arr1[0]=new Integer(5);
		arr1[1]=new Float(5.5f);
		//arr1[2]=new String("abc");
		//arr1[3]=new Char('a');
		
		int a[]= {10,20,30};
		int b[]=a;//pass by reference
		System.out.println(a+"    "+b);
		b[0]=100;
		System.out.println(a[0]);//change in value of a cuz refernce was passed
		
		
		char c[]= {'a','b','c'};
		//int d[]=c;invalid cuz character array cannot be converted into integer array
		
		
		
		
		
		

	}

}
