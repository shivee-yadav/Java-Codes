class Chill{
	Chill(){
		System.out.println("child");
	}
}
public class StaticOverride {
	public static void main(String args[]) {
		byte b=65;
		switch(b) {
		case 1 :System.out.println("1");break;
		default : System.out.println("default");break;
		case 2 :System.out.println("2");break;
		case 'A' :System.out.println("A");break;
		
		
		}
		
		int i=2;
		int x[]= {10,20,50,45,95,14};
		i = i = i+1;
		System.out.println(x[i=i++]);
		System.out.println(i);
		//x[i]=x[i=i++];
		
		System.out.println(x[i]);
	}

}
