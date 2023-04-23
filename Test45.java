import java.io.*;
public class Test45 {
	public static void main(String args[]) throws IOException{
		FileReader fr=new FileReader("d:\\cricket.txt");
		int i=fr.read();//reads one byte
		while(i != -1) {//to get to the end of a file
			System.out.print((char)i);
			i=fr.read();
		}
		
	}
}