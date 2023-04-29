class Chi{
	Chi(){
		System.out.println("child");
	}
}
public class Polymorph extends Chi {
	
	public Polymorph() {
		System.out.println("Parent");
	}

	public static void main(String[] args) {
		Chi p1=new Chi();
	}

}//you cannot override private and final methods
//while overriding we ca't reduce the scope of access modifier
/* public void methodOne()
 * and
 * protected void methodOne()
 * the above two are not possible
 * 
 * public   protected  				 default   					private
 *   |          |          				|         					|
 * public   protected/public    default/public/protected        cannot override
 * private<default<protected<public
 * 
 * 
 * 
 * if child class has throws , parent must have throws
 * 
 * we can't override static as non static and vice versa
 * 
 * if both has static ,it seems like overriding but it is method hiding , i.e., it'll hide child method
 */
