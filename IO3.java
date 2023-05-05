import java.io.*;

public class IO3 {
	public static void main(String args[]) throws IOException {
		File fo=new File("d:\\My Folders");
		fo.mkdir();
		File f= new File("d:\\Dear Diary.txt");
		f.createNewFile();
		f.exists();
		FileWriter fw = new FileWriter("d:\\My Folders\\Dear Diary.txt");
		BufferedWriter in = new BufferedWriter(fw);
		in.write("How you doing?");
		in.write("Stop imitating Joey all the time😒");
		in.flush();
		in.close();
	}

}
