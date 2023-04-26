import java.io.*;
public class Stream1 {
	public static void main(String args[]) throws IOException {
		FileWriter fw=new FileWriter("d:\\cricket.txt",true);
		fw.write(99);
		fw.write("Class is gonna end soon");
		fw.write("\n");
		char[] ch= {'a','b','c'};
		fw.write(ch);
		fw.flush();
		fw.close();
		
		
	}

}
