package GFG;

import java.awt.*;
import java.util.HashSet;

public class SubArrayWithZeroSum {
    public static Point subArrayWithZeroSum1(int [] arr){  //GFG Naive solution
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum==0){
                    System.out.println("subArray with zero sum present");
                    return new Point(i,j);
                }
            }
        }
        return null;
    }

    public static boolean subArrayWithZeroSum2(int [] arr){ //GFG efficient
        HashSet<Integer> h= new HashSet<>();
        int preSum=0;
        for(int i=0;i<arr.length;i++){
            preSum+=arr[i];
            if(h.contains(preSum)){
                return true;
            }
            if(preSum==0){
                return true;
            }
            h.add(preSum);
        }
        return false;
    }


    public static void main(String [] args){
        int [ ] arr={4,-3,2,1};


        System.out.println(subArrayWithZeroSum1(arr));

        System.out.println(subArrayWithZeroSum2(arr));
    }
}
