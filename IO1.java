
import java.io.*;
public class IO1 {
	public static void main(String args[])throws IOException {
		File f=new File("d:\\abc.txt");
		System.out.println(f.exists());//false-for Ist time
		f.createNewFile();
		System.out.println(f.exists());//true
		
		File f1=new File("d://cricket");
		System.out.println(f1.exists());//false
		f1.mkdir();//creates a directory
		System.out.println(f1.exists());//true
		File f2=new File("d:\\cricket","abcd.txt");//subfile
		f2.createNewFile();//creates a sub-file in the directory
		System.out.println(f2.exists());
		System.out.println("complete");
		
		//isFile,isDir,list()
		
	}

}
