import java.util.*;
class CustomAgeException extends RuntimeException{
	CustomAgeException(String s){
		super(s);
	}
	
}
public class TryCatch {
	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);

		System.out.print("Give a number: ");
		int Number = -1;

		try {
			Number = Integer.parseInt(reader.nextLine());
			if(Number>20) {
				throw new CustomAgeException("Age is more than 20");
				
			}
			else {
			System.out.println("Good job!");
			}
		} catch (Exception e) {
			System.out.println("User input was not a number.");
		}

	}
}
