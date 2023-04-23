class Address{
	String city;
	String state;
	String pincode;
	
	Address(String c, String s, String p){
		this.city=c;
		this.state=state;
		this.pincode=p;
	}
}

class Emp{//Emp  doesn't has a direct relationship with Address
	int id;
	String name;
	Address obj;//Emp HAS-A Address attribute
	Emp(int i,String n, Address a){
		this.id=i;
		this.name=n;
		this.obj=a;
	}
}
public class Test28 {
	public static void main(String args[]) {
		
		Address a1=new Address ("JBP","MP","482001");
		Address a2=new Address ("Bhopal","MP","462001");
		Address a3=new Address ("Katni","MP","442001");

		Emp e1= new Emp(1,"a",a1);
		Emp e2= new Emp(2,"b",a1);
		Emp e3= new Emp(3,"c",a2);
		Emp e4= new Emp(4,"d",a3);
		
		System.out.println("id: "+e1.id+" Name: "+e1.name+" city:"+a1.city+"");
	}

}
