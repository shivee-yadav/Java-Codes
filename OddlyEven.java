import java.util.Scanner;
public class OddlyEven {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=sc.nextInt();
		int k=0,eve=0,odd=0,n1=0;
		while(n>0) {
			int rem=n%10;
			n1=n1*10+rem;
			n/=10;
			
		}
		System.out.println(n1);
		while(n1>0) {
			int rem=n1%10;
			if(k%2==0) 
				odd+=rem;
			else
				eve+=rem;
			n1/=10;
			k++;
			
		}
		System.out.println("The difference between sum of digits at odd and even position is "+Math.abs(odd-eve));
		
		
	}

}
