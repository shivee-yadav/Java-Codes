import java.util.Scanner;

public class Oness {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int N;
		N = sc.nextInt();
		String bin = "";
		int count = 0;
		for (int i = 1; i <= N; i++) {
			bin = Integer.toBinaryString(i);
			for (int j = 0; j < bin.length(); j++) {
				if (bin.charAt(j) == '1') {
					count++;
				}
			}
			bin = "";
		}
		System.out.println(count);
	}

}
