package GFG;

import java.util.HashMap;

public class LongestCommonBinarySubArrayWithEqualSum {

    public static int longestCommonSubArrayWithGivenSum1(int [] arr1 , int [] arr2){  //GFG Naive
         int res=0;
         for(int i=0;i<arr1.length;i++){
             int sum1=0;
             int sum2=0;
             for(int j=i;j<arr1.length;j++){
                 sum1+=arr1[j];
                 sum2+=arr2[j];
                 if(sum1==sum2){
                     res=Math.max(res,j-i+1);
                 }
             }
         }
         return res;
    }

    public static int longestCommonSubArrayWithGivenSum2(int [] arr1 , int [] arr2){ //GFG Efficient code
        int [] temp = new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            temp[i]=arr1[i]-arr2[i];
        }
        return longestSubArrayWithGivenSum1(temp,0);
    }

    public static int longestSubArrayWithGivenSum1(int [] arr, int sum){
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



    public static void main(String [] args){
        int [] arr1= {0,1,0,0,0,0};
        int [] arr2= {1,0,1,0,0,1};
        System.out.println(longestCommonSubArrayWithGivenSum1(arr1,arr2));

        System.out.println(longestCommonSubArrayWithGivenSum2(arr1,arr2));
    }
}
