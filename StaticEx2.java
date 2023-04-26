
public class StaticEx2 {
	
	public static void main(String args[]) {
		System.out.println("3*3*3*3="+Math.pow(3,4));
		System.out.println("Random number ="+Math.random());//from 0.0-.99
		System.out.println("Random number from 1-99="+(int)(Math.random()*100));//from 1-99
		System.out.println("Random number from 1-100="+(int)(Math.random()*100+1));//from 1-100
        //System->Class
		//out-->static object (isn't an object of system class)
		//println-->function of out object
		StaticEx1.x();
		
				
		
	}

}
