package GFG;
import java.util.*;

public class CountDistinctInEveryWindow {
    public static void countDistinctInWindow1(int [] arr, int k){  //MyCode

     ArrayList<HashSet<Integer>> a= new ArrayList<HashSet<Integer>>();
     //HashSet<Integer>  res= new HashSet<>();
     int window=arr.length-k+1;
     for(int i=0;i<window;i++){
         a.add(new HashSet<Integer>());
     }
     for(int i=0;i<window;i++){
         for(int j=i;j<i+k;j++){
             a.get(i).add(arr[j]);
         }
         System.out.print(a.get(i).size()+" ");
         //res.add(a.get(i).size());
     }
        //System.out.println(res);
        System.out.println();
    }

    public static void countDistinctInWindow2(int [] arr, int k){  //GFG Naive
        int window=arr.length-k+1;
        for(int i=0;i<window;i++){
            int count=0;
            for(int j=0;j<k;j++){
                boolean flag=false;
                for(int p=0;p<j;p++){
                    if(arr[i+j]==arr[i+p]){
                        flag=true;
                    }
                }
                if(flag==false){
                    count++;
                }
            }
            System.out.print(count+" ");
        }
        System.out.println( );
    }

    /*public static void countDistinctInWindow3(int [] arr, int k){  //GFG Efficient

    }*/

    public static void main(String [] args){
        int [] arr1={10,20,20,10,30,40,10};
        int [] arr2={10,10,10,10};
        int [] arr3={10,20,30,40};

        countDistinctInWindow1(arr1,4);
        countDistinctInWindow1(arr2,3);
        countDistinctInWindow1(arr3,3);

        countDistinctInWindow2(arr1,4);
        countDistinctInWindow2(arr2,3);
        countDistinctInWindow2(arr3,3);
    }
}
