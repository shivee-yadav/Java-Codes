
public class Solution4 {
	public static void main(String args[]) {
		 // Your Code Here
		int array[]= {1,2,3,5};
		int n=5;
        int sum1=n;
        int sum2=0;
        for (int i=0;i<n-1;i++){
            sum2 += array[i];
            sum1 += (i+1);
        }
        System.out.println(sum1+" "+sum2);
        
	}

}
