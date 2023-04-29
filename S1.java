import javax.swing.*;
public class S1 extends JFrame {
	
	JLabel L1,L2;//message
	JTextField t1;
	JPasswordField t2;
	JButton b1,b2;
	JPanel p1;//container to carry all the controls all together
	
	public S1() {
		this.setVisible(true);
		this.setSize(350,150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		L1=new JLabel("User Name");
		L2=new JLabel("Password");
		t1=new JTextField(20);
		t2=new JPasswordField(20);
		b1=new JButton("login");
		b2=new JButton("Cancel");
		p1=new JPanel();
		
		p1.add(L1);
		p1.add(t1);
		p1.add(L2);
		p1.add(t2);
		p1.add(b1);
		p1.add(b2);
		
		this.add(p1);
		this.setSize(325,150);
		this.setTitle("Security Check...");//title
		this.setResizable(false);
		
		p1.setBorder(BorderFactory.createTitledBorder("login"));//
		
		this.setBounds(100,100,325,150);///to align the panel in a certain position
		
		
		
		
	}
	public static void main(String args[]) {
		/*JFrame frm= new JFrame();
		frm.setVisible(true);
		frm.setSize(400,500);*/
		S1 obj=new S1();
		
	}

}
