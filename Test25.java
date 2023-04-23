class Student{
	private String name;
	private String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(email.indexOf("@")==-1)
			this.email="Invalid Email";
		else
			this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length()<3)
			this.name="Invalid Name";
		else
			this.name = name;
	}
	
}
public class Test25 {
	public static void main(String args[]) {
		Student s= new Student();
		s.setName("shivee");
		s.setEmail("yo@gmail.com");
		System.out.println("Name :"+s.getName()+"\nEmail :"+s.getEmail());
	}

}
