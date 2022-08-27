package GFG;
import java.util.*;

public class PairWithGivenSum {
    public static boolean pairGivenSum1(int [] arr, int sum){
        HashSet<Integer> h = new HashSet<>();
        for(int i:arr) {
            if(h.contains(sum-i)){
                return true;
            }else{
                h.add(i);
            }
        }
        return false;
    }

    public static boolean pairGivenSum2(int [] arr, int sum){ //GFG Naive
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
               if(arr[i]+arr[j]==sum){
                   return true;
               }
            }
        }
        return false;
    }

    public static void main(String [] args){
        int [] arr={2,1,6,3};

        System.out.println(pairGivenSum1(arr,6));

        System.out.println(pairGivenSum2(arr,6));

    }
}
