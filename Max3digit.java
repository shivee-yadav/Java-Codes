import java.util.Scanner;
public class Max3digit {
     public static void main(String args[]) {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter 4 digit number: ");
    	 int num=sc.nextInt();
    	 int a[]=new int[4];
    	 int b[]=new int[4];
    	 int i,j,num1=0,k=0;
    	 if(num>=1000&&num<=9999) //checking  whether the number is 4 digit or not
    	 {
	    	 for(i=3;i>=0;i--) {//spliting the number into individual digits
	    		 a[i]=num%10;
	    		 num/=10;
	    	 }
	    	 for(i=0;i<4;i++) {
	    		 System.out.print(a[i]+" ");//digits of the number
	    	 }
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
	    	 System.out.println();
	    	 for(i=0;i<4;i++) {
	    		 System.out.print(b[i]+"  ");//printing the array containing 3 digit numbers
	    	 }
	    	 System.out.println();
	
	    	 int max=b[0];
	 	     for(i=0;i<4;i++) {
	    		 if(b[i]>max) {
	    			 max=b[i];//finding the max elements
	       		 }
	    	 }
	    	 System.out.println(max);//required result
         }
    	 else {
    		 System.out.println("invalid input");//when user doesn't enter 4 digit number
    	 }
    }
}
     
