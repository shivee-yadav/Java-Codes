import java.util.Scanner;
public class Max3digitsFunc {
	int i,j,k=0;
	public int[] split(int num) {
		int a[]=new int[4];
		for(i=3;i>=0;i--) {//Splitting the number into individual digits
   		 a[i]=num%10;
   		 num/=10;
   	    }
		return a;
	}
	public int[] digits(int a[]) {
		int num1=0;
		int b[]=new int[4];
		for(i=0;i<4;i++) {
   		 for(j=0;j<4;j++) {
   			 if(j==i) {
   				 continue;
   			 }
   			 else {
   			 num1=num1*10+a[j];//storing 3 digits numbers into another array
   		     }
   		 }
   		 b[k]=num1;
   		 k++;
   		 num1=0;
   	 }
		return b;
	}
	
	public int max3digits(int b[]) {
		int max=b[0];
	     for(i=0;i<4;i++) {
   		 if(b[i]>max) {
   			 max=b[i];//finding the max element
      		 }
   	     }
	     return max;
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a 4-digit number");
		int num=sc.nextInt();
		Max3digitsFunc ob=new Max3digitsFunc();
		if(num>=1000&&num<=9999) {
		System.out.println(ob.max3digits(ob.digits(ob.split(num))));
		}
		else {
			System.out.println("invalid input");
		}
	}

}
