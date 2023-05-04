import javax.swing.*;

import java.awt.event.*;//EventLister interface,Event classes

public class LogIn extends JFrame implements ActionListener{

  JLabel L1,L2;
  JTextField t1;
  JPasswordField t2;
  JButton b1,b2;
  JPanel p1;//container
  
  public LogIn()
  {
    this.setVisible(true);
    this.setSize(350,150);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    L1 =new JLabel("User Name");
    L2 = new JLabel("Password");
    t1 = new JTextField(20);
    t2 = new JPasswordField(20);
    b1 = new JButton("login");
    b2 = new JButton("Cancel");
    p1 =new JPanel();
    
    p1.add(L1);
    p1.add(t1);
    p1.add(L2);
    p1.add(t2);
    p1.add(b1);
    p1.add(b2);
    
    this.add(p1);
    this.setSize(351,150);
    this.setTitle("Security Check...");
    this.setResizable(false);
    
    p1.setBorder(BorderFactory.createTitledBorder("Login"));
    this.setBounds(100,100,351,150);
    b1.addActionListener(this);
    b2.addActionListener(this);
  }
  
  public void actionPerformed(ActionEvent e)
  {
    if(e.getSource()==b1)
    System.out.println("clicked....");
    else
      System.exit(0);
  }
  public static void main(String args[])
  {
    LogIn obj = new LogIn();
    
    /*
     * JFrame frm = new JFrame(); frm.setVisible(true); frm.setSize(400,500);
     */
    
  }
}
