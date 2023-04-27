import java.util.HashMap;

public class Solution3 {
	static boolean findsum(int arr[],int n)
    {
        //Your code here
        HashMap<Integer,Boolean> map=new HashMap<>();
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0 || arr[i]==0 || map.containsKey(sum))
            return true;
            map.put(sum,true);
        }
        return false;
    }

}
