import java.io.*;

public class IO2 {

	public static void main(String[] args) {
		int count = 0, count1 = 0,count2=0;
		File f = new File("d:\\pcode");
		String s[] = f.list();// list of files and directories in the directory
		for (String file : s) {
			count++;
			// System.out.println(file);
		}
		System.out.println("No. of files in folder :" + count);

		// list of only files in the directory
		for (String file : s) {
			File f1 = new File(f, file);
			if (f1.isFile()) {
				count1++;
				System.out.println(f1);
			}
		}
		System.out.println("No. of files in folder :" + count1);

		// list of only directories

		for (String file : s) {
			File f1 = new File(f, file);
			if (f1.isDirectory()) {
				count2++;
				System.out.println(f1);
			}
		}
		System.out.println("No. of files in folder :" + count2);

	}

}
