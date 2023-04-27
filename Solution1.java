class Solution1 {
    
    public static void reverse(int []arr,int si,int ei){
        int i=si,j=ei;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
    }
    void leftRotate(int[] arr, int n, int d) {
        // code here
        d=d%n;
        if(d==0||d==n)
            return;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        
    }
    
}