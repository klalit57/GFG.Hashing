package GFG;

import java.util.HashMap;

public class LongestSubArrayWithGivenSum {
    public static int longestSubArrayWithGivenSum1(int [] arr, int sum){  //MyCode & gfg efficient
        HashMap<Integer,Integer> h= new HashMap<>();
        int preSum=0;
        int length=0;
        for(int i=0;i<arr.length;i++){
            preSum+=arr[i];
            if(preSum==sum){
                length=i+1;
            }
            if(h.containsKey(preSum)==false) {
                h.put(preSum, i);
            }
            if(h.containsKey(preSum-sum)){
                length=Math.max(length,i-h.get(preSum-sum));
            }
        }
        return length;
    }

    public static int longestSubArrayWithGivenSum2(int [] arr, int sum){   //GFG Naive Method
        int res=0;
        for(int i=0;i<arr.length;i++){
            int currSum=0;
            for(int j=i;j<arr.length ;j++){
                currSum+=arr[j];
                if (currSum == sum) {
                    res=Math.max(res,j-i+1);  //ith element included
                }
            }
        }
        return res;
    }

    public static void main(String [] args){
        int [] arr1={5,8,-4,-4,9,-2,2};
        System.out.println(longestSubArrayWithGivenSum1(arr1,0));
        int [] arr2={3,1,0,1,8,2,3};
        System.out.println(longestSubArrayWithGivenSum1(arr2,5));
        int [] arr3={8,3,1,5,-6,6,2,2};
        System.out.println(longestSubArrayWithGivenSum1(arr3,4));



        System.out.println(longestSubArrayWithGivenSum2(arr1,0));
        System.out.println(longestSubArrayWithGivenSum2(arr2,5));
        System.out.println(longestSubArrayWithGivenSum2(arr3,4));

    }
}
