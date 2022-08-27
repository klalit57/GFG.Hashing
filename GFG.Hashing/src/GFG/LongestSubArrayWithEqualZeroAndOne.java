package GFG;

import java.util.HashMap;

public class LongestSubArrayWithEqualZeroAndOne {
//    public static int longestSubArrayEqualZeroAndOne1(int [] arr){  //
//        int res=0;
//        int sum=0;
//        for(int i=0;i<arr.length;i++){
//           sum+=arr[i];
//        }
//        int low=0;
//        int high=arr.length-1;
//        while(low<high){
//            if(sum==(high-low+1)/2){
//                return (high-low+1)/2;
//            }
//        }
//
//        return res;
//    }

    public static int longestSubArrayEqualZeroAndOne2(int [] arr){  //GFG Naive
        int res=0;
        for(int i=0;i<arr.length;i++){
            int c0=0;
            int c1=0;
            for(int j=i;j<arr.length;j++){
                if(arr[j]==0){
                    c0++;
                }
                if(arr[j]==1){
                    c1++;
                }
                if(c0==c1){
                    res=Math.max(res,c0+c1);
                }
            }
        }
        return res;
    }

    public static int longestSubArrayEqualZeroAndOne3(int [] arr){  //GFG efficient using longest subArraywith given sum
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                arr[i]=-1;
            }
        }
        return longestSubArrayWithGivenSum1(arr,0);
    }

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

    public static void main(String [] args){
        int [] arr={1,0,1,1,1,0,0};

        System.out.println(longestSubArrayEqualZeroAndOne2(arr));

        System.out.println(longestSubArrayEqualZeroAndOne3(arr));
    }
}
