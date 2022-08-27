package GFG;

import java.util.HashSet;

public class SubArrayWithGivenSum {
    public static boolean subArrayWithGivenSum1(int [] arr, int sum){   //MyCode & GFG efficient
        HashSet<Integer> h= new HashSet<>();
        int preSum=0;
        for(int i=0;i<arr.length;i++){
            preSum+=arr[i];
            if(h.contains(preSum-sum)){
                return true;
            }
            if(preSum==sum){
                return true;
            }
            h.add(preSum);
        }
        return false;
    }

    public static boolean subArrayWithGivenSum2(int [] arr, int sum){  //GFG Naive
        for(int i=0;i<arr.length;i++){
            int temp=0;
            for(int j=i;j<arr.length;j++){
                temp+=arr[j];
                if(temp==sum){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String [] args){
        int [] arr={5,8,6,13};
        System.out.println(subArrayWithGivenSum2(arr,14));

        System.out.println(subArrayWithGivenSum1(arr,14));
    }
}
