import java.io.*;
public class KeyInput {

	public static void main(String[] args) throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));//bufferedreader-->memory
		String name=in.readLine();
		System.out.println("Your name is :"+name);
		//system.in->reads from keyboard
		//system.file->reads from file

	}

}
