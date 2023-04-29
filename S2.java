import javax.swing.*;
import java.awt.*;

public class S2 extends JFrame {
	
	JPanel p1;//flow layout,align-centre
	JCheckBox jc1,jc2;
	JRadioButton r1,r2;
	JTextArea ta1;
	JList Ls;
	
	public S2() {
		this.setVisible(true);
		this.setSize(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p1=new JPanel();
		jc1=new JCheckBox("Bold");
		jc2=new JCheckBox("Italic");
		p1.add(jc1);
		p1.add(jc2);
		
		r1=new JRadioButton("Male");
		r2=new JRadioButton("Female");
		ButtonGroup grp=new ButtonGroup();
		grp.add(r1);grp.add(r2);
		p1.add(r1);
		p1.add(r2);
		
		ta1=new JTextArea(5,20);//multiline textbox
		JScrollPane js1=new JScrollPane(ta1);
		p1.add(js1);
		
		String s[]= {"Red","Blue","Black","Yellow","Green"};
		Ls=new JList(s);
		JScrollPane js2=new JScrollPane(Ls);
		Ls.setVisibleRowCount(3);
		p1.add(js2);
		
		
		this.add(p1);
		
		p1.setBackground(Color.RED);
		Color c=new Color(50,200,100);//r,g,b max 255
		
		ta1.setBackground(Color.YELLOW);
		ta1.setForeground(c);
		
		Font f=new Font("Ariel",Font.BOLD,30);
		ta1.setFont(f);//text area will have a font as mentioned in the f object
		//jc1.setFont(f);//buttons will have a font as mentioned in the f object
		this.setSize(500,600);
		
		
		
		
	}
	public static void main(String args[]) {
		S2 obj = new S2();
		
	}

}
