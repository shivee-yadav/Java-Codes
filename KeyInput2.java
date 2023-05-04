import java.io.*;
public class KeyInput2 {
	public static void main(String args[]) throws IOException{
		FileWriter fw=new FileWriter("d:\\cricket.txt");
		BufferedWriter in=new BufferedWriter(fw);
		in.write(100);
		in.newLine();
		char[] ch= {'s','h','i','v','e','e'};
		in.write(ch);
		in.newLine();
		in.write("yadav");
		in.newLine();
		in.write("yo");
		in.flush();
		in.close();
		
		
		
	}

}
