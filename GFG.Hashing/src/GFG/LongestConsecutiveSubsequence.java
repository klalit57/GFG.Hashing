package GFG;
import java.util.*;

public class LongestConsecutiveSubsequence {
    public static int longestConsecutiveSubsequence1(int [] arr){  //MyCode
        HashSet<Integer> h= new HashSet<>();
          int max=Integer.MIN_VALUE;
          for(int i:arr){
              h.add(i);
              max=Math.max(max,i);
          }
        int res=0;
          int temp=0;
          for(int i=0;i<=max;i++){
             if(h.contains(i)){
                 temp++;
                 res=Math.max(res,temp);
             }else{
                 temp=0;
             }
          }
        return res;
    }

    public static int longestConsecutiveSubsequence2(int [] arr){  //GFG Naive
        Arrays.sort(arr);
        int res=1;
        int curr=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]+1){
                curr++;
            }
            else if(arr[i]!=arr[i-1]){
                res=Math.max(res,curr);
                curr=1;
            }
        }
        return Math.max(res,curr);
    }

    public static int longestConsecutiveSubsequence3(int [] arr){   //GFG Efficient
        HashSet<Integer> h =new HashSet<>();
        for(int i:arr){
            h.add(i);
        }
        int res=1;
        for(Integer x:h){
            if(h.contains(x-1)==false){
                int curr=1;
                while(h.contains(x+curr)){
                    curr++;
                }
                res=Math.max(res,curr);
            }
        }
        return res;
    }

    public static void main(String [] args){
        int [] arr1={1,9,3,4,2,20};
        int [] arr2={8,20,7,30};
        int [] arr3={20,30,40};
        System.out.println(longestConsecutiveSubsequence1(arr1));
        System.out.println(longestConsecutiveSubsequence1(arr2));
        System.out.println(longestConsecutiveSubsequence1(arr3));

        System.out.println(longestConsecutiveSubsequence2(arr1));
        System.out.println(longestConsecutiveSubsequence2(arr2));
        System.out.println(longestConsecutiveSubsequence2(arr3));

        System.out.println(longestConsecutiveSubsequence3(arr1));
        System.out.println(longestConsecutiveSubsequence3(arr2));
        System.out.println(longestConsecutiveSubsequence3(arr3));
    }
}
