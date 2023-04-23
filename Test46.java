import java.io.*;
public class Test46 {
	public static void main(String args[])throws IOException{
		File f=new File("d:\\cricket.txt");
		FileReader fr=new FileReader(f);
		char[] ch=new char[(int)f.length()];
		fr.read(ch);
		for(char ch1:ch) {
			System.out.print(ch1);
		}
		
	}
}
