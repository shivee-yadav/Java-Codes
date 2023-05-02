import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class Notepad extends JFrame implements ActionListener{
	
	JMenuBar mb1;
	JMenu mFile,mEdit,mTools,mHelp;
	JMenuItem fnew,fopen,fsave,fprint,fexit;
	JMenuItem ecut,ecopy,epaste,eselectall;
	JMenuItem tcompile,trun,tview;
	JMenuItem habout;
	
	JEditorPane jed;
	JFileChooser jfc=new JFileChooser();
	
	public Notepad() {
		this.setSize(500,500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mb1=new JMenuBar();
		mFile=new JMenu("File");
		mEdit=new JMenu("Edit");
		mTools=new JMenu("Tools");
		mHelp=new JMenu("Help");
		fnew=new JMenuItem("New");
		fopen=new JMenuItem("Open");
		fsave=new JMenuItem("Save");
		fprint=new JMenuItem("Print");
		fexit=new JMenuItem("Exit");
		ecut=new JMenuItem("Cut");
		ecopy=new JMenuItem("Copy");
		epaste=new JMenuItem("Paste");
		eselectall=new JMenuItem("Select All");
		tcompile=new JMenuItem("Compile");
		trun=new JMenuItem("Run");
		tview=new JMenuItem("View");
		habout=new JMenuItem("About");
		
		mFile.add(fnew);mFile.add(fopen);mFile.add(fsave);mFile.add(fprint);mFile.add(fexit);
		
		mEdit.add(ecut);mEdit.add(ecopy);mEdit.add(epaste);mEdit.add(eselectall);
		
		mTools.add(tcompile);mTools.add(trun);mTools.add(tview);
		
		mHelp.add(habout);
		
		mb1.add(mFile);mb1.add(mEdit);mb1.add(mTools);mb1.add(mHelp);
		this.setJMenuBar(mb1);
		jed=new JEditorPane();
		this.add(jed);
		
		fnew.addActionListener(this);
		fopen.addActionListener(this);
		fsave.addActionListener(this);
		fprint.addActionListener(this);
		fexit.addActionListener(this);
		
		ecut.addActionListener(this);
		ecopy.addActionListener(this);
		epaste.addActionListener(this);
		eselectall.addActionListener(this);
		tcompile.addActionListener(this);
		trun.addActionListener(this);
		tview.addActionListener(this);
		habout.addActionListener(this);

		
		
		
		
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==fnew) {
			
		}
		
        if(e.getSource()==fsave) {
        	jfc.showSaveDialog(this);
        	
			try {
				File f= jfc.getSelectedFile();
				FileWriter fw = new FileWriter(f,true);
				fw.write(jed.getText());
	        	fw.flush();
	        	fw.close();
			} catch (Exception ex) {
				
				}
        }
        	if(e.getSource()==fopen) {
        		jfc.showOpenDialog(null);
        		try {
        			File f=jfc.getSelectedFile();
        			FileInputStream fin=new FileInputStream(f);
        			byte data[]=new byte[fin.available()];
        			fin.read(data);
        			jed.setText(new String(data));
        			this.setTitle(f.getAbsolutePath());
        		}
        		catch(Exception ex) {
        			
        		}
        	
			
		}
		
	}
    public static void main(String srgs[]) throws IOException {
    	 new Notepad();
    }
}
